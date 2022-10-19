package com.example.project.stocks.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
//check data types
public class StockDetails {
    // Validate data like date need to be in Date format etc
    private String quarter;
    private String stock;
    private String date;
    private String open;
    private String high;
    private String low;
    private String close;
    private String volume;
    private String percentChangePrice;
    private String percentChangeVolumeOverLastWk;
    private String previousWeeksVolume;
    private String nextWeeksOpen;
    private String nextWeeksClose;
    private String percentChangeNextWeeksPrice;
    private String daysToNextDividend;
    private String percentReturnNextDividend;
}