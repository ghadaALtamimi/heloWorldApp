package com.example.heloworldapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button b;
EditText e;
TextView v;
String str="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.Sendbutton);
        e=(EditText) findViewById(R.id.nameText);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str=e.getText().toString();
                v = (TextView) findViewById(R.id.textView);
                ((TextView) v).setText("Hlleo, "+str);
            }
        });


    }
}