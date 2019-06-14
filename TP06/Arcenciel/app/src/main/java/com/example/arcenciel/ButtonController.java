package com.example.arcenciel;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.RadioButton;

import java.util.ArrayList;
import java.util.List;

public class ButtonController implements View.OnClickListener {

    private ViewGroup group;

    public ButtonController(ViewGroup group) {
        this.group = group;
    }

    @Override
    public void onClick(View view) {
        int count = this.group.getChildCount();
        Activity activity = (Activity)view.getContext();
        List<Integer> listColor = new ArrayList<Integer>();

        // retrieve the colors
        for(int i = 0; i < count ;i++) {
            CheckBox checkBox = (CheckBox)this.group.getChildAt(i);
            if(checkBox.isChecked()) {
                listColor.add(MainActivity.COLORS[i]);
            }
        }

        // retrieve the colors in an array
        int colors[] = new int[listColor.size()];
        for(int i = 0; i < listColor.size(); i++) {
            colors[i] = listColor.get(i);
        }

        Intent intent = new Intent();
        intent.putExtra("colors", colors);
        // return value for the previous activity
        activity.setResult(1, intent);
        activity.finish();
    }
}
