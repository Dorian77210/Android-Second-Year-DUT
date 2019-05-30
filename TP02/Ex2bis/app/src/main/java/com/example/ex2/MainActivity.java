package com.example.ex2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private Controller controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);

        RadioGroup radioGroup = (RadioGroup)this.findViewById(R.id.group);
        CustomView customView = (CustomView)this.findViewById(R.id.customView);

        this.controller = new Controller(radioGroup, customView);
    }
}
