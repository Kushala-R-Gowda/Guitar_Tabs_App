package com.example.guitartabsfor10kannadasongs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class VandeeMataram extends AppCompatActivity {

    private TextView vande;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vandee_mataram);

        getSupportActionBar().hide();
        vande = findViewById(R.id.tvvandecontent);
        vande.setText("___________________________________________________\n"+
                "Line 1 : vande maataram\n" +
                "               e : 1--3------6//8--6--8\n" +

                "Line 2 : vande maataram\n" +
                "               e : 6--8------12//13--12-13\n" +

                "Line 3 : sujalaam sufalaam malayaj \n" +
                "               e : 13-15-11-10//8---10-8-6-5//3---3-8-6-8-\n" +

                "Line 4 : sheetalaam\n" +
                "               e : -----5-3//1----\n" +

                "Line 5 : sasyashyaamalaam maataram\n" +
                "               e : 0h1-1---6//8-6//8----------8//11---8//6\n" +

                "Line 6 : vande maataram\n" +
                "               e : 6--8------12//13--12-13\n" +

                "Line 7 : shubhrajyotsna pulakit yaaminiim\n" +
                "               e : 5//6-8--12-12-----12-12-13-12---13-12-13\n" +

                "Line 8 : phulla kusumita drumadal. \n" +
                "               e : 11//12-12--12-13-13-13--12-13-15-13-\n" +

                "Line 9 : shobhiniim\n" +
                "               e : 11-10//8\n" +

                "Line 10 : suhaasinim sumadhura bhaashhinim\n" +
                "               e : 5//3-3//6-3//5---3-11-10-11---10//8-10-8\n" +

                "Line 11 : sukhadaam varadaam\n" +
                "               e : 6--8--12------12-12-12\n" +

                "Line 12 : maataram\n" +
                "               e : 12//13--12//13\n" +

                "Line 13 : vande maataram\n"+
                "               e : 6--8------12//13--12-13\n" +
                "___________________________________________________\n"
                );
    }
}
