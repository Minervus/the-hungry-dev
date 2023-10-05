package com.tonys.thehungrydev;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StartersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // connects the view for this activity to the activity_starters.xml
        setContentView(R.layout.activity_starters);

        // ListView for the startersList is connected to the list_view_starters from the activity_starters.xml
        ListView startersList = findViewById(R.id.list_view_starters);

        // Array with embedded constructors - creates an array and object instances inside it in one line of code
        Dish[] dishes = {
                new Dish("Bruschetta", "Classic Italian appetizer that is easy to make at home. Toasted bread is topped with tomatoes", 30),
                new Dish("Melon and lemon soup", "Fresh melon and lemon combined into creamy soup", 1199),
                new Dish("Coconut and chocolate mousse", "A creamy mousse made with fresh coconut and milk chocolate", 899),
                new Dish("Spinach and cabbage wontons", "Thin wonton cases stuffed with fresh spinach and chinese cabbage", 799),
                new Dish("Broccoli and cucumber soup", "Fresh broccoli and cucumber combined into creamy soup", 899),
                new Dish("Chilli and aubergine dip", "A dip made from scotch bonnet chilli and fresh aubergine", 999),
                new Dish("Chickpea and chilli gyoza", "Thin pastry cases stuffed with fresh chickpea and green chilli", 699),
                new Dish("Sprout and pineapple soup", "Fresh sprout and pineapple combined into creamy soup", 899),
                new Dish("Egusi and borscht soup", "Egusi and borscht combined into creamy soup", 1299)
        };

        /*
        String[] dishes = {
                "Bruschetta",
                "Caprese Salad",
                "Caesar Salad",
                "Spinach and Artichoke Dip",
                "Shrimp Cocktail",
                "Stuffed Mushrooms",
                "Vegetable Spring Rolls",
                "Chicken Satay",
                "Calamari",
                "Potato Skins",
                "Crab Cakes",
                "Gazpacho",
                "Greek Salad",
                "Prosciutto-wrapped Asparagus",
                "Deviled Eggs",
                "Tomato Bisque",
                "French Onion Soup",
                "Guacamole",
                "Hummus",
                "Clam Chowder"
        };
        */

        // Binds an array to a UI component - the array is the 'dishes'  array above
        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);

        // This line connects the startersList 'ListView' to the dishesAdapter in the line above
        startersList.setAdapter(dishesAdapter);
    }
}