package de.mubn.vorlesung.exampleapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LayoutExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int layoutType = getIntent().getExtras().getInt(MainActivity.KEY_LAYOUT_TYPE);

        if(layoutType == R.id.btn_layout_example_linear){
            setContentView(R.layout.activity_layout_example_linear);
        }else if(layoutType == R.id.btn_layout_example_frame){
            setContentView(R.layout.activity_layout_example_frame);
        }else{
            setContentView(R.layout.activity_layout_example);
        }


    }
}
