package com.test_project.havriushenko.stockAgregator.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Data
@Table(name = "quote")
public class QuoteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "symbol", length = 100)
    private String symbol;
    @Column(name = "company_name", length = 200)
    private String companyName;
    @Column(name = "calculation_price", length = 200)
    private String calculationPrice;
    @Column(name = "open")
    private double open;
    @Column(name = "open_time")
    private Long openTime;
    @Column(name = "open_source", length = 200)
    private String openSource;
    @Column(name = "close")
    private double close;
    @Column(name = "close_time")
    private Long closeTime;
    @Column(name = "close_source", length = 200)
    private String closeSource;
    @Column(name = "high")
    private double high;
    @Column(name = "high_time")
    private Long highTime;
    @Column(name = "high_source", length = 500)
    private String highSource;
    @Column(name = "low")
    private double low;
    @Column(name = "low_time")
    private Long lowTime;
    @Column(name = "low_source", length = 500)
    private String lowSource;
    @Column(name = "latest_price")
    private int latestPrice;
    @Column(name = "latest_source", length = 100)
    private String latestSource;
    @Column(name = "latest_time", length = 200)
    private String latestTime;
    @Column(name = "latest_update")
    private BigInteger latestUpdate;
    @Column(name = "latest_volume")
    private int latestVolume;
    @Column(name = "iex_realtime_price", length = 200)
    private String iexRealtimePrice;
    @Column(name = "iex_realtime_size", length = 200)
    private String iexRealtimeSize;
    @Column(name = "iex_last_updated", length = 200)
    private String iexLastUpdated;
    @Column(name = "primary_exchange", length = 200)
    private String primaryExchange;
    @Column(name = "delayed_price")
    private double delayedPrice;
    @Column(name = "delayed_price_time")
    private Long delayedPriceTime;
    @Column(name = "odd_lot_delayed_price")
    private double oddLotDelayedPrice;
    @Column(name = "odd_lot_delayed_price_time")
    private Long oddLotDelayedPriceTime;
    @Column(name = "extended_price")
    private double extendedPrice;
    @Column(name = "extended_change")
    private int extendedChange;
    @Column(name = "extended_change_percent")
    private int extendedChangePercent;
    @Column(name = "extended_price_time")
    private Long extendedPriceTime;
    @Column(name = "previous_close")
    private double previousClose;
    @Column(name = "previous_volume")
    private int previousVolume;
    @Column(name = "change")
    private Double change;
    @Column(name = "change_percent")
    private double changePercent;
    @Column(name = "volume")
    private int volume;
    @Column(name = "iex_market_percent")
    private double iexMarketPercent;
    @Column(name = "iex_volume")
    private double iexVolume;
    @Column(name = "avg_total_volume")
    private int avgTotalVolume;
    @Column(name = "iex_bid_price")
    private double iexBidPrice;
    @Column(name = "iex_bid_size")
    private double iexBidSize;
    @Column(name = "iex_ask_price")
    private double iexAskPrice;
    @Column(name = "iex_ask_size")
    private double iexAskSize;
    @Column(name = "iex_open")
    private double iexOpen;
    @Column(name = "iex_open_time")
    private Long iexOpenTime;
    @Column(name = "iex_close")
    private double iexClose;
    @Column(name = "iex_close_time")
    private Long iexCloseTime;
    @Column(name = "market_cap")
    private BigInteger marketCap;
    @Column(name = "pe_ratio")
    private double peRatio;
    @Column(name = "week52_high")
    private double week52High;
    @Column(name = "week52_low")
    private double week52Low;
    @Column(name = "ytd_change")
    private double ytdChange;
    @Column(name = "last_trade_time")
    private Long lastTradeTime;
    @Column(name = "is_us_market_open")
    private boolean isUSMarketOpen;
}
