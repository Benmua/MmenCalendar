package com.mua.mmencalendar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CalendarActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private DayAdapter adapter;
    private ArrayList<DayItem> dayItems;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        dayItems = new ArrayList<>();
        dayItems.add(new DayItem("Tuʼ elìm", 1));
        dayItems.add(new DayItem("Nyɔs etuʼ endaʼ", 2));
        dayItems.add(new DayItem("Nyɔs əsamne", 3));
        dayItems.add(new DayItem("Tuʼ əkwùʼ", 4));
        dayItems.add(new DayItem("Tuʼ əkɔʼ", 5));
        dayItems.add(new DayItem("Tuʼ evɨyn", 6));
        dayItems.add(new DayItem("Tuʼ endaʼ", 7));
        dayItems.add(new DayItem("Tuʼ ə mə̂yn", 8));

        adapter = new DayAdapter(this, dayItems);
        recyclerView.setAdapter(adapter);

        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(this, recyclerView, new ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Toast.makeText(CalendarActivity.this, "You clicked on " + dayItems.get(position).getDayName(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(View view, int position) {
                Toast.makeText(CalendarActivity.this, "You long clicked on " + dayItems.get(position).getDayName(), Toast.LENGTH_SHORT).show();
            }
        }));
    }
}