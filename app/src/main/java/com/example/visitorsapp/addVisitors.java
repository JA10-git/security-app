package com.example.visitorsapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class addVisitors extends AppCompatActivity {
    EditText et1,et2,et3,et4;
    String s1,s2,s3,s4;
    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_visitors);

        et1=(EditText) findViewById(R.id.e1);
        et2=(EditText) findViewById(R.id.e2);
        et3=(EditText) findViewById(R.id.e3);
        et4=(EditText) findViewById(R.id.e4);
        bt1=(Button) findViewById(R.id.b3);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=et1.getText().toString();
                s2=et2.getText().toString();
                s3=et3.getText().toString();
                s4=et4.getText().toString();
                Toast.makeText(getApplicationContext(),s1+s2+s3+s4,Toast.LENGTH_LONG).show();
            }
        });

    }
}