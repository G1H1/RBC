package com.example.project.stocks.controller;

import com.example.project.stocks.model.StockDetails;
import com.example.project.stocks.service.StockServiceImplementation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@RestController
@Slf4j
public class StockController {

    @Autowired
    StockServiceImplementation stockServiceImplementation;

    @GetMapping("/status")
    @Produces({MediaType.APPLICATION_JSON})
    public String hello() {
        return "Welcome to our Service";
    }

    @PostMapping("/addIndividual")
    @Produces({MediaType.APPLICATION_JSON})
    public Response addStockByStockTickerDetails(@RequestBody StockDetails stockDetails) {
        if (stockServiceImplementation.addStockByStockTicker(stockDetails).equals("Success")) {

            log.info("Insert is successful");
            return Response
                    .status(Response.Status.OK)
                    .entity("Insert is successful")
                    .build();
        }
        return Response
                .status(Response.Status.OK)
                .entity("Insert is not successful")
                .build();

    }

    @PostMapping("/batchUpload")
    @Produces({MediaType.APPLICATION_JSON})
    public Response batchUpdateStockByStockTickerDetails(@RequestBody List<StockDetails> stockDetailsList) {

        if (stockServiceImplementation.batchUpdateStockByStockTicker(stockDetailsList).equals("Success")) {

            log.info("Batch is successful");
            return Response
                    .status(Response.Status.OK)
                    .entity("Batch is successful")
                    .build();
        }

        log.info("Batch is not successful for " + stockDetailsList);
        return Response
                .status(Response.Status.OK)
                .entity("Batch is not successful")
                .build();
    }

    @GetMapping("/find/{stockTickerFilter}")
    @Produces({MediaType.APPLICATION_JSON})
    public StockDetails findStockByStockTickerDetails(@PathVariable String stockTickerFilter) {
        log.info("Search on stock ticker " + stockTickerFilter);
        return stockServiceImplementation.findStockByStockTicker(stockTickerFilter);
    }
}