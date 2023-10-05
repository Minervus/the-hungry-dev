package com.tonys.thehungrydev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.sql.Array;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class MainCoursesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_courses);

        ListView mainCoursesList = findViewById(R.id.list_view_main_courses);

        Dish[] mainCourses = {
                new Dish("Grilled Chicken Alfredo", "Tender chicken breast grilled to perfection, served over fettuccine pasta and topped with creamy Alfredo sauce", 1499),
                new Dish("Beef Wellington", "A classic British dish consisting of beef fillet steak coated with mushroom duxelles, then wrapped in puff pastry and baked", 2499),
                new Dish("Lemon Herb Salmon", "Fresh salmon fillet seasoned with lemon and herbs, grilled to perfection and served with a side of asparagus", 1899),
                new Dish("Vegetable Stir Fry", "A medley of fresh vegetables sautéed in a savory sauce, served over steamed jasmine rice", 1399),
                new Dish("Spaghetti Carbonara", "Classic Italian pasta dish made with egg, cheese, pancetta, and pepper", 1299),
                new Dish("Lamb Shank", "Slow-cooked lamb shank in a rich red wine sauce, served with mashed potatoes", 2199),
                new Dish("Chicken Tikka Masala", "Tender chicken pieces marinated in spices and yogurt, then baked and served in a creamy tomato sauce", 1699),
                new Dish("Vegan Tofu Steak", "Grilled tofu steak seasoned with herbs and spices, served with a side of mixed vegetables", 1399),
                new Dish("Pork Chop with Apple Sauce", "Juicy pork chop grilled to perfection, served with a tangy apple sauce and roasted potatoes", 1799)
        };

        // Array adapter of <type>
        // simple_list_item_1 is a ready made android layout
        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mainCourses);

        mainCoursesList.setAdapter(dishesAdapter);

    }
}