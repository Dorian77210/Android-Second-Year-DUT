package com.example.reticule;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        CustomView view = (CustomView)this.findViewById(R.id.main_view);
        Reticule reticule = view.getReticule();

        outState.putFloat("x", reticule.y);
        outState.putFloat("y", reticule.x);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        float x = savedInstanceState.getFloat("x"), y = savedInstanceState.getFloat("y");
        CustomView view = (CustomView)this.findViewById(R.id.main_view);
        Reticule reticule = view.getReticule();
        reticule.x = x;
        reticule.y = y;
    }
}
