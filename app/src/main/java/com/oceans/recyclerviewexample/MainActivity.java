package com.oceans.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<FruitModel> fruitModelList;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init(){
        fruitModelList = new ArrayList<FruitModel>();
        FruitModel fruitModel = new FruitModel("Apple",50);
        fruitModelList.add(fruitModel);
        fruitModelList.add(new FruitModel("Mango",60));
        fruitModelList.add(new FruitModel("Grapes",80));
        fruitModelList.add(new FruitModel("Orange",20));


        recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        FruitAdapter fruitAdapter = new FruitAdapter(MainActivity.this,fruitModelList);

        recyclerView.setAdapter(fruitAdapter);
    }

}