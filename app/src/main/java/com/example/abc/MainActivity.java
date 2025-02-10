package com.example.abc;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AlphabetAdapter adapter;
    private List<AlphabetItem> alphabetList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        alphabetList = generateAlphabetData();
        adapter = new AlphabetAdapter(this, alphabetList);
        recyclerView.setAdapter(adapter);
    }

    private List<AlphabetItem> generateAlphabetData() {
        List<AlphabetItem> list = new ArrayList<>();
        list.add(new AlphabetItem("A", "Apple", R.drawable.apple));
        list.add(new AlphabetItem("B", "Ball", R.drawable.ball));
        list.add(new AlphabetItem("C", "Cat", R.drawable.cat));
        list.add(new AlphabetItem("D", "Dog", R.drawable.dog));
        list.add(new AlphabetItem("E", "Elephant", R.drawable.elephant));
        list.add(new AlphabetItem("F", "Fish", R.drawable.fish));
        list.add(new AlphabetItem("G", "Grapes", R.drawable.grapes));
        list.add(new AlphabetItem("H", "Horse", R.drawable.horse));
        list.add(new AlphabetItem("I", "Ice Cream", R.drawable.ice_cream));
        list.add(new AlphabetItem("J", "Jug", R.drawable.jug));
        list.add(new AlphabetItem("K", "Kite", R.drawable.kite));
        list.add(new AlphabetItem("L", "Lion", R.drawable.lion));
        list.add(new AlphabetItem("M", "Mango", R.drawable.mango));
        list.add(new AlphabetItem("N", "Nest", R.drawable.nest));
        list.add(new AlphabetItem("O", "Orange", R.drawable.orange));
        list.add(new AlphabetItem("P", "Parrot", R.drawable.parrot));
        list.add(new AlphabetItem("Q", "Queen", R.drawable.queen));
        list.add(new AlphabetItem("R", "Rabbit", R.drawable.rabbit));
        list.add(new AlphabetItem("S", "Sun", R.drawable.sun));
        list.add(new AlphabetItem("T", "Tiger", R.drawable.tiger));
        list.add(new AlphabetItem("U", "Umbrella", R.drawable.umbrella));
        list.add(new AlphabetItem("V", "Van", R.drawable.van));
        list.add(new AlphabetItem("W", "Watch", R.drawable.watch));
        list.add(new AlphabetItem("X", "Xylophone", R.drawable.xylophone));
        list.add(new AlphabetItem("Y", "Yak", R.drawable.yak));
        list.add(new AlphabetItem("Z", "Zebra", R.drawable.zebra));
        return list;
    }
}