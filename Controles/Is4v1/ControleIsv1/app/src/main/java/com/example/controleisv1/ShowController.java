package com.example.controleisv1;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class ShowController implements View.OnClickListener {

    @Override
    public void onClick(View v) {
        Activity activity = (Activity)v.getContext();
        Intent intent = new Intent(activity, SecondActivity.class);
        activity.startActivityForResult(intent, 1);
    }
}
