package com.example.abhishekyadav.matrixsolver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AddOptions extends AppCompatActivity {
    AdderClass ac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_options);
         ac = new AdderClass();

        Button b1= (Button)findViewById(R.id.button1);
        Button b2= (Button)findViewById(R.id.button2);
        Button b3= (Button)findViewById(R.id.button3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ac.addThem(0);
                Toast.makeText(AddOptions.this, "added A and B, result stored in C\nPress back button to view C",
                        Toast.LENGTH_LONG).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ac.addThem(1);
                Toast.makeText(AddOptions.this, "added λ and A, result stored in C\nPress back button to view C",
                        Toast.LENGTH_LONG).show();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ac.addThem(2);
                Toast.makeText(AddOptions.this, "added λ and B, result stored in C\nPress back button to view C",
                        Toast.LENGTH_LONG).show();
            }
        });

    }
}
