package com.example.myorderingapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myorderingapp.Models.MainModel;
import com.example.myorderingapp.R;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.viewholder> {
    ArrayList<MainModel> list;
    Context context;

    public MainAdapter(ArrayList<MainModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_mainfood, parent, false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        final MainModel model = list.get(position);
        holder.foodimage.setImageResource(model.getImage());
        holder.mainName.setText(model.getName());
        holder.price.setText(model.getPrice());
        holder.description.setText(model.getDescription());

        //recylerview binding in main activity on 26/05/2021

    }

    @Override
    public int getItemCount() {

        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        ImageView foodimage;
        TextView mainName, price, description;

        public viewholder(@NonNull View itemView) {
            super(itemView);
            foodimage = itemView.findViewById(R.id.imageView);
            mainName = itemView.findViewById(R.id.name);
            price = itemView.findViewById(R.id.orderprice);
            description = itemView.findViewById(R.id.description);
        }
    }
}

