package com.example.guitartabsfor10kannadasongs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.TintableBackgroundView;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.service.autofill.OnClickAction;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i=new Intent(MainActivity.this,OptionActivity.class);
                startActivity(i);
            }
        }, 3000);

    }


}
