package com.example.homeworkassignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
//4 string arrays and 2 integer arrays
    String string1 [], string2[], string3[], string4[];
    int images[] = {R.drawable.chochosan, R.drawable.mejico, R.drawable.holybasil, R.drawable.thespiceroom,
    R.drawable.temasek, R.drawable.devon, R.drawable.jasmin, R.drawable.mcdonalds, R.drawable.helloauntie, R.drawable.bayvista,
    R.drawable.seabay, R.drawable.miles};
    int images2[] = {R.drawable.four, R.drawable.five, R.drawable.one, R.drawable.four, R.drawable.five, R.drawable.three, R.drawable.four,
            R.drawable.four, R.drawable.five, R.drawable.three, R.drawable.one, R.drawable.three};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //string1 used to store string array for restaurant name
        //string2 used to store string array for type of cuisine
        //string3 used to store string array for location of restaurant
        //string4 used to store string array for the cost of restaurant for 2 people
        string1 = getResources().getStringArray(R.array.restaurantname);
        string2 = getResources().getStringArray(R.array.cuisine);
        string3 = getResources().getStringArray(R.array.location);
        string4 = getResources().getStringArray(R.array.foodcost);



        RestaurantAdapter restaurantAdapter = new RestaurantAdapter(this, string1, string2, string3, string4, images, images2);
recyclerView.setAdapter(restaurantAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }



}
