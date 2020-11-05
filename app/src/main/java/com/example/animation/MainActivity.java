package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import static com.example.animation.Utils.TITLE_1;
import static com.example.animation.Utils.TITLE_1_DESCRIPTION;
import static com.example.animation.Utils.TITLE_1_RECIPE;
import static com.example.animation.Utils.TITLE_2;
import static com.example.animation.Utils.TITLE_2_DESCRIPTION;
import static com.example.animation.Utils.TITLE_2_RECIPE;
import static com.example.animation.Utils.TITLE_3;
import static com.example.animation.Utils.TITLE_3_DESCRIPTION;
import static com.example.animation.Utils.TITLE_3_RECIPE;
import static com.example.animation.Utils.TITLE_4;
import static com.example.animation.Utils.TITLE_4_DESCRIPTION;
import static com.example.animation.Utils.TITLE_4_RECIPE;
import static com.example.animation.Utils.TITLE_5;
import static com.example.animation.Utils.TITLE_5_DESCRIPTION;
import static com.example.animation.Utils.TITLE_5_RECIPE;
import static com.example.animation.Utils.TITLE_6;
import static com.example.animation.Utils.TITLE_6_DESCRIPTION;
import static com.example.animation.Utils.TITLE_6_RECIPE;
import static com.example.animation.Utils.TITLE_7;
import static com.example.animation.Utils.TITLE_7_DESCRIPTION;
import static com.example.animation.Utils.TITLE_7_RECIPE;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private GridLayoutManager layoutManager;
    private int column_count;
    private String hello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<RecyclerViewItem> recyclerViewsList = new ArrayList<>();
        recyclerViewsList.add(new RecyclerViewItem(R.drawable.pizza_sourdough, TITLE_1, TITLE_1_DESCRIPTION, TITLE_1_RECIPE));
        recyclerViewsList.add(new RecyclerViewItem(R.drawable.crumpet_pizza, TITLE_2, TITLE_2_DESCRIPTION, TITLE_2_RECIPE));
        recyclerViewsList.add(new RecyclerViewItem(R.drawable.gluten_free_pizza, TITLE_3, TITLE_3_DESCRIPTION, TITLE_3_RECIPE));
        recyclerViewsList.add(new RecyclerViewItem(R.drawable.chicken_tikka_masala_pizza, TITLE_4, TITLE_4_DESCRIPTION, TITLE_4_RECIPE));
        recyclerViewsList.add(new RecyclerViewItem(R.drawable.pizza_with_homemade_sauce, TITLE_5, TITLE_5_DESCRIPTION, TITLE_5_RECIPE));
        recyclerViewsList.add(new RecyclerViewItem(R.drawable.sausage_and_pesto_pizza, TITLE_6, TITLE_6_DESCRIPTION, TITLE_6_RECIPE));
        recyclerViewsList.add(new RecyclerViewItem(R.drawable.rainbow_pizzas, TITLE_7, TITLE_7_DESCRIPTION, TITLE_7_RECIPE));

        recyclerView = findViewById(R.id.recycle_view);
        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerViewAdapter(recyclerViewsList, this);
        column_count = getResources().getInteger(R.integer.column_count);
        layoutManager = new GridLayoutManager(this, column_count);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.addOnItemTouchListener(new RecyclerClickListener(this.getBaseContext(), recyclerView, new RecyclerClickListener.ClickListener() {
//            @Override
//            public void onClick(View view, int position) {
//                Toast.makeText(MainActivity.this, recyclerViewsList.get(position).getText1(), Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onLongClick(View view, int position) {
//
//            }
//        }));


    }
}
