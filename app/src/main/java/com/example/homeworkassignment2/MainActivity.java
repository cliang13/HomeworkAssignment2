package com.example.homeworkassignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String string1 [], string2[], string3[];
    int images[] = {R.drawable.mcdonalds, R.drawable.mejico, R.drawable.holybasil, R.drawable.thespiceroom,
    R.drawable.temasek, R.drawable.devon, R.drawable.jasmin, R.drawable.chochosan, R.drawable.helloauntie, R.drawable.bayvista,
    R.drawable.seabay, R.drawable.miles};
    int images2[] = {R.drawable.stars, R.drawable.stars, R.drawable.stars, R.drawable.stars, R.drawable.stars, R.drawable.stars, R.drawable.stars,
            R.drawable.stars, R.drawable.stars, R.drawable.stars, R.drawable.stars, R.drawable.stars};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        string1 = getResources().getStringArray(R.array.restaurantname);
        string2 = getResources().getStringArray(R.array.cuisine);
        string3 = getResources().getStringArray(R.array.location);

        RestaurantAdapter restaurantAdapter = new RestaurantAdapter(this, string1, string2, string3, images, images2);
recyclerView.setAdapter(restaurantAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }



}
