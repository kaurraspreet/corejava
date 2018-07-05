package com.example.dell.registration2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  EditText  e1,e2 ;
  EditText e3,e4;
  TextView v1,v2;
  TextView v3,v4,v5,v6 ;
  Button b ,b1;

  android.content.SharedPreferences SharedPreferences = null;
  android.content.SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText)findViewById(R.id.t1);//name
        e2=(EditText)findViewById(R.id.t2);//pass
        e3=(EditText)findViewById(R.id.t3);//email
        e4=(EditText)findViewById(R.id.t4);//numbaer
        v1=(TextView)findViewById(R.id.tv1);
        v2=(TextView)findViewById(R.id.tv2);
        v3=(TextView)findViewById(R.id.tv3);
        v4=(TextView)findViewById(R.id.tv4);
        v5=(TextView)findViewById(R.id.tv5);
        v6=(TextView)findViewById(R.id.tv6);
        b=(Button)findViewById(R.id.button);
        b1=(Button)findViewById(R.id.button1);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sp = getSharedPreferences("userinfo", MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();

                editor.putString("name", e1.getText().toString());
                editor.putString("email", e3.getText().toString());
                editor.putString("num",e4.getText().toString());
                editor.putString("password", e2.getText().toString());
                editor.commit();
                Toast.makeText(MainActivity.this, "you are register successfully", Toast.LENGTH_SHORT).show();
            }
        });



               b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(MainActivity.this, Activity2.class);
                        startActivity(i);}
                    });



               }
    }