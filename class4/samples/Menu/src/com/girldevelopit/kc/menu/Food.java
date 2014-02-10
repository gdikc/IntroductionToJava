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
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Food food = (Food) o;

        if (description != null ? !description.equals(food.description) : food.description != null) return false;
         if (name != null ? !name.equals(food.name) : food.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
