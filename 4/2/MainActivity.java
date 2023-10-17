package com.example.test;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textView);
        CheckBox cbSeoul = findViewById(R.id.cbSeoul);
        CheckBox cbJeju = findViewById(R.id.cbJeju);
        CheckBox cbOthers = findViewById(R.id.cbOthers);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(v -> {
            String toastText = "<방문지역>";
            if (cbSeoul.isChecked()) toastText += "\n" + cbSeoul.getText().toString();
            if (cbJeju.isChecked()) toastText += "\n" + cbJeju.getText().toString();
            if (cbOthers.isChecked()) toastText += "\n" + cbOthers.getText().toString();
            Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();
        });
    }
}