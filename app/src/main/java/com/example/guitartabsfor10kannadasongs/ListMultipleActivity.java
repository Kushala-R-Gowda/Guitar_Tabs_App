package com.example.guitartabsfor10kannadasongs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListMultipleActivity extends AppCompatActivity {

    private TextView tumhiho,mugulu,sabthera,haidil,terebin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_multiple);

        getSupportActionBar().hide();
    tumhiho = findViewById(R.id.tvtum);
    mugulu = findViewById(R.id.tvmugulu);
    sabthera = findViewById(R.id.tvsabthera);
    haidil = findViewById(R.id.tvhai);
    terebin = findViewById(R.id.tvterebin);

        tumhiho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListMultipleActivity.this, TumHiHo.class);
                startActivity(intent);
            }
        });
        mugulu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListMultipleActivity.this, MuguluNage.class);
                startActivity(intent);
            }
        });

        sabthera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListMultipleActivity.this, SabThera.class);
                startActivity(intent);
            }
        });

        haidil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListMultipleActivity.this, HaiDilYeMeera.class);
                startActivity(intent);
            }
        });

        terebin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListMultipleActivity.this, TereBina.class);
                startActivity(intent);
            }
        });


    }
}
