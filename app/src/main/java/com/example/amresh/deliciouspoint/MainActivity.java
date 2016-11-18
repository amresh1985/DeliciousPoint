package com.example.amresh.deliciouspoint;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String login = "0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            login = extras.getString("login");
            //The key argument here must match that used in the other activity
        }

        if (login.equals("1")) {
            Button signin = (Button) findViewById(R.id.button4);
            signin.setVisibility(View.INVISIBLE);

        }


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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
        Toast.makeText(this, "Main Activity" + login, Toast.LENGTH_SHORT).show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_Home) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void Recipes(View view) {
        Intent intent = new Intent(this, Recipes.class);

        if (login.equals("1")) {
            intent.putExtra("login", "1");
        }
        startActivity(intent);
    }

    public void Signin(View view) {
        Intent intent = new Intent(this, Sign_In.class);
        if (login.equals("1")) {
            intent.putExtra("login", "1");
        }
        startActivity(intent);
    }

    public void Reviews(View view) {
        Intent intent = new Intent(this, Reviews.class);
        if (login.equals("1")) {
            intent.putExtra("login", "1");
        }
        startActivity(intent);
    }

    public void FoodMenu(View view) {
        Intent intent = new Intent(this, Food_Menu.class);
        if (login.equals("1")) {
            intent.putExtra("login", "1");
        }
        startActivity(intent);
    }

    public void SignOut(MenuItem item) {
        login = "0";
        finish();
        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);

    }
}
