package com.example.ex3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class -MainActivity extends AppCompatActivity {

    private FieldController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // retrieve fields
        EditText celcius = (EditText)this.findViewById(R.id.celcius);
        EditText fahrenheit = (EditText)this.findViewById(R.id.fahreiheit);

        this.controller = new FieldController(celcius, fahrenheit);
    }
}
