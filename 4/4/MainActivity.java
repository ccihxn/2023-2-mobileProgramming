package com.example.test;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String city;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String citys[] = { "(거주지) 서울", "(거주지) 부산","(거주지) 기타" };
        TextView textView_title = findViewById(R.id.textView_title);
        EditText editText_name = findViewById(R.id.editText_name);
        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.my_spinner_item, citys);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                city = citys[i];
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        RadioButton radioButton_korean = findViewById(R.id.rb_korean);
        RadioButton radioButton_forigner = findViewById(R.id.rb_forigner);
        CheckBox cb_walk = findViewById(R.id.cb_walk);
        CheckBox cb_sleep = findViewById(R.id.cb_sleep);
        Button button = findViewById(R.id.button);
        TextView textView_status = findViewById(R.id.textView_status);
        button.setOnClickListener(v -> {
            String status = "이름: " + editText_name.getText().toString() + ", " + city;
            if (radioButton_korean.isChecked()) status += ", " + radioButton_korean.getText().toString();
            if (radioButton_forigner.isChecked()) status += ", " + radioButton_forigner.getText().toString();
            if (cb_walk.isChecked()) status += ", " + cb_walk.getText().toString();
            if (cb_sleep.isChecked()) status += ", " + cb_sleep.getText().toString();
            textView_status.setText(status);
        });
    }
}