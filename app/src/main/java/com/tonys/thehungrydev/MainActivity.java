package com.tonys.thehungrydev;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Adding card views to mainActivity so it can be accessed
    CardView startersCard;
    CardView mainsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startersCard = findViewById(R.id.card_view_starters); //Adding ability to find the card views onCreate
        mainsCard = findViewById(R.id.card_view_mains);

        startersCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create intent on what we want to do e.g. we want to go to the StartersActivity Class
                Intent startersActivityIntent = new Intent(MainActivity.this, StartersActivity.class);

                startActivity(startersActivityIntent); // Go to this activity
            }
        });

        // Add click listener for the 'Mains' card on the main activity
        mainsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent is 'what do you want to do?
                // This intent wants to send the user from here MainActivity.this to MainCoursesActivity.class
                Intent mainCoursesActivityIntent = new Intent(MainActivity.this, MainCoursesActivity.class);

                // We want to start the mainCoursesActivityIntent activity
                startActivity(mainCoursesActivityIntent);
            }
        });



    }
}