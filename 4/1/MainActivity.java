package com.example.test;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textView);
        RadioButton gasoline = findViewById(R.id.gasoline);
        RadioButton diesel = findViewById(R.id.diesel);
        RadioButton electric = findViewById(R.id.electric);
        RadioButton others = findViewById(R.id.others);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(v -> {
            String toastText = "연료 유형: ";
            if (gasoline.isChecked()) toastText += "휘발유";
            if (diesel.isChecked()) toastText += "경유";
            if (electric.isChecked()) toastText += "전기";
            if (others.isChecked()) toastText += "기타";
            Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();
        });
    }
}