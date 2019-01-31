package com.durranilab.exampletoast;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.durranilab.labtoast.LabToast;

import static com.durranilab.labtoast.LabToast.CENTER;

public class MainActivity extends AppCompatActivity {

    LabToast labToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button default_btn = findViewById(R.id.default_btn);
        Button rounded_corners = findViewById(R.id.rounded);
        Button medium_corners = findViewById(R.id.medium);
        Button square_corners = findViewById(R.id.square);
        Button custom_icon = findViewById(R.id.custom_icon);
        Button custom_bg = findViewById(R.id.custom_bg);
        Button custom_text = findViewById(R.id.custom_textColor);
        Button custom_bgImg = findViewById(R.id.custom_bg_img);
        Button custom_position = findViewById(R.id.custom_position);



        default_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                labToast = new LabToast(MainActivity.this);
                labToast.showToast("Hey! This is Lab Custom Toast",Toast.LENGTH_LONG);
            }
        });

        rounded_corners.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                labToast = new LabToast(MainActivity.this);
                labToast.setCornerStyle(2);
                labToast.setBackgroundColor(Color.parseColor("#0000FF"));
                labToast.showToast("Hey! This is Lab Custom Toast",Toast.LENGTH_LONG);
            }
        });

        medium_corners.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                labToast = new LabToast(MainActivity.this);
                labToast.setCornerStyle(1);
                labToast.setBackgroundColor(Color.parseColor("#FF0000"));
                labToast.showToast("Hey! This is Lab Custom Toast",Toast.LENGTH_LONG);
            }
        });

        square_corners.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                labToast = new LabToast(MainActivity.this);
                labToast.setCornerStyle(3);
                labToast.setBackgroundColor(Color.parseColor("#00FF00"));
                labToast.showToast("Hey! This is Lab Custom Toast",Toast.LENGTH_LONG);
            }
        });

        custom_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                labToast = new LabToast(MainActivity.this);
                labToast.setIcon(R.mipmap.ic_launcher);
                labToast.showToast("Hey! This is Lab Custom Toast",Toast.LENGTH_LONG);
            }
        });

        custom_bg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                labToast = new LabToast(MainActivity.this);
                labToast.setBackgroundColor(Color.parseColor("#000000"));
                labToast.showToast("Hey! This is Lab Custom Toast",Toast.LENGTH_LONG);
            }
        });

        custom_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                labToast = new LabToast(MainActivity.this);
                labToast.setTextColor(Color.parseColor("#00FF00"));
                labToast.showToast("Hey! This is Lab Custom Toast",Toast.LENGTH_LONG);
            }
        });

        custom_bgImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                labToast = new LabToast(MainActivity.this);
                labToast.setBackgroundDrawable(R.drawable.bg_img_btn);
                labToast.setIcon(R.mipmap.ic_launcher_round);
                labToast.showToast("Hey! This is Lab Custom Toast, you can see amazing custom background image here\n",Toast.LENGTH_LONG);
            }
        });

        custom_position.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                labToast = new LabToast(MainActivity.this);
                labToast.setPositon(CENTER);
                labToast.showToast("Hey! This is Lab Custom Toast",Toast.LENGTH_LONG);
            }
        });

    }

}
