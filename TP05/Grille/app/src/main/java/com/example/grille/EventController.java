package com.example.grille;

import android.graphics.Color;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class EventController extends GestureDetector.SimpleOnGestureListener {

    private CustomView view;

    public EventController(CustomView view) {
        this.view = view;
        this.view.setBackgroundColor(Color.BLUE);
    }

    @Override
    public boolean onContextClick(MotionEvent event) {
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent event) {
        this.view.setBackgroundColor(0xffEE82EE);
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent event) {

        return true;
    }

    @Override
    public boolean onDown(MotionEvent event) {
        Log.d("debug", "down");
        return true;
    }

    @Override
    public boolean onFling(MotionEvent event1, MotionEvent event2, float velocityx, float velocityY) {
        this.view.setBackgroundColor(0xFF414042);

        return true;
    }

    @Override
    public void onLongPress(MotionEvent event) {
        this.view.setBackgroundColor(Color.YELLOW);
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return true;
    }

    @Override
    public void onShowPress(MotionEvent event) {

    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent event) {
        return true;
    }

    @Override
    public boolean onSingleTapUp(MotionEvent event) {
        this.view.setBackgroundColor(Color.BLUE);
        return true;
    }
}
