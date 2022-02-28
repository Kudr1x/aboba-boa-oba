package com.example.boaba;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class itemAdapter extends RecyclerView.Adapter<itemAdapter.itemHelper> {
    private final List<Item> itemList;

    public itemAdapter(List<Item> itemList){
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public itemHelper onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item,parent,false);
        return new itemHelper(view);
    }

    @Override
    public void onBindViewHolder(@NonNull itemHelper holder, int position) {
        Item current = itemList.get(position);

        holder.tx1.setText(current.fio);
        holder.tx2.setText(current.getAge());
        holder.tx3.setText(current.getMarks());
        holder.tx4.setText(current.getAvg());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public static class itemHelper extends RecyclerView.ViewHolder {
        TextView tx1;
        TextView tx2;
        TextView tx3;
        TextView tx4;
        public itemHelper(@NonNull View itemView) {
            super(itemView);
            tx1 = itemView.findViewById(R.id.fio);
            tx2 = itemView.findViewById(R.id.age);
            tx3 = itemView.findViewById(R.id.marks);
            tx4 = itemView.findViewById(R.id.avg);
        }
    }
}
