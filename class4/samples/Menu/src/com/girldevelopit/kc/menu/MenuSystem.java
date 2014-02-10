package com.girldevelopit.kc.menu;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Represents a single menu system.
 *
 * Created by michelle on 2/8/14.
 */
public class MenuSystem {

    public static void main(String args[]) {
        MenuSystem myMenus = new MenuSystem();

        MenuPrinter printer = new ConsolePrinter();

        //Create all of our menus
        TemporalMenu valentinesMenu = myMenus.createValentinesMenu;
        TemporalMenu breakfastMenu = myMenus.createBreakfastMenu();
        Menu regularMenu = myMenus.createMenu();

        //Create an object that represents the current time
        Calendar now = new GregorianCalendar();

        //If the menu is currently valid, print it.
        if(breakfastMenu.isValid(now))
            printer.print(breakfastMenu);

        if(valentinesMenu.isValid(now))
            printer.print(valentinesMenu);

        //The regular menu is always valid
        printer.print(regularMenu);

    }

    private TemporalMenu createBreakfastMenu() {

        //Create a range for our breakfast hours
        HourRange breakfastHours = new HourRange(5, 11);

        //Create a menu only available during breakfast
        TemporalMenu menu = new TemporalMenu("Breakfast", breakfastHours);

        //Add breakfast items to the menu
        menu.addItem(new Item("Farm Platter", "3 eggs any style, 2 pieces of bacon, and a biscuit", ItemType.ENTREE, 599));
        menu.addItem(new Item("Granola Oatmeal", "A healthy portion of oatmeal with nuts, grains, and fruit", ItemType.ENTREE, 399));
        menu.addItem(new Item("Denver Omelette", "A 3-egg omelette with cheese, ham, green peppers, and onions", ItemType.ENTREE, 499));
        menu.addItem(new Item("Coffee", "Freshly ground and brewed Colombian coffee", ItemType.BEVERAGE, 199));
        menu.addItem(new Item("Breakfast Potatoes", "Roasted potatoes with peppers and onions", ItemType.SIDE, 199));

        return menu;
    }

    private TemporalMenu createValentinesMenu() {
        //Create a date range that covers Valentine's Day

        Calendar start = new GregorianCalendar();
        start.set(2014, Calendar.FEBRUARY, 14);

        Calendar end = new GregorianCalendar();
        end.set(2014, Calendar.FEBRUARY, 14, 23, 59, 59);

        DateRange valentinesDay = new DateRange(start, end);

        //Create a menu that is only available on Valentine's Day
        TemporalMenu menu = new TemporalMenu("Valentine's Day");

        //Add the special menu items
        menu.addItem(new Item("Calamari", "Lightly battered and fried rings of squid", ItemType.APPETIZER, 1099));
        menu.addItem(new Item("Seared Salmon", "Salmon seared and then served with quinoa salad", ItemType.ENTREE, 1599));
        menu.addItem(new Item("Strawberry Custard with Beignets", "Freshly prepared beignets served with a strawberry custard", ItemType.DESSERT, 499));

        return menu;
    }

    private Menu createMenu() {
        //Create a menu that is always available
        Menu menu = new Menu("Standard");

        //Add our regular menu items
        menu.addItem(new Item("Chicken Wings", "12 buffalo wings with ranch and celery", ItemType.APPETIZER, 899));
        menu.addItem(new Item("Nachos", "Nachos with cheese, beef, sour cream, and salsa", ItemType.APPETIZER, 799));
        menu.addItem(new Item("Calamari", "Lightly battered and fried rings of squid", ItemType.APPETIZER, 1099));

        menu.addItem(new Item("BBQ Burger", "Cheeseburger with BBQ sauce and onion strings, served with fries", ItemType.ENTREE, 1099));
        menu.addItem(new Item("Grilled Chicken Platter", "Grilled chicken served with mashed potatoes and seasonal vegetables", ItemType.ENTREE, 1199));
        menu.addItem(new Item("Meat Pizza", "3 cheese, 4 meat pizza", ItemType.ENTREE, 1099));

        menu.addItem(new Item("Chocolate Cake", "Fresh baked chocolate cake with vanilla icing", ItemType.DESSERT, 599));
        menu.addItem(new Item("Cookie Sundae", "Chocolate chip cookie with vanilla ice cream", ItemType.DESSERT, 399));
        menu.addItem(new Item("Cheesecake", "New York style cheesecake", ItemType.DESSERT, 599));

        return menu;

    }
}
