package lk.jiat.bcd.stock;

import java.util.HashMap;
import java.util.Map;

public class StockBeen implements StockService {

    private Map<String,Integer> stock = new HashMap<>();

    public StockBeen(){
        stock.put("Apple",25);
        stock.put("Orange",7);
        stock.put("Mango",7);
        stock.put("Peach",10);
        stock.put("Pineapple",18);
    }

    @Override
    public int getStock(String product) {
        return stock.getOrDefault(product,0);
    }
}
