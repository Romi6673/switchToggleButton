package com.example.switchtogglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ToggleButton;
import android.widget.Switch;
import android.widget.Button;

import android.os.Bundle;



public class MainActivity extends AppCompatActivity {

    ToggleButton tb;
    Switch switch1;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb = (ToggleButton) findViewById(R.id.tb);
        switch1 = (Switch) findViewById(R.id.switch1);
        btn = (Button) findViewById(R.id.btn);

    }

    public void go(View view) {
        if (switch1.isChecked() && tb.isChecked()) {
            getWindow().setBackgroundDrawableResource(R.drawable.red);
        }else if (switch1.isChecked()==false &&  tb.isChecked()){
            getWindow().setBackgroundDrawableResource(R.drawable.blue);
        }else if (switch1.isChecked()==false &&  tb.isChecked()==false){
            getWindow().setBackgroundDrawableResource(R.drawable.green);
        }else if (switch1.isChecked()&&  tb.isChecked()==false){
            getWindow().setBackgroundDrawableResource(R.drawable.yellow);
        }


    }
}