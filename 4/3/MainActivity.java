package com.example.test;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView_title = findViewById(R.id.textView_title);
        EditText editText_width = findViewById(R.id.editText_width);
        EditText editText_height = findViewById(R.id.editText_height);
        RadioButton radioButton_white = findViewById(R.id.radioButton_white);
        RadioButton radioButton_brown = findViewById(R.id.radioButton_brown);
        RadioButton radioButton_black = findViewById(R.id.radioButton_black);
        CheckBox checkBox = findViewById(R.id.checkBox);
        Button button = findViewById(R.id.button);
        TextView textView_orders = findViewById(R.id.textView_orders);
        button.setOnClickListener(v -> {
            String orders = "<주문내역>\n[가로:" + editText_width.getText().toString() + "(mm), 세로:" + editText_height.getText().toString() + "(mm)";
            if (radioButton_white.isChecked()) orders += ", 색상:" + radioButton_white.getText().toString();
            if (radioButton_brown.isChecked()) orders += ", 색상:" + radioButton_brown.getText().toString();
            if (radioButton_black.isChecked()) orders += ", 색상:" + radioButton_black.getText().toString();
            if (checkBox.isChecked()) orders += ", 추가공구:필요";
            orders += "]";
            textView_orders.setText(orders);
        });
    }
}