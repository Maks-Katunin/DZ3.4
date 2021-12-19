package com.geektech.dz34;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    
    private RecyclerView recyclerView;
    private ArrayList<PersonModel> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        
        loadData();
        initRecycler();
    }

    private void initRecycler() {
        PersonAdapter adapter = new PersonAdapter(data);
        recyclerView.setAdapter(adapter);

    }

    private void loadData() {
        data = new ArrayList<>();
        data.add(new PersonModel(R.drawable.ic_face, "dfghj", 456321));
        data.add(new PersonModel(R.drawable.ic_face, "dfghj", 456321));
        data.add(new PersonModel(R.drawable.ic_face, "dfghj", 456321));
        data.add(new PersonModel(R.drawable.ic_face, "dfghj", 456321));
        data.add(new PersonModel(R.drawable.ic_face, "dfghj", 456321));
        data.add(new PersonModel(R.drawable.ic_face, "dfghj", 456321));
        data.add(new PersonModel(R.drawable.ic_face, "dfghj", 456321));
        data.add(new PersonModel(R.drawable.ic_face, "dfghj", 456321));
        data.add(new PersonModel(R.drawable.ic_face, "dfghj", 456321));
        data.add(new PersonModel(R.drawable.ic_face, "dfghj", 456321));
        data.add(new PersonModel(R.drawable.ic_face, "dfghj", 456321));
        data.add(new PersonModel(R.drawable.ic_face, "dfghj", 456321));
        data.add(new PersonModel(R.drawable.ic_face, "dfghj", 456321));
        data.add(new PersonModel(R.drawable.ic_face, "dfghj", 456321));
        data.add(new PersonModel(R.drawable.ic_face, "dfghj", 456321));
    }
}