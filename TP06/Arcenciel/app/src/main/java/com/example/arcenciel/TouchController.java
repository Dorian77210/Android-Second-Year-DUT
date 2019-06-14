package com.example.arcenciel;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;

public class TouchController implements View.OnTouchListener {

    private int[] colors;
    private int index;
    private int length;

    public TouchController(int[] colors) {
        this.colors = colors;
        this.index = 0;
        this.length = this.colors.length;
    }

    @Override
    public boolean onTouch(View view, MotionEvent event) {
        view.setBackgroundColor(this.colors[this.index++ % this.length]);
        return true;
    }
}
