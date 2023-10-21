package com.example.test;

import android.graphics.Color;
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
        String citys[] = { "(거주지) 서울", "(거주지) 부산", "(거주지) 기타"};
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView title = findViewById(R.id.title);
        title.setTextColor(Color.GRAY);
        EditText name = findViewById(R.id.name);
        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.my_spinner_item, citys);
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
        RadioButton korean = findViewById(R.id.korean);
        RadioButton forigner = findViewById(R.id.forigner);
        CheckBox walking = findViewById(R.id.walking);
        CheckBox sleeping = findViewById(R.id.sleeping);
        Button button = findViewById(R.id.button);
        TextView status = findViewById(R.id.status);
        button.setOnClickListener(view -> {
            String str = "이름: " + name.getText().toString() + ", " + city;
            if (korean.isChecked()) str += ", " + korean.getText().toString();
            if (forigner.isChecked()) str += ", " + forigner.getText().toString();
            if (walking.isChecked()) str += ", " + walking.getText().toString();
            if (sleeping.isChecked()) str += ", " + sleeping.getText().toString();
            status.setText(str);
            status.setTextColor(Color.GRAY);
        });
    }
}