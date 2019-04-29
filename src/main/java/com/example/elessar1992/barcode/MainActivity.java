package com.example.elessar1992.barcode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    //public static TextView resultTextView;
    //public static TextView resultTextView2;
    public Button generating;
    public Button scaning;

    Button scanButton;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //resultTextView = (TextView) findViewById(R.id.result_text);
        //resultTextView2 = (TextView) findViewById(R.id.result_text2);
        //scanButton = (Button) findViewById(R.id.btn_scan);
        generating = (Button) findViewById(R.id.gen);
        scaning = (Button) findViewById(R.id.scan);

        generating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gIntent = new Intent(MainActivity.this, GeneratorActivity.class);
                startActivity(gIntent);
            }
        });

        scaning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gIntent = new Intent(MainActivity.this, ReadingActivity.class);
                startActivity(gIntent);
            }
        });

    }
}
