package com.girldevelopit.kc.menu;

import java.util.Arrays;

/**
 * Represents the result of a recipe
 * Created by michelle on 2/3/14.
 */
public class Food {

    private String name;
    private String description;

    public Food(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}
