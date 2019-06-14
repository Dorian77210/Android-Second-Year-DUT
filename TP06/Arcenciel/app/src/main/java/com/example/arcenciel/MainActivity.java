package com.example.arcenciel;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final int[] COLORS = new int[] {
        Color.RED, Color.parseColor("#e59614"), Color.YELLOW,
                Color.GREEN, Color.BLUE, Color.parseColor("#6719e7"),
                Color.parseColor("#4d3673")
    };

    private int[] colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.colors = COLORS;

        View container = this.findViewById(R.id.container);
        TouchController touchController = new TouchController(this.colors);
        container.setOnTouchListener(touchController);

        View button = this.findViewById(R.id.select_button);
        button.setOnClickListener(new SelectionController());
    }
}
