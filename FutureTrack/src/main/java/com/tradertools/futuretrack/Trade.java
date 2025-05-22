package com.tradertools.futuretrack;

import java.time.LocalDate;

public abstract class Trade {
    private final FuturesContract contract;
    private final int quantity;
    private final double entryPrice;
    private final double exitPrice;
    private final LocalDate date;

    public Trade(FuturesContract contract, int quantity, double entryPrice,
                 double exitPrice, LocalDate date) {
        this.contract = contract;
        this.quantity = quantity;
        this.entryPrice = entryPrice;
        this.exitPrice = exitPrice;
        this.date = date;
    }

    public FuturesContract getContract() {
        return contract;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getEntryPrice() {
        return entryPrice;
    }

    public double getExitPrice() {
        return exitPrice;
    }

    public LocalDate getDate() {
        return date;
    }

    public abstract double calculatePnL();

    public abstract double calculateCommission();

    protected double getPriceDifference() {
        return exitPrice - entryPrice;
    }

    @Override
    public String toString() {
        return String.format("%s Trade: %s x%d @ %.2f -> %.2f on %s",
                getClass().getSimpleName(),
                contract.getSymbol(),
                quantity,
                entryPrice,
                exitPrice,
                date);
    }
}
