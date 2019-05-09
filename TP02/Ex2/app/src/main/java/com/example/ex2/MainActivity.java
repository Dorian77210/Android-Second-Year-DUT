package com.example.ex2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private CustomController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomView v = (CustomView)this.findViewById(R.id.view);
        RadioGroup g = (RadioGroup)this.findViewById(R.id.radiogroup);

        this.controller = new CustomController(g, v);
    }
}
