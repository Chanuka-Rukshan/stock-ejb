package lk.jiat.bcd.stock;

import jakarta.ejb.Remote;

@Remote
public interface StockService {
    int getStock(String product);
}
