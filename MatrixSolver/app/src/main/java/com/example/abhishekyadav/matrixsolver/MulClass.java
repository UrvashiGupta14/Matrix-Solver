package com.example.abhishekyadav.matrixsolver;

/**
 * Created by Abhishek Yadav on 24-08-2017.
 */

public class MulClass {

    void mulThem(int type){
        int n;
        if(type == 0){
            n = StorageClass.C.size = StorageClass.A.size;
            int[][] c = new int[n][n];
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    for (int k = 0; k < n; k++)
                    {
                        c[i][j] = c[i][j] + StorageClass.A.mat[i][k] * StorageClass.B.mat[k][j];
                    }
                }
            }
            StorageClass.C.enterValues(StorageClass.C.size,c);
        } else if (type == 1) {
            n = StorageClass.C.size = StorageClass.A.size;
            int[][] c = new int[n][n];
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    for (int k = 0; k < n; k++)
                    {
                        c[i][j] = c[i][j] + StorageClass.B.mat[i][k] * StorageClass.A.mat[k][j];
                    }
                }
            }
            StorageClass.C.enterValues(StorageClass.C.size,c);
        } else if (type == 2){
            n = StorageClass.C.size = StorageClass.A.size;
            int[][] c = new int[n][n];
            for(int i = 0 ; i < StorageClass.A.size ; i++){
                for(int j=0 ; j<StorageClass.A.size ; j++){
                    c[i][j] = StorageClass.A.mat[i][j] * StorageClass.D;
                }
            }
            StorageClass.C.enterValues(StorageClass.C.size,c);
        } else if (type == 3){
            n = StorageClass.C.size = StorageClass.B.size;
            int[][] c = new int[n][n];
            for(int i = 0 ; i < StorageClass.B.size ; i++){
                for(int j=0 ; j<StorageClass.B.size ; j++){
                    c[i][j] = StorageClass.B.mat[i][j] * StorageClass.D;
                }
            }
            StorageClass.C.enterValues(StorageClass.C.size,c);
        }
    }

}
