package com.test_project.havriushenko.stockAgregator.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Data
public class QuoteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(length = 100)
    private String symbol;
    @Column(length = 200)
    private String companyName;
    @Column(length = 200)
    private String calculationPrice;
    @Column
    private double open;
    @Column
    private BigInteger openTime;
    @Column(length = 200)
    private String openSource;
    @Column
    private double close;
    @Column
    private double closeTime;
    @Column(length = 200)
    private String closeSource;
    @Column
    private double high;
    @Column
    private BigInteger highTime;
    @Column(length = 500)
    private String highSource;
    @Column
    private double low;
    @Column
    private BigInteger lowTime;
    @Column(length = 500)
    private String lowSource;
    @Column
    private int latestPrice;
    @Column(length = 100)
    private String latestSource;
    @Column(length = 200)
    private String latestTime;
    @Column
    private BigInteger latestUpdate;
    @Column
    private int latestVolume;
    @Column(length = 200)
    private String iexRealtimePrice;
    @Column(length = 200)
    private String iexRealtimeSize;
    @Column(length = 200)
    private String iexLastUpdated;
    @Column(length = 200)
    private String primaryExchange;
    @Column
    private double delayedPrice;
    @Column
    private BigInteger delayedPriceTime;
    @Column
    private double oddLotDelayedPrice;
    @Column
    private BigInteger oddLotDelayedPriceTime;
    @Column
    private double extendedPrice;
    @Column
    private int extendedChange;
    @Column
    private int extendedChangePercent;
    @Column
    private BigInteger extendedPriceTime;
    @Column
    private double previousClose;
    @Column
    private int previousVolume;
    @Column
    private double change;
    @Column
    private double changePercent;
    @Column
    private int volume;
    @Column
    private double iexMarketPercent;
    @Column
    private double iexVolume;
    @Column
    private int avgTotalVolume;
    @Column
    private double iexBidPrice;
    @Column
    private double iexBidSize;
    @Column
    private double iexAskPrice;
    @Column
    private double iexAskSize;
    @Column
    private double iexOpen;
    @Column
    private double iexOpenTime;
    @Column
    private double iexClose;
    @Column
    private BigInteger iexCloseTime;
    @Column
    private BigInteger marketCap;
    @Column
    private double peRatio;
    @Column
    private double week52High;
    @Column
    private double week52Low;
    @Column
    private double ytdChange;
    @Column
    private double lastTradeTime;
    @Column
    private boolean isUSMarketOpen;
}
