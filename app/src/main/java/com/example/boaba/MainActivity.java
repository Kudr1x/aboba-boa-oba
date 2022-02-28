package com.example.boaba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Item> itemsList = new ArrayList<>();

        int[] ms1 = new int[]{2, 2, 4, 2};
        int[] ms2 = new int[]{5, 5, 5, 5, 2};
        int[] ms3 = new int[]{4, 4, 4, 4, 4, 4, 2};
        int[] ms4 = new int[]{2, 3, 4, 5, 1};
        int[] ms5 = new int[]{1, 1};
        int[] ms6 = new int[]{3, 5, 1, 4};
        int[] ms7 = new int[]{};
        int[] ms8 = new int[]{5};

        itemsList.add(new Item("Жмышенко Валерий", "14", ms1));
        itemsList.add(new Item("Михамл", "8", ms2));
        itemsList.add(new Item("Биба", "12", ms3));
        itemsList.add(new Item("Боба", "12", ms4));
        itemsList.add(new Item("Ян", "16", ms5));
        itemsList.add(new Item("Пурген", "17", ms6));
        itemsList.add(new Item("Пупа", "15", ms7));
        itemsList.add(new Item("Вионтий", "0", ms8));

        RecyclerView viewPager = findViewById(R.id.rec);
        itemAdapter itemadapter = new itemAdapter(itemsList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        viewPager.setLayoutManager(layoutManager);
        viewPager.setAdapter(itemadapter);
    }
}