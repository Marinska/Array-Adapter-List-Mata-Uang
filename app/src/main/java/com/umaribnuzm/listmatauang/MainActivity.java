package com.umaribnuzm.listmatauang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lv;

    String[] Headline = {"Indonesia", "America", "Malaysia", "Japan", "South Korea", "Belanda", "Thailand", "Filipina", "England", "Brazil", "China"};
    String[] Subhead = {"Rupiah", "US Dolar", "Ringgit", "Yen", "Won", "Gulden", "Baht", "Peso", "Poundsterling", "Real", "Yuan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.list);
        ListAdapter listAdapter = new ListAdapter(this, Headline, Subhead);
        lv.setAdapter(listAdapter);
    }
}