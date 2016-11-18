package com.example.amresh.deliciouspoint;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Reviews extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviews);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        String login = "0";
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            login = extras.getString("login");
            //The key argument here must match that used in the other activity
        }
    }

    @Override
    public void onResume() {
        super.onResume();  // Always call the superclass method first
        String login = "0";
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            login = extras.getString("login");
            //The key argument here must match that used in the other activity
        }

    }

}
