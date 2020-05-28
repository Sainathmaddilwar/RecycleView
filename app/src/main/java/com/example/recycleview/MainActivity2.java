package com.example.recycleview;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String n=getIntent().getStringExtra("name");
        ImageView imageView=(ImageView)findViewById(R.id.imageView2);
        TextView textView=(TextView)findViewById(R.id.textView3);


      switch (n){
            case "yt":
                textView.setText(n);
                imageView.setImageResource(R.drawable.yt);
                break;
          case "fb":
              textView.setText(n);
              imageView.setImageResource(R.drawable.fb);
              break;
          case "instagram":
              textView.setText(n);
              imageView.setImageResource(R.drawable.instagram);
              break;
          case "github":
              textView.setText(n);
              imageView.setImageResource(R.drawable.github);
              break;
          case "plus":
              textView.setText(n);
              imageView.setImageResource(R.drawable.plus);
              break;
          case "linkedin":
              textView.setText(n);
              imageView.setImageResource(R.drawable.linkedin);
              break;
          case "stackoverflow":
              textView.setText(n);
              imageView.setImageResource(R.drawable.stack);
              break;
          case "twitter":
              textView.setText(n);
              imageView.setImageResource(R.drawable.twitter);
              break;

              case "tiktok":
              textView.setText(n);
              imageView.setImageResource(R.drawable.tiktok);
              break;
          case "whatsapp":
              textView.setText(n);
              imageView.setImageResource(R.drawable.whatsapp);
              break;


        }

    }
}
