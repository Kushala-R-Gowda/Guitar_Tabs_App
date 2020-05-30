package com.example.guitartabsfor10kannadasongs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListSingleActivity extends AppCompatActivity {

    private TextView happy,twinkle,vande,jana,munjaane;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_single);

        getSupportActionBar().hide();
        happy = findViewById(R.id.tvhappy);
        twinkle = findViewById(R.id.tvtwinkle);
        vande = findViewById(R.id.tvvande);
        jana = findViewById(R.id.tvjana);
        munjaane = findViewById(R.id.tvmunjaane);

        happy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListSingleActivity.this, HappyBirthday.class);
                startActivity(intent);
            }
        });
        twinkle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListSingleActivity.this, TwinkleTwinkle.class);
                startActivity(intent);
            }
        });

        vande.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListSingleActivity.this, VandeeMataram.class);
                startActivity(intent);
            }
        });

        jana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListSingleActivity.this, JanaGanaMana.class);
                startActivity(intent);
            }
        });

        munjaane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListSingleActivity.this, MunjaaneManjalli.class);
                startActivity(intent);
            }
        });


    }
}
