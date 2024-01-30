package com.company;
import java.util.ArrayList;
import java.util.List;
public class Book {
    private List<Recipe> recipes;

    public Book() {
        recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }
}
