package com.test_project.havriushenko.stockAgregator.service;

import com.test_project.havriushenko.stockAgregator.entity.Symbol;
import com.test_project.havriushenko.stockAgregator.model.QuoteModel;
import com.test_project.havriushenko.stockAgregator.repository.QuoteRepository;
import com.test_project.havriushenko.stockAgregator.repository.SymbolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
public class Runner {

    @Autowired
    private SymbolRepository symbolRepository;
    @Autowired
    private QuoteRepository quoteRepository;

    public void run() throws InterruptedException {
        List<Symbol> symbols = symbolRepository.getSymbols();
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        symbols.stream().limit(10).forEach(value -> executorService.submit(() -> {
            QuoteModel quote = symbolRepository.getQuote(value.getSymbol());
            quoteRepository.save(quote);
        }));
        executorService.shutdown();
    }
}
