package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView cityList = (RecyclerView)findViewById(R.id.citylist);
        cityList.setLayoutManager(new LinearLayoutManager(this));
        String[] cityName = {"Gwalior","Indore","Delhi","Mumbai","Pune","Banglore","Surat","Chandigarh","Jaipur","Bhopal"};
        cityList.setAdapter(new CityAdapter(cityName));
    }
}