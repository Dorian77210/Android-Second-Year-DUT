package com.example.grille;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

public class TouchController implements View.OnTouchListener {

    private GestureDetector detector;

    public TouchController(CustomView view, GestureDetector detector) {
        view.setOnTouchListener(this);
        this.detector = detector;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return this.detector.onTouchEvent(event);
    }
}
