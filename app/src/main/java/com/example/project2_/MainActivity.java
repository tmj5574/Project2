package com.example.project2_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btn_next;
    private EditText name;
    private EditText studentNumber;
    private String string;
    private String string2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_next = findViewById(R.id.btn_next);
        name = findViewById(R.id.name);
        studentNumber = findViewById(R.id.studentNumber);
        btn_next.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                string = name.getText().toString();
                string2 = studentNumber.getText().toString();
                Intent intent = new Intent(MainActivity.this, Second.class);
                intent.putExtra("name", string);
                intent.putExtra("studentNumber", string2);
                startActivity(intent);
            }
        });

    }
}