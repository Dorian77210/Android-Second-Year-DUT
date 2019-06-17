package com.example.ex2;

import android.widget.RadioGroup;

public class Controller implements RadioGroup.OnCheckedChangeListener {

    private CustomView view;

    public Controller(CustomView view) {
        this.view= view;
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if(checkedId == R.id.circle) {
            this.view.setShape(CustomView.Shape.CIRCLE);
        } else if(checkedId == R.id.triangle) {
            this.view.setShape(CustomView.Shape.TRIANGLE);
        } else if(checkedId == R.id.cross) {
            this.view.setShape(CustomView.Shape.CROSS);
        } else if(checkedId == R.id.square) {
            this.view.setShape(CustomView.Shape.SQUARE);
        }
    }
}
