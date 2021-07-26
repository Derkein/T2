package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private EditText eEmail;
    private EditText ePassword;

    private TextView text1;
    private TextView text2;
    private TextView text3;
    private TextView text4;
    private TextView text5;
    private TextView text6;
    private TextView text7;
    private TextView text8;
    private TextView text9;

    private TextView textClick;

    private Button button1;

    private CheckBox box;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        eEmail = findViewById(R.id.etText4);
        ePassword = findViewById(R.id.etPass2);

        text1 = findViewById(R.id.textView7);
        text2 = findViewById(R.id.textView13);
        text3 = findViewById(R.id.textView14);
        text4 = findViewById(R.id.textView15);
        text5 = findViewById(R.id.textView16);
        text6 = findViewById(R.id.textView17);
        text7 = findViewById(R.id.textView18);
        text8 = findViewById(R.id.textView19);
        text9 = findViewById(R.id.textView20);

        button1 = findViewById(R.id.btnLogin2);

        box = findViewById(R.id.checkBox);

    }
}