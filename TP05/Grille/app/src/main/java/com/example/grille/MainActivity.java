package com.example.grille;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomView c = (CustomView)this.findViewById(R.id.view1);
        GestureDetector d = new GestureDetector(this, new EventController(c));
        new TouchController(c, d);

        c = (CustomView)this.findViewById(R.id.view2);
        d = new GestureDetector(this, new EventController(c));
        new TouchController(c, d);

        c = (CustomView)this.findViewById(R.id.view3);
        d = new GestureDetector(this, new EventController(c));
        new TouchController(c, d);

        c = (CustomView)this.findViewById(R.id.view4);
        d = new GestureDetector(this, new EventController(c));
        new TouchController(c, d);

        c = (CustomView)this.findViewById(R.id.view5);
        d = new GestureDetector(this, new EventController(c));
        new TouchController(c, d);

        c = (CustomView)this.findViewById(R.id.view6);
        d = new GestureDetector(this, new EventController(c));
        new TouchController(c, d);

        c = (CustomView)this.findViewById(R.id.view7);
        d = new GestureDetector(this, new EventController(c));
        new TouchController(c, d);

        c = (CustomView)this.findViewById(R.id.view8);
        d = new GestureDetector(this, new EventController(c));
        new TouchController(c, d);

        c = (CustomView)this.findViewById(R.id.view9);
        d = new GestureDetector(this, new EventController(c));
        new TouchController(c, d);
    }
}
