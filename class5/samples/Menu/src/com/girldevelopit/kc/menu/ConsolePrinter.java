package com.girldevelopit.kc.menu;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Prints a menu to the console using System.out
 *
 * Created by michelle on 2/8/14.
 */
public class ConsolePrinter implements MenuPrinter {

    public void print(Menu menu) {
        System.out.println(menu.getName());

        List<Item> menuItems = menu.getItems();

        //Reorder the list by the type of menu item so that they are grouped
        Collections.sort(menuItems, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return o1.getType().compareTo(o2.getType());
            }
        });

        //Go over each menu item now that they are sorted by type.
        //If I encounter a new type, I print the type name and double space it
        ItemType type = null;
        for(Item item : menuItems) {
            if(type != item.getType()) {
                System.out.println();
                System.out.println(item.getType().name());
                System.out.println();
            }

            //The price is in cents, so we need to format it as dollars
            String formattedPrice = formatPrice(item.getPrice());
            System.out.println(item.getName() + '\t' + formattedPrice);
            System.out.println(item.getDescription());
            System.out.println();

            type = item.getType();
        }

    }

    /**
     * Given a value in cents, returns the formatted string in dollars
     * @param price in cents
     * @return a string formatted as "$xx.xx"
     */
    private String formatPrice(int price) {
        String formattedPrice = "$";

        //Get the dollar amount by dividing by 100
        formattedPrice += Integer.toString(price/100);
        formattedPrice += ".";

        //Get the cents amount by getting the remainder using mod
        formattedPrice += Integer.toString(price%100);
        return formattedPrice;
    }
}
