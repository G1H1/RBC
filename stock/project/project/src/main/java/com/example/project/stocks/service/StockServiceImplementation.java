package com.example.project.stocks.service;

import com.example.project.stocks.model.StockDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

@Service
@Slf4j
public class StockServiceImplementation implements StockService {

    HashSet<StockDetails> stockDetails = new HashSet<StockDetails>();

    @Override
    public String addStockByStockTicker(StockDetails addStockDetails) {
        //Handle duplicates, valid data and Exceptions
        log.info("Successful connection with database");
        stockDetails.add(addStockDetails);
        log.info("Successful data inserted from database");
        return "Success";
    }

    public String batchUpdateStockByStockTicker(List<StockDetails> addStockDetailsList) {
        //Handle duplicates, valid data and Exceptions
        log.info("Successful connection with database");
        addStockDetailsList.forEach(value -> stockDetails.add(value));
        log.info("Successful data inserted from database");
        return "Success";
    }

    @Override
    public StockDetails findStockByStockTicker(String stockTickerFilter) {
        log.info("Successful connection with database");
        StockDetails filteredStockDetails = stockDetails.stream()
                .filter(
                        a -> a.getStock().equals(stockTickerFilter))
                .findAny().
                orElse(null);
        log.info("Successful data is fetched from database");

        return filteredStockDetails;
    }

}
