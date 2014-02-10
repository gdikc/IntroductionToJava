package com.girldevelopit.kc.menu;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a restaurant menu
 *
 * Created by michelle on 2/8/14.
 */
public class Menu {
    private List<Item> items;

    private String name;

    public Menu(String name) {
        this.name = name;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public String getName() {
        return name;
    }
}
