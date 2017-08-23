package com.example.abhishekyadav.matrixsolver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EnterConstantD extends AppCompatActivity {

    EditText constantValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_constant_d);

        constantValue = (EditText)findViewById(R.id.edittextD);
        Button save = (Button)findViewById(R.id.saveD);
        Button cancel = (Button)findViewById(R.id.cancelD);

        constantValue.setText("" + StorageClass.D);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StorageClass.D = Integer.parseInt(constantValue.getText().toString());
            }
        });

    }
}
