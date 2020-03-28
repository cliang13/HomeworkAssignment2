package com.example.homeworkassignment2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder> {

    String data1[], data2[], data3[];
    int images[];
    int images2[];
    Context context;


    public RestaurantAdapter(Context ct, String string1[], String string2[], String string3[], int photos[], int photos2[]) {
        context = ct;
        data1 = string1;
        data2 = string2;
        data3 = string3;
        images = photos;
        images2 = photos2;


    }

    @NonNull
    @Override
    public RestaurantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new RestaurantViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantViewHolder holder, int position) {
        holder.myText1.setText(data1[position]);
        holder.myText2.setText(data2[position]);
        holder.myText3.setText(data3[position]);
        holder.myImage.setImageResource(images[position]);
        holder.myImage2.setImageResource(images2[position]);


    }


    @Override
    public int getItemCount() {
        return images.length;
    }

    public class RestaurantViewHolder extends RecyclerView.ViewHolder {

        TextView myText1, myText2, myText3;
        ImageView myImage, myImage2;


        public RestaurantViewHolder(@NonNull View itemView) {
            super(itemView);

            myText1 = itemView.findViewById(R.id.restaurant);
            myText2 = itemView.findViewById(R.id.cuisine);
            myText3 = itemView.findViewById(R.id.location);
            myImage = itemView.findViewById(R.id.image);
            myImage2 = itemView.findViewById(R.id.rating);

        }


    }

}
