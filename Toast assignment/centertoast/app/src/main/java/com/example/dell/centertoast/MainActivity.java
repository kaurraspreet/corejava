package com.example.dell.centertoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast t= Toast.makeText(getApplicationContext(),"hello toast align center",Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER, 0,0i);
        t.show();
    }
}
