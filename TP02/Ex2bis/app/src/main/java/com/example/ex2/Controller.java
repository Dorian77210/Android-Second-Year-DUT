package com.example.ex2;

import android.widget.RadioGroup;

public class Controller implements RadioGroup.OnCheckedChangeListener {

    private CustomView customView;

    public Controller(RadioGroup radioGroup, CustomView customView) {
        radioGroup.setOnCheckedChangeListener(this);

        this.customView = customView;
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int id) {
        CustomView.Shap shap = null;
        if(id == R.id.cross) {
            shap = CustomView.Shap.CROSS;
        } else if(id == R.id.oval) {
            shap = CustomView.Shap.OVAL;
        } else if(id == R.id.square) {
            shap = CustomView.Shap.SQUARE;
        } else if(id == R.id.triangle) {
            shap = CustomView.Shap.TRIANGLE;
        }

        this.customView.setShap(shap);
    }
}
