package com.example.projectgen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn_Generador;
    EditText edt_Questions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_Generador = findViewById(R.id.btn_Generador);
        edt_Questions = findViewById(R.id.edt_Questions);

        


    }
}
