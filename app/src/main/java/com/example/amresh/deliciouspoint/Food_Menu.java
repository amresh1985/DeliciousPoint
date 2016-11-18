package com.example.amresh.deliciouspoint;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class Food_Menu extends AppCompatActivity {
    String login = "0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food__menu);
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

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            login = extras.getString("login");
            //The key argument here must match that used in the other activity
        }
    }


    @Override
    public void onResume() {
        super.onResume();  // Always call the superclass method first
        // String login = "0";
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            login = extras.getString("login");
            //The key argument here must match that used in the other activity
        }
        Toast.makeText(this, "Food Menu" + login, Toast.LENGTH_SHORT).show();
    }
    public void SoupButtonClicked(View view) {

        Intent intent = new Intent(this, Food_Detail.class);
        if (login.equals("1")) {
            intent.putExtra("login", "1");
        }
        startActivity(intent);

    }

    public void DessertButtonClicked(View view) {

        Intent intent = new Intent(this, Deserts.class);
        if (login.equals("1")) {
            intent.putExtra("login", "1");
        }
        startActivity(intent);

    }
    public void BeverageButtonClicked(View view) {

        Intent intent = new Intent(this, beverages.class);
        if (login.equals("1")) {
            intent.putExtra("login", "1");
        }
        startActivity(intent);

    }


}
