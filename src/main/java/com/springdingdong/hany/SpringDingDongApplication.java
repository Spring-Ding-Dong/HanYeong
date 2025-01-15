package com.springdingdong.hany;


import com.springdingdong.hany.assignment1.Stock;
import com.springdingdong.hany.assignment1.StockInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDingDongApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDingDongApplication.class, args);
        Stock stock = new Stock();

        stock.PrintStockInfo("005390","프디아우라");
        stock.PrintCountry();
        System.out.println(StockInterface.COUNTRY);

    }

}
