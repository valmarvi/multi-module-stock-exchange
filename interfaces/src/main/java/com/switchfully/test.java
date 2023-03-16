package com.switchfully;

public class test {
    public static void main(String[] args) {
        ExternalStockInformationService e = new ExternalStockInformationService();

        System.out.println(e.getPriceInEuroForStock("a"));
    }
}
