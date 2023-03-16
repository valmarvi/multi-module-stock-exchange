package com.switchfully;

import java.util.HashMap;
import java.util.Map;

public class StockRepository {
    Map<String,Stock> stocks;

    public StockRepository() {
        this.stocks = new HashMap<>();
        stocks.put("AA", new Stock("AA", "Ambro AO"));
        stocks.put("AB", new Stock("AB", "Lomba LA"));
        stocks.put("AC", new Stock("AC", "Sirra SA"));
        stocks.put("AD", new Stock("AD", "Comra CA"));
        stocks.put("AE", new Stock("AE", "Trilo TO"));
    }

    public Stock getStockInformation(String stockId) {
        return stocks.entrySet()
                .stream()
                .filter(stock -> stock.getKey().equals(stockId))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new)
                .getValue();
    }
}
