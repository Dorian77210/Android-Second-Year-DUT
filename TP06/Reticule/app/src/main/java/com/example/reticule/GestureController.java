package com.example.reticule;

import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class GestureController implements GestureDetector.OnGestureListener {

    private CustomView view;
    private Reticule reticule;

    public GestureController(CustomView view, Reticule reticule) {
        this.view = view;
        this.reticule = reticule;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent event1, MotionEvent event2, float distanceX, float distanceY) {
        this.reticule.updatePosition(distanceX, distanceY);
        this.view.postInvalidate();
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return true;
    }
}
