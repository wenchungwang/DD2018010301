package com.program.play.a2018010301;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img =(ImageView)findViewById(R.id.imageView);
    }

    public void click(View v)
    {
        img.setImageResource(R.drawable.images);
    }

    public void click2(View v)
    {
         Picasso.with(MainActivity.this).load("http://www.pcschool.com.tw/updimg/act/2017RWD_AD/7bAD_945d.jpg")
                 .into(img);
     }

}
