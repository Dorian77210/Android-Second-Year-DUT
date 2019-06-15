package com.example.controle;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class ButtonController implements View.OnClickListener {


    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        Activity activity = (Activity)v.getContext();
        activity.setResult(1, intent);
        activity.finish();
    }
}
