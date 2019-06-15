package com.example.controleisv1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // retrieve the main view and add a listener
        TextView textView = (TextView)this.findViewById(R.id.second_main_view);
        GestureDetector detector = new GestureDetector(new GestureController(this));
        textView.setOnTouchListener(new TouchController(detector));
    }
}
