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
        setContentView(R.layout.activity_starters);

        ListView startersList = findViewById(R.id.list_view_starters);

        Dish dishOne = new Dish("Bruschetta", "Classic Italian appetizer that is easy to make at home. Toasted bread is topped with tomatoes", 30);

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

        ArrayAdapter<String> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);

        startersList.setAdapter(dishesAdapter);
    }
}