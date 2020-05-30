package com.example.guitartabsfor10kannadasongs;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class OptionActivity extends AppCompatActivity {

    private TextView tvsingle,tvmultiple,tvchords;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);


        tvsingle = findViewById(R.id.singletv);
        tvmultiple = findViewById(R.id.multipletv);
        tvchords = findViewById(R.id.chordstv);

        tvsingle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OptionActivity.this,ListSingleActivity.class);
                startActivity(intent);
            }
        });

        tvmultiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OptionActivity.this,ListMultipleActivity.class);
                startActivity(intent);
            }
        });

        tvchords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OptionActivity.this,ListChordsActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed(){
        final AlertDialog.Builder builder = new AlertDialog.Builder(OptionActivity.this);
        builder.setTitle("Are You Sure Want To Exit ? ");
        builder.setCancelable(true);builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }
}
