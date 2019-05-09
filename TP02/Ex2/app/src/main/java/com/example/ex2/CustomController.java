package com.example.ex2;

import android.widget.RadioGroup;

public class CustomController implements RadioGroup.OnCheckedChangeListener {

    private CustomView view;

    public CustomController(RadioGroup group, CustomView view) {
        this.view = view;
        group.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int id) {
        CustomView.DrawnFigure figure = null;
        if(id == R.id.circle) {
            figure = CustomView.DrawnFigure.CIRCLE;
        } else if(id == R.id.cross) {
            figure = CustomView.DrawnFigure.CROSS;
        } else if(id == R.id.square) {
            figure = CustomView.DrawnFigure.SQUARE;
        } else if(id == R.id.triangle) {
            figure = CustomView.DrawnFigure.TRIANGLE;
        }

        this.view.setDrawnFigure(figure);
    }
}
