package com.example.abhishekyadav.matrixsolver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SubOptions extends AppCompatActivity {
    SubClass sc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_options);
        sc = new SubClass();

        Button b1= (Button)findViewById(R.id.button1);
        Button b2= (Button)findViewById(R.id.button2);
        Button b3= (Button)findViewById(R.id.button3);
        Button b4= (Button)findViewById(R.id.button4);
        Button b5= (Button)findViewById(R.id.button5);
        Button b6= (Button)findViewById(R.id.button6);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sc.subThem(0);
                Toast.makeText(SubOptions.this, "subtracted A - B, result stored in C\nPress back button to view C",
                        Toast.LENGTH_LONG).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sc.subThem(1);
                Toast.makeText(SubOptions.this, "subtyracted B - A, result stored in C\nPress back button to view C",
                        Toast.LENGTH_LONG).show();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sc.subThem(2);
                Toast.makeText(SubOptions.this, "added λ - A, result stored in C\nPress back button to view C",
                        Toast.LENGTH_LONG).show();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sc.subThem(3);
                Toast.makeText(SubOptions.this, "added A - λ, result stored in C\nPress back button to view C",
                        Toast.LENGTH_LONG).show();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sc.subThem(4);
                Toast.makeText(SubOptions.this, "added λ - B, result stored in C\nPress back button to view C",
                        Toast.LENGTH_LONG).show();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sc.subThem(5);
                Toast.makeText(SubOptions.this, "added B - λ, result stored in C\nPress back button to view C",
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
