package com.test_project.havriushenko.stockAgregator.entity;

import lombok.Data;

@Data
public class Symbol {

    private String symbol;
    private String exchange;
    private String name;
    private boolean isEnabled;
    private String type;
    private String region;
    private String currency;
    private String iexId;
    private String figi;
    private String cik;
}
