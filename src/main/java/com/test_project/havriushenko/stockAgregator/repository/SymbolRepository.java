package com.test_project.havriushenko.stockAgregator.repository;

import com.test_project.havriushenko.stockAgregator.entity.Symbol;
import com.test_project.havriushenko.stockAgregator.model.QuoteModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import static com.test_project.havriushenko.stockAgregator.utils.Constants.*;

@FeignClient(name = "symbolRepository", url = URL_API)
public interface SymbolRepository {

    @RequestMapping(method = RequestMethod.GET, value = URL_GET_SYMBOLS_WITH_TOKEN)
    List<Symbol> getSymbols();

    @RequestMapping(method = RequestMethod.GET, value = "stable/stock/{symbol}/quote?" + TOKEN_PARAMETER)
    QuoteModel getQuote(@PathVariable(value = "symbol") String symbol);

}
