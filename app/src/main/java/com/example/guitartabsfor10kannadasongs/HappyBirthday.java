package com.example.guitartabsfor10kannadasongs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HappyBirthday extends AppCompatActivity {

    private TextView HappyBirthday;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happy_birthday);

        getSupportActionBar().hide();
        HappyBirthday = findViewById(R.id.tvhappycontent);

        HappyBirthday.setText("_____________________________________\n"+
                              " line 1 : Happy Birthday To You" + "\n" +
                              "               " + "E : 0-0-2-0-5-4" + "\n" +
                              " line 2 : Happy Birthday To You" + "\n " +
                              "               " + "E : 0-0-2-0-7-5" + "\n" +
                              " line 3 : Happy Birthday To You" + "\n" +
                              "               " + "E : 0-0-12-9-5-4-2" + "\n" +
                              " line 4 : Happy Birthday To You" + "\n" +
                              "               " + "E : 10-10-9-5-7-5" + "\n"+
                              "_____________________________________\n");
    }
}
