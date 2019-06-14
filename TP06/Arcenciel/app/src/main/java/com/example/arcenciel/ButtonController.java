package com.example.arcenciel;

import android.app.Activity;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

import java.util.ArrayList;
import java.util.List;

public class ButtonController implements View.OnTouchListener {

    private ViewGroup group;

    public ButtonController(ViewGroup group) {
        this.group = group;
    }

    @Override
    public boolean onTouch(View view, MotionEvent event) {
        int count = this.group.getChildCount();
        Activity activity = (Activity)view.getContext();
        List<Integer> listColor = new ArrayList<Integer>();

        // retrieve the colors
        for(int i = 0; i < count ;i++) {
            RadioButton radioButton = (RadioButton)this.group.getChildAt(i);
            if(radioButton.isSelected()) {
                listColor.add(MainActivity.COLORS[i]);
            }
        }

        int colors[] = new int[listColor.size()];
        for(int i = 0; i < listColor.size(); i++) {
            colors[i] = listColor.get(i);
        }

        Intent intent = new Intent();
        intent.putExtra("colors", colors);
        // return value for the previous activity
        activity.setResult(0, intent);
        activity.finish();
        return true;
    }
}
