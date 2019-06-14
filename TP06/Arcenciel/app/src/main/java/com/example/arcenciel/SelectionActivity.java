package com.example.arcenciel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class SelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        ViewGroup group = this.findViewById(R.id.selection_container);
        View button = this.findViewById(R.id.ok_button);
        button.setOnClickListener(new ButtonController(group));
    }
}
