package com.switchfully;

public class StockService {

    private StockRepository stockRepository;

    public StockService() {
        this.stockRepository = new StockRepository();
    }

    public Stock getStock(String stockId) {
        if (stockRepository.getStockInformation(stockId) != null) {
            return stockRepository.getStockInformation(stockId);
        } else{
            throw new IllegalArgumentException();
        }


    }
}
