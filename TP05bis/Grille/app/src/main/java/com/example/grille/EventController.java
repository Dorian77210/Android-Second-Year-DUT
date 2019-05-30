package com.example.grille;

import android.content.Context;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

public class EventController extends GestureDetector.SimpleOnGestureListener {

    private View view;
    private Context context;

    public EventController(View view) {
        this.view = view;
        this.context = this.view.getContext();
    }

    @Override
    public boolean onDown(MotionEvent event) {
        // triggers first for both single tap and long press
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent event) {
        int color = this.context.getResources().getColor(R.color.purple);
        this.view.setBackgroundColor(color);
        return true;
    }

    @Override
    public void onLongPress(MotionEvent event) {
        int color = this.context.getResources().getColor(R.color.yellow);
        this.view.setBackgroundColor(color);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent event) {
        int color = this.context.getResources().getColor(R.color.blue);
        this.view.setBackgroundColor(color);
        return true;
    }

    @Override
    public boolean onFling(MotionEvent event1, MotionEvent event2, float velocityX, float velocityY) {
        int color = this.context.getResources().getColor(R.color.black);
        this.view.setBackgroundColor(color);
        return true;
    }

}
