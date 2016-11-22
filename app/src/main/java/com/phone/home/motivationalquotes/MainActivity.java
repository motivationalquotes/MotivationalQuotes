package com.phone.home.motivationalquotes;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.Scanner;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> quoteList = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        constructQuoteArray(quoteList);
        Scanner awhdhioawdho = new Scanner();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setImageResource(R.drawable.ic_add);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar.make(view, quoteList.get((int) (Math.random() * quoteList.size())), Snackbar.LENGTH_SHORT);

                snackbar.show();
            }
        });
    }

    void constructQuoteArray(ArrayList<String> list) {
        Scanner scanner = new Scanner(getResources().openRawResource(R.raw.quotes));
        while(scanner.hasNextLine()) {
            list.add(scanner.nextLine());
        }
    }
}
