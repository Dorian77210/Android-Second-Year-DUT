package com.example.ex3;

import android.view.View;
import android.widget.EditText;

public class FieldController implements View.OnFocusChangeListener {

    private EditText celciusField;
    private EditText fahrenheitField;

    public FieldController(EditText celciusField, EditText fahrenheitField) {
        this.celciusField = celciusField;
        this.fahrenheitField = fahrenheitField;

        this.celciusField.setOnFocusChangeListener(this);
        this.fahrenheitField.setOnFocusChangeListener(this);
    }

    @Override
    public void onFocusChange(View view, boolean hasFocus) {
        if(!hasFocus) {
            if(view instanceof EditText) {
                EditText field = (EditText)view;
                double value = 0.0;

                if(field.equals(this.celciusField)) {
                    value = Double.parseDouble(this.celciusField.getText().toString());
                    this.fahrenheitField.setText("" + Conversion.degreeToFahrenheit(value));
                } else if(field.equals(this.fahrenheitField)) {
                    value = Double.parseDouble(this.fahrenheitField.getText().toString());
                    this.celciusField.setText("" + Conversion.fahrenheitToDegree(value));
                }
            }
        }
    }
}
