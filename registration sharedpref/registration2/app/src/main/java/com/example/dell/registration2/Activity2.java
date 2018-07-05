package com.example.dell.registration2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Map;

public class Activity2 extends AppCompatActivity {
    TextView uname, upass;
    EditText usrname, usrpass;
    Button bt;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        uname = (TextView) findViewById(R.id.t5);
        upass = (TextView) findViewById(R.id.t6);
        usrname = (EditText) findViewById(R.id.e1);
        usrpass = (EditText) findViewById(R.id.e2);
        bt = (Button) findViewById(R.id.button2);


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sp = getSharedPreferences("userinfo", MODE_PRIVATE);
                final String user = sp.getString("name", "");
                final String pass = sp.getString("password", "");

                final String str1 = usrname.getText().toString();
                final String str2 = usrpass.getText().toString();
                if (str1.equals(user) && str2.equals(pass)) {
                    Toast t = Toast.makeText(getApplicationContext(), "you are logged in successfully", Toast.LENGTH_LONG);
                    t.show();
                    Intent i = new Intent(Activity2.this, Activity3.class);
                    startActivity(i);
                }
            }
        });
    }
}
