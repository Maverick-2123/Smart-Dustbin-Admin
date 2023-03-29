package com.example.protechtoradmin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button qrbtn;
    Button delbtn;

    Button fillbtn;
    public static TextView qrtext;

    public static EditText editText;

    public static Button openButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        qrbtn = (Button)findViewById(R.id.qrbtn);
        qrtext = (TextView)findViewById(R.id.qrtext);
        editText = (EditText)findViewById(R.id.editTextNumber);
        delbtn = (Button)findViewById((R.id.qrbtn1));
        openButton = (Button)findViewById(R.id.qrbtn3);
        fillbtn = (Button)findViewById(R.id.qrbtn4);

        qrbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),qrscanner.class));
            }
        });
        delbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),qrdelete.class));
            }
        });
        openButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),OpenDustbin.class));
            }
        });
        fillbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),dustbinFill.class));
            }
        });
    }
}