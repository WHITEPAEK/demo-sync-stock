package com.example.stock.transaction;

import com.example.stock.service.StockService;

public class TransactionStockService {

    private StockService stockService;

    public TransactionStockService(StockService stockService) {
        this.stockService = stockService;
    }

    public void decrease(Long id, Long quantity) {
        startTransaction();
        stockService.decrease(id, quantity);
        endTransaction();
    }

    private void startTransaction() {
        // Transaction Start
    }

    private void endTransaction() {
        // Commit
    }

}
