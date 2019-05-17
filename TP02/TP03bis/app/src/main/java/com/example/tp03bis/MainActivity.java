package com.example.tp03bis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private AdapterView.OnItemSelectedListener controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomView view = (CustomView)this.findViewById(R.id.view);
        Spinner spinner = (Spinner)this.findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adaptor = ArrayAdapter.createFromResource(this, R.array.figures, android.R.layout.simple_spinner_item);
        adaptor.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        spinner.setAdapter(adaptor);

        this.controller = new Controller(spinner, view);
    }
}
