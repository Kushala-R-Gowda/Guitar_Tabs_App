package com.example.guitartabsfor10kannadasongs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ListChordsActivity extends AppCompatActivity {

    private TextView salutillave,hangover,ondumalebillu,sunraha,senorita;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_chords);

        getSupportActionBar().hide();

        salutillave = findViewById(R.id.tvsalutillave);
        hangover = findViewById(R.id.tvhangover);
        ondumalebillu = findViewById(R.id.tvondu);
        sunraha = findViewById(R.id.tvsunraha);
        senorita = findViewById(R.id.tvsenorita);

        salutillave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListChordsActivity.this, Salutillave.class);
                startActivity(intent);
            }
        });
        hangover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListChordsActivity.this, HangOver.class);
                startActivity(intent);
            }
        });

        ondumalebillu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListChordsActivity.this,OnduMalebillu.class);
                startActivity(intent);
            }
        });

       sunraha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListChordsActivity.this, SunRaha.class);
                startActivity(intent);
            }
        });

        senorita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListChordsActivity.this, Senorita.class);
                startActivity(intent);
            }
        });

    }
}
