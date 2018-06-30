package com.example.dell.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast t= Toast.makeText(getApplicationContext(), "onCreate invoked", Toast.LENGTH_SHORT);
                t.show();
    }

    protected void onStart()
    {
     super.onStart();
     setContentView(R.layout.activity_main);
     Toast t=Toast.makeText(getApplicationContext(), "onStart invoked",Toast.LENGTH_LONG);
     t.setGravity(Gravity.CENTER,0,0);
     t.show();
    }

    protected void onResume()
    {
        super.onResume();
        setContentView(R.layout.activity_main);
        Toast t=Toast.makeText(getApplicationContext(),"onResume invoked",Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER, 0,0);
        t.show();
    }

    protected void  onPause()
    {
        super.onPause();
        setContentView(R.layout.activity_main);
        Toast t= Toast.makeText(getApplicationContext(),"onpause invoked",Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER,0,0);
        t.show();
    }

    protected void onStop()
    {
        super.onStop();
        setContentView(R.layout.activity_main);
        Toast t=Toast.makeText(getApplicationContext(),"onstop invoked" ,Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER,0,0);
        t.show();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        setContentView(R.layout.activity_main);
        Toast t=Toast.makeText(getApplicationContext(),"ondestroy invoked",Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER,0,0);
        t.show();
    }

    protected void onRestart()
    {
        super.onRestart();
        setContentView(R.layout.activity_main);
        Toast t= Toast.makeText(getApplicationContext(),"onrestart invoked",Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER,0,0);
        t.show();
    }

}
