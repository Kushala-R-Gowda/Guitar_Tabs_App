package com.example.guitartabsfor10kannadasongs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TumHiHo extends AppCompatActivity {

    private TextView tumhiho;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tum_hi_ho);

        getSupportActionBar().hide();
        tumhiho = findViewById(R.id.tvtumcontent);

        tumhiho.setText("___________________________________________________\n"+
                "E |-8-13-11-11-9-9-8————————-8-8—–\n" +
                "B |———————————11-9-11————–\n" +
                "G |——————————————————\n" +
                "Hum tere bin ab reh nahi sakte\n" +
                "\n" +
                "E |—————————————–\n" +
                "B |-11-9-11-9-8—————————\n" +
                "G |———————–10-8-10———\n" +
                "D |—————————————–\n" +
                "Tere bina kya wajood mera\n" +
                "\n" +
                "E |-8-13-11-11-9-9-8————————-8-8—–\n" +
                "B |———————————11-9-11————–\n" +
                "G |——————————————————\n" +
                "Tujhse juda gar ho jaayenge\n" +
                "\n" +
                "E |—————————————–\n" +
                "B |-11-9-11-9-8—————————\n" +
                "G |———————–10-8-10———\n" +
                "D |—————————————–\n" +
                "Toh khud se hi ho jaayenge judaa\n" +
                "\n" +
                "E |———8————–\n" +
                "B |-9-11———9-11—–\n" +
                "G |————————\n" +
                "Kyunki tum hi ho\n" +
                "\n" +
                "E |———8-11-9-8——————\n" +
                "B |-9-11———————9-11—–\n" +
                "G |————————————-\n" +
                "Ab tum hi ho\n" +
                "\n" +
                "E |——————————-\n" +
                "B |-8-11-9—–8-6-8-4-6——\n" +
                "G |——————————-\n" +
                "Zindagi ab tum hi ho\n" +
                "\n" +
                "E |———8————–\n" +
                "B |-11————9-11—–\n" +
                "G |————————-\n" +
                "Chain bhi\n" +
                "\n" +
                "E |———8-11-9-8——————\n" +
                "B |-9-11———————9-11—–\n" +
                "G |————————————-\n" +
                "Mera dard bhi\n" +
                "\n" +
                "E |——————————-\n" +
                "B |-8-11-9—–8-6-8-4-6——\n" +
                "G |——————————-\n" +
                "Meri aashiqui ab tum hi ho\n" +
                "\n" +
                "E |-8-13-11-11-9-9-8————————-8-8—–\n" +
                "B |———————————11-9-11————–\n" +
                "G |——————————————————\n" +
                "Tera mera rishta hai kaisa\n" +
                "\n" +
                "E |—————————————–\n" +
                "B |-11-9-11-9-8—————————\n" +
                "G |———————–10-8-10———\n" +
                "D |—————————————–\n" +
                "Ik pal door gawara nahi\n" +
                "\n" +
                "E |-8-13-11-11-9-9-8————————-8-8—–\n" +
                "B |———————————11-9-11————–\n" +
                "G |——————————————————\n" +
                "Tere liye har roz hai jeete\n" +
                "\n" +
                "E |—————————————–\n" +
                "B |-11-9-11-9-8—————————\n" +
                "G |———————–10-8-10———\n" +
                "D |—————————————–\n" +
                "Tujh ko diya mera waqt sabhi\n" +
                "\n" +
                "E |—————————————————–9-9-8-8-8-8–\n" +
                "B |———–8-8————–8-8————————————\n" +
                "G |-8-10————10————————————————\n" +
                "D |———————————————————————-\n" +
                "Koi lamha mera na ho tere bina\n" +
                "\n" +
                "E |-8-13-12-13-13-8———————————–\n" +
                "B |———————————-11-8-11-11-9-8-6–\n" +
                "G |——————————————————\n" +
                "Har saans pe naam tera\n" +
                "\n" +
                "E |———8————–\n" +
                "B |-9-11———9-11—–\n" +
                "G |————————\n" +
                "Kyunki tum hi ho\n" +
                "\n" +
                "E |———8-11-9-8——————\n" +
                "B |-9-11———————9-11—–\n" +
                "G |————————————-\n" +
                "Ab tum hi ho\n" +
                "\n" +
                "E |——————————-\n" +
                "B |-8-11-9—–8-6-8-4-6——\n" +
                "G |——————————-\n" +
                "Zindagi ab tum hi ho\n" +
                "\n" +
                "E |———8————–\n" +
                "B |-11————9-11—–\n" +
                "G |————————-\n" +
                "Chain bhi\n" +
                "\n" +
                "E |———8-11-9-8——————\n" +
                "B |-9-11———————9-11—–\n" +
                "G |————————————-\n" +
                "Mera dard bhi\n" +
                "\n" +
                "E |——————————-\n" +
                "B |-8-11-9—–8-6-8-4-6——\n" +
                "G |——————————-\n" +
                "Meri aashiqui ab tum hi ho\n" +
                "\n" +
                "E |-13-13-11-11-13—13-15-11-9-8——\n" +
                "B |—————————————–\n" +
                "G |—————————————–\n" +
                "Tere liye hi jiya main\n" +
                "\n" +
                "E |-8-8-9-9-13—13-15-11-9-8—-\n" +
                "B |————————————\n" +
                "G |————————————\n" +
                "Khud ko jo yun de diya hai\n" +
                "\n" +
                "E |-9-9-8-9-8-9-8———————-9-8—\n" +
                "B |——————————11-9————-\n" +
                "G |————————————————\n" +
                "Teri wafa ne mujhko sambhala\n" +
                "\n" +
                "E |-9-9-8-9-8-9-8———————-9-8—\n" +
                "B |——————————11-9————-\n" +
                "G |————————————————\n" +
                "Saare ghamon ko dil se nikala\n" +
                "\n" +
                "E |—————————————————–9-9-8-8-8-8–\n" +
                "B |———–8-8————–8-8————————————\n" +
                "G |-8-10————10————————————————\n" +
                "D |———————————————————————-\n" +
                "Tere saath mera hai naseeb juda\n" +
                "\n" +
                "E |-8-13-12-13-13-8———————————–\n" +
                "B |———————————-11-8-11-11-9-8-6–\n" +
                "G |——————————————————\n" +
                "Tujhe paake adhoora naa raha hmm..\n" +
                "\n" +
                "E |———8————–\n" +
                "B |-9-11———9-11—–\n" +
                "G |————————\n" +
                "Kyunki tum hi ho\n" +
                "\n" +
                "E |———8-11-9-8——————\n" +
                "B |-9-11———————9-11—–\n" +
                "G |————————————-\n" +
                "Ab tum hi ho\n" +
                "\n" +
                "E |——————————-\n" +
                "B |-8-11-9—–8-6-8-4-6——\n" +
                "G |——————————-\n" +
                "Zindagi ab tum hi ho\n" +
                "\n" +
                "E |———8————–\n" +
                "B |-11————9-11—–\n" +
                "G |————————-\n" +
                "Chain bhi\n" +
                "\n" +
                "E |———8-11-9-8——————\n" +
                "B |-9-11———————9-11—–\n" +
                "G |————————————-\n" +
                "Mera dard bhi\n" +
                "\n" +
                "E |——————————-\n" +
                "B |-8-11-9—–8-6-8-4-6——\n" +
                "G |——————————-\n" +
                "Meri aashiqui ab tum hi ho……\n"+
                "___________________________________________________\n");
    }
}
