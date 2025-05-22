package com.tradertools.futuretrack;

public abstract class FuturesContract {


    private final String symbol;
    private final double tickSize;
    private final double tickValue;
    private final int contractSize;
    private final String description;

    public FuturesContract(String symbol, double tickSize, double tickValue, int contractSize, String description) {
        this.symbol = symbol;
        this.tickSize = tickSize;
        this.tickValue = tickValue;
        this.contractSize = contractSize;
        this.description = description;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getTickSize() {
        return tickSize;
    }

    public double getTickValue() {
        return tickValue;
    }


    public int getContractSize() {
        return contractSize;
    }

    public String getDescription() {
        return description;
    }

    public abstract double calculateContractValue(double price);

    public abstract double calculatePriceChange(int ticks);

}

