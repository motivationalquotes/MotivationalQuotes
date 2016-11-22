package com.phone.home.motivationalquotes;

import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    int memes = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setImageResource(R.drawable.ic_add_white);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar.make(view, "Snackbars: " + String.valueOf(memes), Snackbar.LENGTH_LONG)
                        .setAction("Subtract", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                memes--;
                                Snackbar.make(v, "Snackbars: " + String.valueOf(memes), Snackbar.LENGTH_LONG).show();
                            }
                        });
                snackbar.show();
                memes++;
            }
        });
    }
}
