package com.example.dimensions;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;

public class TouchController implements View.OnTouchListener {

    private ScaleGestureDetector detector;

    public TouchController(CustomView customView, ScaleGestureDetector detector) {
        customView.setOnTouchListener(this);
        this.detector = detector;
    }

    @Override
    public boolean onTouch(View view, MotionEvent event) {
        return this.detector.onTouchEvent(event);
    }
}
