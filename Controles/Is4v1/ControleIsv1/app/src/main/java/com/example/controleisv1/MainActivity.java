package com.example.controleisv1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create the model and give it to the view
        Model model = new Model();
        CustomView customView = (CustomView)this.findViewById(R.id.main_view);
        customView.initModel(model);

        // retrieve the checkbox and give them controller
        CheckboxController checkboxController = new CheckboxController(customView, model);

        CheckBox small = (CheckBox)this.findViewById(R.id.small);
        CheckBox medium = (CheckBox)this.findViewById(R.id.medium);
        CheckBox large = (CheckBox)this.findViewById(R.id.large);

        small.setOnCheckedChangeListener(checkboxController);
        medium.setOnCheckedChangeListener(checkboxController);
        large.setOnCheckedChangeListener(checkboxController);

        // retrieve button and give it a controller to pass to the second activity
        Button showButton = (Button)this.findViewById(R.id.show_button);
        showButton.setOnClickListener(new ShowController());
    }
}
