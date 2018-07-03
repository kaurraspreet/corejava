package com.example.dell.registration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  Button b;
  EditText ed1,ed2;
  TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            b = (Button) findViewById(R.id.button);
            ed1 = (EditText) findViewById(R.id.t2);
            ed2 = (EditText) findViewById(R.id.t4);
            t1=(TextView)findViewById(R.id.tv);
            t2=(TextView)findViewById(R.id.textView);


            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                 Intent i= new Intent(MainActivity.this,activity3.class);
                 i.putExtra("user",ed1.getText().toString());
                 i.putExtra("password",ed2.getText().toString());
                 startActivity(i);

                }
            });



}
}
