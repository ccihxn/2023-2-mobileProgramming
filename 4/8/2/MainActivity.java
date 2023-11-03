package com.example.test;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioButton email = findViewById(R.id.email);
        RadioButton mail = findViewById(R.id.mail);
        EditText emailAddress = findViewById(R.id.emailAddress);
        RadioGroup addresses = findViewById(R.id.addresses);
        RadioButton homeAddress = findViewById(R.id.homeAddress);
        RadioButton officeAddress = findViewById(R.id.officeAddress);
        Button button = findViewById(R.id.button);
        email.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                emailAddress.setVisibility(android.view.View.VISIBLE);
            } else {
                emailAddress.setVisibility(android.view.View.GONE);
            }
        });
        mail.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                addresses.setBackgroundColor(Color.rgb(204, 153, 102));
                addresses.setVisibility(android.view.View.VISIBLE);
            } else {
                addresses.setVisibility(android.view.View.GONE);
            }
        });
    }
}