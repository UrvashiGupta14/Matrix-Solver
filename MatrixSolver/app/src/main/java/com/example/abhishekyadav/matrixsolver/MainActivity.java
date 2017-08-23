package com.example.abhishekyadav.matrixsolver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    int sizeA;
    int[][] A;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button a = (Button)findViewById(R.id.A);
        Button b = (Button)findViewById(R.id.B);
        Button c = (Button)findViewById(R.id.C);
        Button d = (Button)findViewById(R.id.D);
        Button add = (Button)findViewById(R.id.add);
        Button sub = (Button)findViewById(R.id.sub);
        Button mul = (Button)findViewById(R.id.mul);
        //Button det = (Button)findViewById(R.id.det);

        initialize();

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toStartMatrixEnteringActivity(0);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toStartMatrixEnteringActivity(1);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toStartMatrixEnteringActivity(2);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toStartMatrixEnteringActivity(3);
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(MainActivity.this,AddOptions.class);
                startActivity(i1);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(MainActivity.this,SubOptions.class);
                startActivity(i1);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(MainActivity.this,MulOptions.class);
                startActivity(i1);
            }
        });
    }

    void initialize(){

        int size = 2;
        int[][] array = new int[size][size];
        StorageClass.A = new StorageForMatrix();
        StorageClass.A.enterValues(size,array);
        StorageClass.B = new StorageForMatrix();
        StorageClass.B.enterValues(size,array);
        StorageClass.C = new StorageForMatrix();
        StorageClass.C.enterValues(size,array);
        StorageClass.D = 1;
    }

    void toStartMatrixEnteringActivity(int whichMatrix){
        Intent i;
        switch(whichMatrix){
            case 0:
                i = new Intent(this,EnterMatrix.class);
                i.putExtra("whichMatrix",0);
                startActivity(i);
                break;
            case 1:
                i = new Intent(this,EnterMatrixB.class);
                i.putExtra("whichMatrix",0);
                startActivity(i);
                break;
            case 2:
                i = new Intent(this,EnterMatrixC.class);
                i.putExtra("whichMatrix",0);
                startActivity(i);
                break;
            case 3:
                i = new Intent(this,EnterConstantD.class);
                i.putExtra("whichMatrix",0);
                startActivity(i);
                break;
        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();



    }
}
