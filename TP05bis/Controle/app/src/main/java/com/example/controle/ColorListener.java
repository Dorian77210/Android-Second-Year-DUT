package com.example.controle;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.TextView;

public class ColorListener implements TextView.OnEditorActionListener {

    private Model model;

    public ColorListener(Model model) {
        this.model = model;
    }

    @Override
    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
        String color = "";

        try {
            color = v.getText().toString();
            int colorRGB = Color.parseColor(color);

            this.model.setColor(colorRGB);
        } catch(IllegalArgumentException exception) {
            String errorMessage = "Invalid color format";
            v.setError(errorMessage);
            Activity activity = (Activity)v.getContext();
            Intent intent = new Intent(activity, ErrorActivity.class);
            intent.putExtra(BundleConstants.ERROR_MESSAGE, errorMessage);
            intent.putExtra(BundleConstants.ERROR_COLOR, color);
            activity.startActivityForResult(intent, 1);
        }

        return true;
    }
}
