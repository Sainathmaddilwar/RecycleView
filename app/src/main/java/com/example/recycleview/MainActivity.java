package com.example.recycleview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListData[] listData=new ListData[]{
                new ListData(R.drawable.fb,"fb","www.fb.com"),
                new ListData(R.drawable.instagram,"instagram","www.instagram.com"),
                new ListData(R.drawable.github,"github","www.github.com"),
                new ListData(R.drawable.plus,"plus","www.gmail.com"),
                new ListData(R.drawable.linkedin,"linkedin","www.linkdin.com"),
                new ListData(R.drawable.yt,"yt","www.youtube.com"),
                new ListData(R.drawable.stack,"stackoverflow","www.stackoverflow.com"),
                new ListData(R.drawable.tiktok,"tiktok","www.tiktok.com"),
                new ListData(R.drawable.twitter,"twitter","www.twitter.com"),
                new ListData(R.drawable.whatsapp,"whatsapp","www.whatsapp.com"),

        };
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycleview);
        LAdapter lAdapter=new LAdapter(listData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(lAdapter);
    }
}
