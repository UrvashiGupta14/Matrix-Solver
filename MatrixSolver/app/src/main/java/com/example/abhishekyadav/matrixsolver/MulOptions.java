package com.example.abhishekyadav.matrixsolver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MulOptions extends AppCompatActivity {
    MulClass mc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mul_options);
        mc = new MulClass();
        Button b1= (Button)findViewById(R.id.button1);
        Button b2= (Button)findViewById(R.id.button2);
        Button b3= (Button)findViewById(R.id.button3);
        Button b4= (Button)findViewById(R.id.button4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mc.mulThem(0);
                Toast.makeText(MulOptions.this, "multiplied A * B, result stored in C\nPress back button to view C",
                        Toast.LENGTH_LONG).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mc.mulThem(1);
                Toast.makeText(MulOptions.this, "multiplied B * A, result stored in C\nPress back button to view C",
                        Toast.LENGTH_LONG).show();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mc.mulThem(2);
                Toast.makeText(MulOptions.this, "multiplied A * λ, result stored in C\nPress back button to view C",
                        Toast.LENGTH_LONG).show();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mc.mulThem(3);
                Toast.makeText(MulOptions.this, "multiplied B * λ, result stored in C\nPress back button to view C",
                        Toast.LENGTH_LONG).show();
            }
        });


    }
}
