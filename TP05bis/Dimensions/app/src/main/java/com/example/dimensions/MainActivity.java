package com.example.dimensions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomView view = (CustomView)this.findViewById(R.id.view);
        Model model = new Model();
        view.setModel(model);

        ScaleGestureDetector detector = new ScaleGestureDetector(this, new ScaleController(view, model));
        GestureDetector d = new GestureDetector(this, new DoubleTapController(view, model));
        TouchListener listener = new TouchListener(view, detector);
    }
}
