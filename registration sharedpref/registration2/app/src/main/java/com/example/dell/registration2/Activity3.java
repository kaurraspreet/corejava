package com.example.dell.registration2;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {
  TextView info1,info2,info3;
  SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        info1=(TextView)findViewById(R.id.t5);
        info2=(TextView)findViewById(R.id.txt1);
        info3=(TextView)findViewById(R.id.txt2);


        sp=getSharedPreferences("userinfo",MODE_PRIVATE);
        info1.setText(sp.getString("name",""));
        info2.setText(sp.getString("email",""));
        info3.setText(sp.getString("num",""));

    }
}
