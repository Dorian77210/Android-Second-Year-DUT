package com.example.reticule;

import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

public class TouchController implements View.OnTouchListener {

    private GestureDetector detector;

    public TouchController(GestureDetector detector) {
        this.detector = detector;
    }

    @Override
    public boolean onTouch(View view, MotionEvent event) {
        return this.detector.onTouchEvent(event);
    }
}
