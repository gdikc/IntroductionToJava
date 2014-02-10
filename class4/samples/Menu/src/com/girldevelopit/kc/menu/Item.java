package com.girldevelopit.kc.menu;

/**
 * Represents a food item that is going on a menu.  Items have type and cost.
 *
 * Created by michelle on 2/3/14.
 */
public class Item extends Food {
    private int price;
    private ItemType type;

    public Item(String name, String description, ItemType type, int price) {
        super(name, description);
        this.price = price;
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public ItemType getType() {
        return type;
    }
}
