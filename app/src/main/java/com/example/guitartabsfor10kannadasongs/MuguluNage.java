package com.example.guitartabsfor10kannadasongs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MuguluNage extends AppCompatActivity {

    private TextView mugulu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mugulu_nage);

        getSupportActionBar().hide();
        mugulu = findViewById(R.id.tvmugulucontent);
        mugulu.setText("___________________________________________________\n"+
                "STRING 2(B) : \n"+
                "Line 1 : Mugulu Nageye Nee Helu\n" +
                "               " + "3-5-3/5----5-3-3---3/5/2—2-3  \n" +
                "Line 2 : Mugulu Nageye Nee Helu\n" +
                "               " + "3-5-3/5----5-3-3----3/5/2—2-2  \n" +
                "Line 3 : Yaarirada Vele yalli\n" +
                "               " + "3/2-2-2-2—0-0/8-8-8       \n" +
                "Line 4 : Nee Yeke Jothegiruve\n" +
                "               " + "10/5---5-5-8—7-7-7-7-7 \n" +
                "Line 5 : Thusu Bidisi Helu Nanage\n" +
                "               " + "7----8—12-12-12—11/12-11/8—8/7--7\n" +
                "Line 6 : Nana Thutiye Beke Ninage\n" +
                "               " + "7---8—8/14-14-14--12/14-12/14—14-14-14\n" +
                "Line 7 : Nanella Novigu Naguve\n" +
                "               " + "12/14-15-14-12---10/8-8-8----8-8-8   \n" +
                "Line 8 : Nee Yeke Heege\n" +
                "               " + "10/5---5—8—7-5-5hp7-3hp5-2\n" +
                "Line 9 : Mugulu Nageye Nee Helu\n" +
                "               " + "3-5-3/5----5-3-3---3/5/2—2-3  \n" +
                "Line 10 : Mugulu Nageye Nee Helu\n" +
                "               " + "3-5-3/5----5-3-3---3/5/2—2-2  \n" +
                "\n" +
                "STRING 1(E) :\n" +
                "Line 11 : Saakaagada Ekaanthavaa\n" +
                "               " + "9/10-12-10-10---9/10-12-10-10\n" +
                "Line 12 : Ninninda Naa Kalithe\n" +
                "               " + "9/10-9/7-7—6-6—7-7-7/9       \n" +
                "Line 13 : Yaakaagi Nee Mare Maachuve\n" +
                "               " + "9/10-12-10-10---9/10-12-10-10\n" +
                "Line 14 : Nanella Bhaavukathe\n" +
                "               " + "9/10-9/7-7—6-6—7-7-7/9       \n" +
                "Line 15 : vSoothanthide Sambhaashane\n" +
                "               " + "7/9-7/5-5-5/8---10/7-5/3-3-3\n" +
                "\n" +
                "STRING 2(B) : \n" +
                "Line 16 : Gelluvuduu Ninage Hosathe\n" +
                "               " + "8-10-10/12-10-8—7/5-8/7----7-7-7\n" +
                "Line 17 : Aluvondu Beku Nanage\n" +
                "               " + "7-8--12-12-12—11/12-11/8—8-7--7\n" +
                "Line 18 : Are Ghalige  Hoogu Horage\n" +
                "               " + "7-8—8/14-14-14--12/14-12/14—14-14-14\n" +
                "Line 19 : Ishtolle Sneehithanaagi\n" +
                "               " + "12/14-15-14-12---10/8-8-8----8-8-8   \n" +
                "Line 20 : Kaadidare Hege?\n" +
                "               " + "10/5--5-5-8—---7-5-5hp7-3hp5-2\n" +
                "Line 21 : Mugulu Nageye Nee Helu\n" +
                "               " + "3-5-3/5----5-3-3---3/5/2—2-3  \n" +
                "Line 22 : Mugulu Nageye Nee Helu\n" +
                "               " + "3-5-3/5----5-3-3---3/5/2—2-2  \n" +
                "Line 23 : Yaarirada Vele yalli\n" +
                "               " + "3/2-2-2-2—0-0/8-8-8       \n" +
                "Line 24 : Nee Yeke Jothegiruve\n" +
                "               " + "10/5---5-5-8—7-7-7-7-7 \n"+
                "___________________________________________________\n"
                );
    }
}
