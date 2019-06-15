package com.example.controle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Model model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.model = new Model();

        // retrieve all the views
        TextView xView = (TextView)this.findViewById(R.id.x);
        TextView yView = (TextView)this.findViewById(R.id.y);
        TextView rView = (TextView)this.findViewById(R.id.r);

        EditText colorEdit = (EditText)this.findViewById(R.id.edit_color);
        CustomView mainView = (CustomView)this.findViewById(R.id.main_view);
        mainView.setModel(this.model);

        // add the listener for the edit text
        colorEdit.setOnEditorActionListener(new ColorListener(this.model));

        // touch controller for the main view
        GestureController gestureController = new GestureController(xView, yView, rView, mainView, this.model);
        GestureDetector detector = new GestureDetector(this, gestureController);
        mainView.setOnTouchListener(new TouchController(detector));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putFloat(BundleConstants.INITIAL_Y, this.model.initialY);
        outState.putFloat(BundleConstants.INITIAL_X, this.model.initialX);
        outState.putFloat(BundleConstants.LAST_Y, this.model.lastY);
        outState.putFloat(BundleConstants.LAST_X, this.model.lastX);
        outState.putInt(BundleConstants.COLOR, this.model.getColor());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        this.model.lastX = savedInstanceState.getFloat(BundleConstants.LAST_Y);
        this.model.lastY = savedInstanceState.getFloat(BundleConstants.LAST_X);
        this.model.initialY = savedInstanceState.getFloat(BundleConstants.INITIAL_X);
        this.model.initialX = savedInstanceState.getFloat(BundleConstants.INITIAL_Y);
        this.model.setColor(savedInstanceState.getInt(BundleConstants.COLOR));
    }
}
