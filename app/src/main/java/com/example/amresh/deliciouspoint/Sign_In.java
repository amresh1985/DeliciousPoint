package com.example.amresh.deliciouspoint;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Sign_In extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign__in);
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
    }

    public void LoginClick(View view) {
        AlertDialog alertDialog = new AlertDialog.Builder(this).create();

        EditText userid = (EditText) findViewById(R.id.useridenter);
        EditText pass = (EditText) findViewById(R.id.passwordenter);

        if (userid.getText().toString().equals("Amresh")) {
            // (pass.getText().toString() == "Prakash")
            {
                Toast.makeText(this, "Successfully Login", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, MainActivity.class);
                intent.putExtra("login", "1");
                startActivity(intent);
                finish();
            }

        } else {

            //   AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Wrong Details");
            alertDialog.setMessage("You have provided wrong id or password, Please try again.");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();
        }


    }
}
