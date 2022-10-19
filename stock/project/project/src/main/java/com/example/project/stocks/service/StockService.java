package com.example.project.stocks.service;

import com.example.project.stocks.model.StockDetails;

import java.util.List;

public interface StockService {
    //  StockDetails
    public String addStockByStockTicker(StockDetails addStockDetails);

    public String batchUpdateStockByStockTicker(List<StockDetails> addStockDetailsList);

    StockDetails findStockByStockTicker(String stockTickerFilter);

}
