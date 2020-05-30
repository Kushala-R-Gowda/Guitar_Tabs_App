package com.example.guitartabsfor10kannadasongs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TwinkleTwinkle extends AppCompatActivity {

    private TextView TwinkleTwinkle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twinkle_twinkle);

        getSupportActionBar().hide();
        TwinkleTwinkle = findViewById(R.id.tvtwinklecontent);

        TwinkleTwinkle.setText("__________________________________________\n"+
                               "Line 1 : Twinkle Twinkle Little Star" + "\n" +
                               "            " + "E : 0-0-7-7-9-9-7" + "\n" +
                               "Line 2 : How I Wonder What You Are" + "\n" +
                               "            " + "E : 5-5-4-4-2-2-0" + "\n" +
                               "Line 3 : Up Above The World So High" + "\n" +
                               "            " + "E : 7-7-5-5-4-4-2" + "\n" +
                               "Line 4 : Like A Diamond In The Sky" + "\n" +
                               "            " + "E : 7-7-5-5-4-4-2" + "\n" +
                               "Line 5 : Twinkle Twinkle Little Star" + "\n" +
                               "            " + "E : 0-0-7-7-9-9-7" + "\n" +
                               "Line 6 : How I Wonder What You Are" + "\n" +
                               "            " + "E : 5-5-4-4-2-2-0" + "\n"+
                               "___________________________________________\n");
    }
}
