package com.example.abhishekyadav.matrixsolver;

/**
 * Created by Abhishek Yadav on 23-08-2017.
 */

public class AdderClass {

    void addThem(int type){
        if(type == 0){
            StorageClass.C.size = StorageClass.A.size;
            int[][] array = new int[StorageClass.C.size][StorageClass.C.size];
            for(int i = 0 ; i < StorageClass.A.size ; i++){
                for(int j=0 ; j<StorageClass.A.size ; j++){
                    array[i][j] = StorageClass.A.mat[i][j] + StorageClass.B.mat[i][j];
                }
            }
            StorageClass.C.enterValues(StorageClass.C.size,array);
        } else if(type == 1){
            StorageClass.C.size = StorageClass.A.size;
            int[][] array = new int[StorageClass.C.size][StorageClass.C.size];
            for(int i = 0 ; i < StorageClass.A.size ; i++){
                for(int j=0 ; j<StorageClass.A.size ; j++){
                    array[i][j] = StorageClass.A.mat[i][j] + StorageClass.D;
                }
            }
            StorageClass.C.enterValues(StorageClass.C.size,array);
        } else if(type == 2){
            StorageClass.C.size = StorageClass.B.size;
            int[][] array = new int[StorageClass.C.size][StorageClass.C.size];
            for(int i = 0 ; i < StorageClass.B.size ; i++){
                for(int j=0 ; j<StorageClass.B.size ; j++){
                    array[i][j] = StorageClass.B.mat[i][j] + StorageClass.D;
                }
            }
            StorageClass.C.enterValues(StorageClass.C.size,array);
        }

    }

}
