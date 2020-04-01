package com.example.homeworkassignment2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

//create new inner class, RestaurantViewHolder
public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder> {

    String data1[], data2[], data3[], data4[];
    int images[];
    int images2[];
    Context context;


    public RestaurantAdapter(Context ct, String string1[], String string2[], String string3[], String string4[], int photos[], int photos2[]) {
        //variables to hold the values which will be passed inside MainActivity
        context = ct;
        data1 = string1;
        data2 = string2;
        data3 = string3;
        data4 = string4;
        images = photos;
        images2 = photos2;


    }

    @NonNull
    @Override
    public RestaurantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //inflate my_row

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new RestaurantViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantViewHolder holder, final int position) {
        holder.myText1.setText(data1[position]);
        holder.myText2.setText(data2[position]);
        holder.myText3.setText(data3[position]);
        holder.myText4.setText(data4[position]);
        holder.myImage.setImageResource(images[position]);
        holder.myImage2.setImageResource(images2[position]);

        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, SecondActivity.class);
                intent.putExtra("data1",data1[position]);
                intent.putExtra("data2",data2[position]);
                intent.putExtra("data3",data3[position]);
                intent.putExtra("data4",data4[position]);
                intent.putExtra("images",images[position]);
                intent.putExtra("images2",images2[position]);


                context.startActivity(intent);

            }
    } );
}


    @Override
    public int getItemCount() {
        return images.length;
    }

    public class RestaurantViewHolder extends RecyclerView.ViewHolder {
//created textview and imageview objects
        TextView myText1, myText2, myText3, myText4;
        ImageView myImage, myImage2;
        ConstraintLayout mainLayout;


        public RestaurantViewHolder(@NonNull View itemView) {
            super(itemView);


//find ID
            myText1 = itemView.findViewById(R.id.restaurant);
            myText2 = itemView.findViewById(R.id.cuisine);
            myText3 = itemView.findViewById(R.id.location);
            myText4 = itemView.findViewById(R.id.foodcost);
            myImage = itemView.findViewById(R.id.image);
            myImage2 = itemView.findViewById(R.id.rating);
            mainLayout = itemView.findViewById(R.id.mainLayout);

        }


    }

}
