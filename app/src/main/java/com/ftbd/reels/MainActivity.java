package com.ftbd.reels;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.ftbd.reels.Adapter.Adapter;
import com.ftbd.reels.Model.ModelObject;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private List<ModelObject> modelObjects = new ArrayList<>();
    private Adapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        SnapHelper snapHelper = new PagerSnapHelper();
        snapHelper.attachToRecyclerView(recyclerView);

        modelObjects.add(new ModelObject("","","","","","","","","",""));
        modelObjects.add(new ModelObject("","","","","","","","","",""));
        modelObjects.add(new ModelObject("","","","","","","","","",""));
        modelObjects.add(new ModelObject("","","","","","","","","",""));
        modelObjects.add(new ModelObject("","","","","","","","","",""));
        modelObjects.add(new ModelObject("","","","","","","","","",""));
        modelObjects.add(new ModelObject("","","","","","","","","",""));
        modelObjects.add(new ModelObject("","","","","","","","","",""));
        modelObjects.add(new ModelObject("","","","","","","","","",""));
        modelObjects.add(new ModelObject("","","","","","","","","",""));
        modelObjects.add(new ModelObject("","","","","","","","","",""));
        modelObjects.add(new ModelObject("","","","","","","","","",""));
        modelObjects.add(new ModelObject("","","","","","","","","",""));
        modelObjects.add(new ModelObject("","","","","","","","","",""));
        modelObjects.add(new ModelObject("","","","","","","","","",""));

        adapter = new Adapter(modelObjects,getApplicationContext());
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();





    }
}