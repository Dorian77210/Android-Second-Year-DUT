package com.example.tp03bis;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Controller implements AdapterView.OnItemSelectedListener {

    private CustomView customView;

    public Controller(Spinner spinner, CustomView customView) {
        spinner.setOnItemSelectedListener(this);
        this.customView = customView;
    }

    @Override
    public void onItemSelected(AdapterView<?> adaptor, View view, int position, long id) {
        String figure = adaptor.getSelectedItem().toString();
        Log.d("debug", figure);
        this.customView.setFigure(figure);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adaptor) {

    }
}
