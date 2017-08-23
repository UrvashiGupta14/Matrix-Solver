package com.example.abhishekyadav.matrixsolver;

import android.content.Intent;
import android.os.Parcelable;
import android.provider.SyncStateContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class EnterMatrixB extends AppCompatActivity {

    int matrixSize;
    Button size;
    List<Matrix> matrixList;
    GridView gv;
    MatrixAdapter adapter;
    Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_matrix_b);

        Button plus = (Button)findViewById(R.id.plusB);
        Button minus = (Button)findViewById(R.id.minusB);
        size = (Button)findViewById(R.id.sizeB);
        Button save = (Button)findViewById(R.id.saveB);
        cancel = (Button)findViewById(R.id.cancelB);
        gv = (GridView)findViewById(R.id.gvB);

        matrixSize = StorageClass.B.size;



        gv.setNumColumns(matrixSize);
        matrixList = new ArrayList<>();

        for (int i=0;i<matrixSize;i++)
        {
            for (int j=0;j<matrixSize;j++)
            {
                matrixList.add(new Matrix(i,j,StorageClass.B.mat[i][j]));
            }
        }
        adapter=new MatrixAdapter(getApplicationContext(),matrixList);
        gv.setAdapter(adapter);

        size.setText("" + matrixSize);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(matrixSize < 5){
                    matrixSize++;
                    size.setText("" + matrixSize);
                    gv.setNumColumns(matrixSize);
                    StorageClass.B.size = matrixSize;
                    matrixList = new ArrayList<>();
                    for (int i=0;i<matrixSize;i++) {
                        for (int j = 0; j < matrixSize; j++) {
                            matrixList.add(new Matrix(i, j, 0));
                        }
                    }
                    adapter=new MatrixAdapter(getApplicationContext(),matrixList);
                    gv.setAdapter(adapter);

                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(matrixSize>1){
                    matrixSize--;
                    size.setText("" + matrixSize);
                    gv.setNumColumns(matrixSize);
                    matrixList = new ArrayList<>();
                    StorageClass.B.size = matrixSize;
                    for (int i=0;i<matrixSize;i++)
                    {
                        for (int j=0;j<matrixSize;j++)
                        {
                            matrixList.add(new Matrix(i,j,0));
                        }
                    }
                    adapter=new MatrixAdapter(getApplicationContext(),matrixList);
                    gv.setAdapter(adapter);
                }

            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int[][] arrayToBeStored = new int[matrixSize][matrixSize];
                for (int i = 0; i < matrixSize; i++) {
                    for (int j = 0; j < matrixSize; j++) {
                        arrayToBeStored[i][j] = Integer.parseInt(adapter.cellData[i*matrixSize + j].getText().toString());
                    }
                }
                StorageClass.B.enterValues(matrixSize, arrayToBeStored);

            }

        });

    }
   /* @Override
    public void onBackPressed() {

    }*/

}
