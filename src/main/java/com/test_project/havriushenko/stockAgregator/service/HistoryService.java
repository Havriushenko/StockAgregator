package com.test_project.havriushenko.stockAgregator.service;

import com.test_project.havriushenko.stockAgregator.model.HistoryModel;
import com.test_project.havriushenko.stockAgregator.model.QuoteModel;
import com.test_project.havriushenko.stockAgregator.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class HistoryService {

    @Autowired
    private HistoryRepository historyRepository;

    public void comparisonQuote(QuoteModel updateQuote, QuoteModel quoteModel) {
        Map<String, Object> newQuoteMap = setQuoteToMap(updateQuote);
        Map<String, Object> quoteModelMap = setQuoteToMap(quoteModel);
        newQuoteMap.forEach((key, value) -> {
            if (!quoteModelMap.get(key).equals(value)) {
                HistoryModel historyModel = new HistoryModel();
                historyModel.setFieldName(key);
                historyModel.setLastChange(String.valueOf(quoteModelMap.get(key)));
                historyModel.setNewChange(String.valueOf(value));
                historyModel.setIdCompany(quoteModel.getId());
                historyRepository.save(historyModel);
            }
        });
    }

    private Map<String, Object> setQuoteToMap(QuoteModel quote) {
        Map<String, Object> quoteMap = new HashMap<String, Object>();
        quoteMap.put("symbol", quote.getSymbol());
        quoteMap.put("companyName", quote.getCompanyName());
        quoteMap.put("calculationPrice", quote.getCalculationPrice());
        quoteMap.put("open", quote.getOpen());
        quoteMap.put("openTime", quote.getOpenTime());
        quoteMap.put("openSource", quote.getOpenSource());
        quoteMap.put("close", quote.getClose());
        quoteMap.put("closeTime", quote.getCloseTime());
        quoteMap.put("closeSource", quote.getCloseSource());
        quoteMap.put("high", quote.getHigh());
        quoteMap.put("highTime", quote.getHighTime());
        quoteMap.put("highSource", quote.getHighSource());
        quoteMap.put("low", quote.getLow());
        quoteMap.put("lowTime", quote.getLowTime());
        quoteMap.put("lowSource", quote.getLowSource());
        quoteMap.put("latestPrice", quote.getLatestPrice());
        quoteMap.put("latestSource", quote.getLatestSource());
        quoteMap.put("latestTime", quote.getLatestTime());
        quoteMap.put("latestUpdate", quote.getLatestUpdate());
        quoteMap.put("latestVolume", quote.getLatestVolume());
        quoteMap.put("iexRealtimePrice", quote.getIexRealtimePrice());
        quoteMap.put("iexRealtimeSize", quote.getIexRealtimeSize());
        quoteMap.put("iexLastUpdated", quote.getIexLastUpdated());
        quoteMap.put("primaryExchange", quote.getPrimaryExchange());
        quoteMap.put("delayedPrice", quote.getDelayedPrice());
        quoteMap.put("delayedPriceTime", quote.getDelayedPrice());
        quoteMap.put("oddLotDelayedPrice", quote.getOddLotDelayedPrice());
        quoteMap.put("oddLotDelayedPriceTime", quote.getOddLotDelayedPriceTime());
        quoteMap.put("extendedPrice", quote.getExtendedPrice());
        quoteMap.put("extendedChange", quote.getExtendedChange());
        quoteMap.put("extendedChangePercent", quote.getExtendedChangePercent());
        quoteMap.put("extendedPriceTime", quote.getExtendedPriceTime());
        quoteMap.put("previousClose", quote.getPreviousClose());
        quoteMap.put("previousVolume", quote.getPreviousVolume());
        quoteMap.put("change", quote.getChange());
        quoteMap.put("changePercent", quote.getChangePercent());
        quoteMap.put("volume", quote.getVolume());
        quoteMap.put("iexMarketPercent", quote.getIexMarketPercent());
        quoteMap.put("iexVolume", quote.getIexVolume());
        quoteMap.put("avgTotalVolume", quote.getAvgTotalVolume());
        quoteMap.put("iexBidPrice", quote.getIexBidPrice());
        quoteMap.put("iexBidSize", quote.getIexBidSize());
        quoteMap.put("iexAskPrice", quote.getIexAskPrice());
        quoteMap.put("iexAskSize", quote.getIexAskSize());
        quoteMap.put("iexOpen", quote.getIexOpen());
        quoteMap.put("iexOpenTime", quote.getIexOpen());
        quoteMap.put("iexClose", quote.getIexClose());
        quoteMap.put("iexCloseTime", quote.getIexCloseTime());
        quoteMap.put("marketCap", quote.getMarketCap());
        quoteMap.put("peRatio", quote.getPeRatio());
        quoteMap.put("week52High", quote.getWeek52High());
        quoteMap.put("week52Low", quote.getWeek52Low());
        quoteMap.put("ytdChange", quote.getYtdChange());
        quoteMap.put("lastTradeTime", quote.getLastTradeTime());
        quoteMap.put("isUSMarketOpen", quote.isUSMarketOpen());

        return quoteMap;
    }
}
