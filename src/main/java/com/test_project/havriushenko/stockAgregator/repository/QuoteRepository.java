package com.test_project.havriushenko.stockAgregator.repository;

import com.test_project.havriushenko.stockAgregator.model.QuoteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
public class QuoteRepository {

    @Autowired
    private EntityManager entityManager;

    @Modifying
    @Transactional
    public synchronized void  save(QuoteModel quote) {
        try {
            System.out.println("save " + quote.getSymbol() + " threadId: " + Thread.currentThread().getId());
            entityManager.createNativeQuery("insert into quote (symbol,company_name,open,open_time,open_source,close) values(?,?,?,?,?,?);").
                    setParameter(1, quote.getSymbol()).
                    setParameter(2, quote.getCompanyName()).
                    setParameter(3, quote.getOpen()).
                    setParameter(4, quote.getOpenTime()).
                    setParameter(5, quote.getOpenSource()).
                    setParameter(6, quote.getClose()).executeUpdate();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
