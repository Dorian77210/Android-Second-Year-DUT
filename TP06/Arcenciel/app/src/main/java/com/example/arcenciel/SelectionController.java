package com.example.arcenciel;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;

public class SelectionController implements View.OnClickListener {

    @Override
    public void onClick(View view) {
        Activity activity = (Activity)view.getContext();
        Intent intent = new Intent(activity, SelectionActivity.class);
        activity.startActivityForResult(intent, 0);
    }
}
