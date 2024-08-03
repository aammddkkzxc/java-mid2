package collection.list.test;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Item> items = new ArrayList<>();

    public void addItem(Item item1) {
        items.add(item1);
    }

    public void displayItems() {
        for (Item item : items) {
            System.out.println(item.getName() + " : " + item.getTotalPrice());
        }
    }
}
