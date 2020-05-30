package com.example.guitartabsfor10kannadasongs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MunjaaneManjalli extends AppCompatActivity {

    private TextView munjaane;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_munjaane_manjalli);

        getSupportActionBar().hide();
        munjaane = findViewById(R.id.tvmunjaanecontent);

        munjaane.setText("___________________________________________________\n"+
                        "Line 1 : Munjaane manjalli.. \n" +
                        "               " + "E : 9----7---5------7—5-2\n" +
                        "Line 2 : Mussanje tilitampalli...\n" +
                        "               " + "E : 9---7---5-----5-5-4-5/7\n" +
                        "Line 3 : O  Olave neenelli.. \n" +
                        "               " + "E : 9—7-7-5---7---5--2\n" +
                        "Line 4 : Hudukaata ninaginelli..\n" +
                        "               " + "E : 9—9-7---5-------5-5-4-5/7\n" +
                        "Line 5 : Nannedeyolage nee ilidu..\n" +
                        "               " + "E : 7--9--10-10-9-7------5—-5-5-2\n" +
                        "Line 6 : Janamanada mouna muridu..\n" +
                        "               " + "E : 7-9-10-10-9------7---5-—5/7--4\n" +
                        "Line 7 : Bisi usirannu nee bagedu..\n" +
                        "               " + "E : 7-9-10-10-9-7—5---5-5-2\n" +
                        "Line 8 : Nittusirannu nee tagedu..\n" +
                        "               " + "E : 7-9-10-10-9-7----5—5/7--4\n" +
                        "Line 9 : Nannomme aavarisu..\n" +
                        "               " + "E : 5----4----0------5-4-4-2\n" +
                        "Line 10 : Ee bege nee haarisu..\n" +
                        "                " + "E : 5----4-0----5----4-4--2\n" +
                        "Line 11 : Manadaalada ullasa nee..\n" +
                        "                " + "E : 2-2-4-5-5\7-----10—9----5/7(T)\n" +
                        "Line 12 : Kuntallu neene..\n" +
                        "                " + "E : 12—5-7—-4-5\n" +
                        "Line 13 : Nintallu neene..\n" +
                        "                " + "E : 12—5-7—4-5\n" +
                        "line 14 : Nintallu neene..\n" +
                        "                " + "E : 12-5-5—-5-7----5/7--5\n" +
                        "Line 15 : Kannallu neene..\n" +
                        "                " + "E : 12—5-7—-4-5\n" +
                        "Line 16 : Kanasallu neene..\n" +
                        "                " + "E : 12-12-5-7—--4-5\n" +
                        "Line 17 : Ellellu neene sakhi..\n" +
                        "                " + "E : 12-5-5—-5-7----5/7--5\n" +
                        "Line 18 : Nana nennegalu neene..\n" +
                        "                " + "E : 7-9----10-10-10-9—-7-5\n" +
                        "Line 19 : Naalegalu neene..\n" +
                        "                " + "E : 10-10-10-9--7--5\n" +
                        "Line 20 : Endendu neene sakhi...\n" +
                        "                " + "E : 10-10-9—-7-5—--5-5/7\n" +
                        "Line 21 : Aavarisu.. Maidumbi..\n" +
                        "                " + "E : 5-4-4—5—-7—4—5---2\n" +
                        "Line 22 : Just Maat Maathalli..\n" +
                        "                " + "E : 0-0—9----7-—9---5\n" +
                        "Line 23 : Neenillaade baale baradu..\n" +
                        "                " + "E : 15-15-15-14-12-10--10-12---14-12-12\n" +
                        "Line 24 : Ninagaage nanna baduke mudipu..\n" +
                        "                " + "E : 15-15-15-17-14-12--10-12----14-12-12--17\n" +
                        "Line 25 : Neenillada baduke neeru..\n" +
                        "                " + "E : 14-14-12/9-10---10-10-9—-7--5\n" +
                        "Line 26 : Kollu nanna...\n" +
                        "                " + "E : 5—7—9—7(T)—9(T)—10(T)----12(T)\n"+
                        "___________________________________________________\n"
                );
    }
}
