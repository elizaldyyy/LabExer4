package com.sample.johnkaton.labexer4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Toastbutton = (Button) findViewById(R.id.Toastbutton);
        final Button Snackbarbutton = (Button) findViewById(R.id.Snackbarbutton);
        Button SBwAbutton = (Button) findViewById(R.id.SBwAbutton);

        Toastbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String message = "Toast!";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(getApplicationContext(), message, duration).show();
            }
        });
        Snackbarbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View viewt = findViewById(R.id.ViewMe);
                String message = "Snackbar!";
                int duration = Snackbar.LENGTH_SHORT;

                showSnackbar(viewt, message, duration);
            }
        });
        SBwAbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View viewt = findViewById(R.id.ViewMe);
                String message = "Toast!";
                int duration = Snackbar.LENGTH_SHORT;

                showSnackbarAct(viewt, message, duration);
            }
        });
    }

        public void showSnackbar(View viewt, String message,int duration)
        {
            Snackbar.make(viewt, message, duration).show();
        }

        public void showSnackbarAct(View viewt, String message,int duration)
        {
            final Snackbar snackbar = Snackbar.make(viewt, message, duration);
            snackbar.setAction("DISMISS", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbar.dismiss();
            }
        });

            snackbar.show();
        }
}
