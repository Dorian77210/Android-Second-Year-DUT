package com.example.dimensions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ScaleGestureDetector;

public class MainActivity extends AppCompatActivity {

    private TouchController touchController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomView view = (CustomView)this.findViewById(R.id.view);
        ScaleGestureDetector detector = new ScaleGestureDetector(this, new ScaleController(view));
        this.touchController = new TouchController(view, detector);
    }
}
