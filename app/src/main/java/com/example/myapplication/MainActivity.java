package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText eEmail;
    private EditText ePassword;
    private Button eLogin;

    private ImageView eImgView;
    private TextView text1;
    private TextView text2;
    private TextView text3;
    private TextView text4;
    private TextView text5;
    private TextView text6;
    private TextView text7;

    private TextView textClick;

    private Button button1;
    private Button button2;
    private Button button3;

    private String Email = "Admin";
    private String Password = "12345";

    boolean isValid = false;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eEmail = findViewById(R.id.etText);
        ePassword = findViewById(R.id.etPass);
        eLogin = findViewById(R.id.btnLogin);
        eImgView = findViewById(R.id.imageView);

        text1 = findViewById(R.id.etText2);
        text2 = findViewById(R.id.textView3);
        text3 = findViewById(R.id.textView4);
        text4 = findViewById(R.id.textView5);
        text5 = findViewById(R.id.textView6);
        text6 = findViewById(R.id.textView8);
        text7 = findViewById(R.id.textView10);
        textClick = findViewById(R.id.textView2);

        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button3);

        textClick.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View z){
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent);
            }
        });

        eLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputEmail = eEmail.getText().toString();
                String inputPassword = ePassword.getText().toString();

                if(inputEmail.isEmpty() || inputPassword.isEmpty()){
                    Toast.makeText(MainActivity.this, "Email or Password is blank", Toast.LENGTH_SHORT).show();
                } else {
                    isValid = validate(inputEmail,inputPassword);
                    if(!isValid){
                        counter--;
                        Toast.makeText(MainActivity.this, "Email or Password is incorrect", Toast.LENGTH_SHORT).show();
                        if (counter == 0){
                            eLogin.setEnabled(false);
                            Toast.makeText(MainActivity.this, "Too many incorrect Attempts, the login will be disable for 5 minutes", Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(intent);
                    }
                }
            }
        });
    }
    private boolean validate(String email, String password){
        if (email.equalsIgnoreCase(Email) && password.equalsIgnoreCase(password)){
            return true;
        }
        return false;
    }
}