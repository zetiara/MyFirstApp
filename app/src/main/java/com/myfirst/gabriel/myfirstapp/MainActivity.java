package com.myfirst.gabriel.myfirstapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout background;
    Button greenButton, blueButton, redButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        background = (LinearLayout) findViewById(R.id.background);
        redButton = (Button) findViewById(R.id.buttonRed);
        greenButton = (Button) findViewById(R.id.buttonGreen);
        blueButton = (Button) findViewById(R.id.buttonBlue);

        redButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                background.setBackgroundColor(Color.parseColor("#ff0000"));
            }
        });

        greenButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                background.setBackgroundColor(Color.parseColor("#00ff00"));
            }
        });

        blueButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                background.setBackgroundColor(Color.parseColor("#0000ff"));
            }
        });


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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
