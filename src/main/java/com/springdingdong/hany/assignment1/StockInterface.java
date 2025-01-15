package com.springdingdong.hany.assignment1;

public interface StockInterface {
    String COUNTRY = "korea";

    String PrintStockInfo(String ticker, String companyName);

    default void PrintCountry(){
        System.out.println(COUNTRY);
    }
    // 변동률
    static double calculateChangeRate(double previousClose, double currentPrice) {
        return ((currentPrice - previousClose) / previousClose) * 100;
    }

}