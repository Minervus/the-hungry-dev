package com.tonys.thehungrydev;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

public class StartersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        ListView startersList = findViewById(R.id.list_view_starters);

        String[] starterDishes = {
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

    }
}