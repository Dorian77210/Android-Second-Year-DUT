package com.example.ex1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Controller controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // retrieve components
        Button left = (Button)this.findViewById(R.id.left);
        Button right = (Button)this.findViewById(R.id.right);
        ImageView imageView = (ImageView)this.findViewById(R.id.image);

        this.controller = new Controller(left, right, imageView);
    }
}
