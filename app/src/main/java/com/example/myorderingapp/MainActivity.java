package com.example.myorderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myorderingapp.Adapters.MainAdapter;
import com.example.myorderingapp.Models.MainModel;
import com.example.myorderingapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        ArrayList<MainModel> list = new ArrayList<>();
        list.add(new MainModel(R.drawable.download, "Burger", "5", "Chicken burger with soya sauce and cream"));
        list.add(new MainModel(R.drawable.download, "Pizza", "3", "Chicken burger with soya sauce and cream"));
        list.add(new MainModel(R.drawable.download, "finger", "4", "Chicken burger with soya sauce and cream"));
        list.add(new MainModel(R.drawable.download, "chips", "6", "Chicken burger with soya sauce and cream"));
        list.add(new MainModel(R.drawable.download, "lady finger", "8", "Chicken burger with soya sauce and cream"));
        list.add(new MainModel(R.drawable.download, "Burger", "9", "Chicken burger with soya sauce and cream"));

        MainAdapter adapter = new MainAdapter(list, this);


    }

}