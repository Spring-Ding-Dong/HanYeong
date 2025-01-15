package com.springdingdong.hany.assignment1;

public class Stock implements StockInterface {

    @Override
    public String PrintStockInfo(String ticker, String companyName) {
        System.out.println(ticker + " : " + companyName);
        return null;
    }
}
