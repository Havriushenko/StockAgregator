package com.test_project.havriushenko.stockAgregator.repository;

import com.test_project.havriushenko.stockAgregator.model.QuoteModel;
import org.hibernate.annotations.NamedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


public interface QuoteRepository extends JpaRepository<QuoteModel, Integer> {

    Optional<QuoteModel> findBySymbol(String symbol);

    @Query(value = "Select * from quote order by previous_volume limit 5",nativeQuery = true)
    List<QuoteModel> findAllOrderByLatestPriceTopFive();
}