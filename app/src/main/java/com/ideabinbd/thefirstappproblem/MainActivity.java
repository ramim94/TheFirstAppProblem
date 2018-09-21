package com.ideabinbd.thefirstappproblem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textOutput;
    EditText textInput;
    Button btnGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        textOutput= findViewById(R.id.textView);
        textInput= findViewById(R.id.editText);
        btnGo= findViewById(R.id.button);

        setContentView(R.layout.activity_main);
    }
}
