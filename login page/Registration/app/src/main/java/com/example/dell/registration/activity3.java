package com.example.dell.registration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class activity3 extends AppCompatActivity {
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity3);


             t = (TextView) findViewById(R.id.t2);
            Bundle b = getIntent().getExtras();
            String user = b.getString("user");
            String pass = b.getString("password");


            if (user.equals("admin") && pass.equals("password"))
                t.setText("username" + user + "  you logged in successfully");
            else
                t.setText("wrong user name or password");


    }
}