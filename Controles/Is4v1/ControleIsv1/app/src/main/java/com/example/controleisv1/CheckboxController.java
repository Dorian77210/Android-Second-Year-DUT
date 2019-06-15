package com.example.controleisv1;

import android.util.Log;
import android.widget.CompoundButton;

public class CheckboxController implements CompoundButton.OnCheckedChangeListener {

    private Model model;

    private CustomView customView;

    public CheckboxController(CustomView customView, Model model) {
        this.customView = customView;
        this.model = model;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        int id = buttonView.getId();

        if(id == R.id.small) {
            this.model.setSelected(Model.SMALL_SELECTED_INDEX, isChecked);
        } else if(id == R.id.medium) {
            this.model.setSelected(Model.MEDIUM_SELECTED_INDEX, isChecked);
        } else if(id == R.id.large) {
            this.model.setSelected(Model.LARGE_SELECTED_INDEX, isChecked);
        }

        this.customView.postInvalidate();
    }
}
