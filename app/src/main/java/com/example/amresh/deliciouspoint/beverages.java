package com.example.amresh.deliciouspoint;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;

public class beverages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beverages);
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

    public void onCheckboxClicked(View view) {

        String login = "0";
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            login = extras.getString("login");
            //The key argument here must match that used in the other activity
        }

        if (login.equals("1")) {
            NotificationCompat.Builder mBuilder =
                    (NotificationCompat.Builder) new NotificationCompat.Builder(this)
                            .setSmallIcon(R.drawable.carrot_soup)
                            .setContentTitle("DeliciousPoint")
                            .setContentText("Items Added in Cart : " + login);

            int mNotificationId = 001;
// Gets an instance of the NotificationManager service
            NotificationManager mNotifyMgr =
                    (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
// Builds the notification and issues it.
            mNotifyMgr.notify(mNotificationId, mBuilder.build());


        } else {

            ((CheckBox) view).setChecked(false);


            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Not Logged In");
            alertDialog.setMessage("Please login to add this item into cart");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();


        }
    }

    public void createNotification(View view) {
        NotificationCompat.Builder mBuilder =
                (NotificationCompat.Builder) new NotificationCompat.Builder(this)
                        .setSmallIcon(R.drawable.carrot_soup)
                        .setContentTitle("My notification")
                        .setContentText("Hello World!");

    }
}
