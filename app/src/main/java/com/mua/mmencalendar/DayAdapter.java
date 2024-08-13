package com.mua.mmencalendar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DayAdapter extends RecyclerView.Adapter<DayAdapter.ViewHolder> {
    private ArrayList<DayItem> dayItems;
    private Context context;

    public DayAdapter(Context context, ArrayList<DayItem> dayItems) {
        this.context = context;
        this.dayItems = dayItems;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.day_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        DayItem dayItem = dayItems.get(position);
        holder.dayNameTextView.setText(dayItem.getDayName());
        holder.dayNumberTextView.setText(String.valueOf(dayItem.getDayNumber()));
    }

    @Override
    public int getItemCount() {
        return dayItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView dayNameTextView;
        public TextView dayNumberTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            dayNameTextView = itemView.findViewById(R.id.day_name);
            dayNumberTextView = itemView.findViewById(R.id.day_number);
        }
    }
}
