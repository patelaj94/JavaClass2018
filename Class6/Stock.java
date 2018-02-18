package com.npljava;

public class Stock {
    String symbol;
    String companyName;
    double previousDayPrice;
    double currentPrice;

    public Stock(String symbol, String companyName, double previousDayPrice, double currentPrice) {
        this.symbol = symbol;
        this.companyName = companyName;
        this.previousDayPrice = previousDayPrice;
        this.currentPrice = currentPrice;
    }

    public void percentChangeInPrice(){
        double percentChange;
        percentChange = (this.currentPrice - this.previousDayPrice) / (this.previousDayPrice);
        System.out.println("Percent change: " + (percentChange*100) + "%");
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getPreviousDayPrice() {
        return previousDayPrice;
    }

    public void setPreviousDayPrice(double previousDayPrice) {
        this.previousDayPrice = previousDayPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
}
