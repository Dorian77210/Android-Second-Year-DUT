package com.example.dimensions;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;

public class TouchListener implements View.OnTouchListener {

    private ScaleGestureDetector scaleGestureDetector;
    private GestureDetector gestureDetector;

    public TouchListener(CustomView view, ScaleGestureDetector detector, GestureDetector d) {
        view.setOnTouchListener(this);
        this.scaleGestureDetector = detector;
        this.gestureDetector = d;
    }

    @Override
    public boolean onTouch(View view, MotionEvent event) {
        return this.scaleGestureDetector.onTouchEvent(event) || this.gestureDetector.onTouchEvent(event);
    }
}
