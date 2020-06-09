package com.test_project.havriushenko.stockAgregator.service;

import com.test_project.havriushenko.stockAgregator.entity.Symbol;
import com.test_project.havriushenko.stockAgregator.model.QuoteModel;
import com.test_project.havriushenko.stockAgregator.repository.QuoteRepository;
import com.test_project.havriushenko.stockAgregator.repository.SymbolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Service
public class Runner {

    @Autowired
    private SymbolRepository symbolRepository;
    @Autowired
    private QuoteRepository quoteRepository;
    @Autowired
    private HistoryService historyService;

    public void run() throws InterruptedException {
        List<Symbol> symbols = symbolRepository.getSymbols();
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        symbols.forEach(value -> executorService.submit(() -> {
            QuoteModel quote = symbolRepository.getQuote(value.getSymbol());
            Optional<QuoteModel> quoteModel = quoteRepository.findBySymbol(quote.getSymbol());

            if (quoteModel.isPresent()) {
                historyService.comparisonQuote(quote, quoteModel.get());
                quote.setId(quoteModel.get().getId());
            }
            quoteRepository.save(quote);
        }));

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            StringBuilder top5 = new StringBuilder("TOP 5 Quote:");
            quoteRepository.findAllOrderByLatestPriceTopFive().forEach(quote -> {
                top5.append(printQuote(quote) + "\n");
            });
            System.out.println(top5);
        }, 30, 5, TimeUnit.SECONDS);
    }

    private String printQuote(QuoteModel quote) {
        return " " + quote + ",";
    }
}
