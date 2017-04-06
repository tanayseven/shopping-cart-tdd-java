package com.shoppingcart;


import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private int totalCost = 0;
    private Map<String, Integer> items = new HashMap<>();

    public int totalItems() {
        return items.size();
    }

    public void addItem(String item, int cost) {
        items.put(item, cost);
        totalCost += cost;
    }

    public void removeItem(String item) {
        items.remove(item);
    }

    public int totalCost() {
        int totalCost = 0;
        for (String itemName: items.keySet()
             ) {
            totalCost += items.get(itemName);
        }
        return totalCost;
    }
}
