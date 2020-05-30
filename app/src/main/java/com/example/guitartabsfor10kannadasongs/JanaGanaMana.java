package com.example.guitartabsfor10kannadasongs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class JanaGanaMana extends AppCompatActivity {

    private TextView JanaGana;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jana_gana_mana);

        getSupportActionBar().hide();
        JanaGana = findViewById(R.id.tvjanacontent);

        JanaGana.setText("___________________________________________________\n"+
                        "Line 1 : Jana Gana Mana Adhinayak Jaya He\n" +
                        "               " + "B : 5-7-9-9--9-9--9-9-9--9-9--7-9-10\n" +
                        "Line 2 : Bharat Bhagya Vidhata\n" +
                        "               " + "B : 9-9-9-7-7-7-4\7--5\n" +
                        "Line 3 : Punjaba Sindhu Gujarata Maratha\n" +
                        "               " + "B : 5-12-12-12-12-12-12-12-12-12-11-14-12\n" +
                        "Line 4 : Dravid Utkal Banga\n      " +
                        "         " + "B : 10-10-10-9-9-9-7-10-9\n" +
                        "Line 5 : Vindhya Himachala Yamuna Ganga\n" +
                        "               " + "B : 9-9-9-9-9-7-12-12-12-10-10\n" +
                        "Line 6 : Uchhala Jaladhi Taranga\n" +
                        "               " + "B : 9-9-9-7-7-7-7-4-7-5\n" +
                        "Line 7 : Tava Shubha Name Jaage\n" +
                        "               " + "B : 5-7-9-9-9-9-10-7-9-10\n" +
                        "Line 8 : Tava Shubha Ashisha Maage\n" +
                        "               " + "B : 9-10-12-12-12-10-9-7-10-9\n" +
                        "Line 9 : Gahe Tava Jaya Gaatha\n" +
                        "               " + "B : 9-9-7-7-7-7-4-7-5\n" +
                        "Line 10 : Jana Gana Mangala Dayak Jaya He\n" +
                        "                 " + "B : 12-12-12-12-12-12-12-12-12-12-11-14-12\n" +
                        "Line 11 : Bharata Bhagya Vidhata\n" +
                        "                 " + "B : 10-10-10-9-9-9-7-10-9\n" +
                        "Line 12 : Jaya He, Jaya He, Jaya He\n" +
                        "                 " + "B : 17-16-17--16-14-16--12-12-14\n" +
                        "Line 13 : Jaya, Jaya, Jaya, Jaya He\n" +
                        "                 " + "B : 7-7-9-9-11-11-9-11-12\n"+
                        "___________________________________________________\n");
    }
}
