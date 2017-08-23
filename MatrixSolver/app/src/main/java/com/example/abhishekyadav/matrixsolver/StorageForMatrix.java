package com.example.abhishekyadav.matrixsolver;

/**
 * Created by Abhishek Yadav on 23-08-2017.
 */

public class StorageForMatrix {
    int[][] mat;
    int size;
    public StorageForMatrix(){
        mat=new int[size][size];
        for(int i=0 ; i<size ; i++){
            for(int j=0 ; j<size ; j++){
                mat[i][j] = 1;
            }
        }
    }
    void enterValues(int size , int[][] array){
        this.size = size;
        mat = new int[size][size];
        for(int i=0 ; i<size ; i++){
            for(int j=0 ; j<size ; j++){
                mat[i][j] = array[i][j];
            }
        }
    }

}
