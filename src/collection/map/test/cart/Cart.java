package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> cartMap = new HashMap<>();


    public void add(Product product, int count) {
        cartMap.put(product, cartMap.getOrDefault(product, 0) + count);
    }

    public void printAll() {
        for (Map.Entry<Product, Integer> entry : cartMap.entrySet()) {
            System.out.println(entry.getKey().toString() + ": " + entry.getValue());
        }
    }

    public void minus(Product product, int count) {
        cartMap.put(product, cartMap.get(product) - count);
        if (cartMap.get(product) == 0) {
            cartMap.remove(product);
        }
    }
}
