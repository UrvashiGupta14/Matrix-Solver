package com.example.abhishekyadav.matrixsolver;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;

import java.util.List;

/**
 * Created by Abhishek Yadav on 23-08-2017.
 */

public class MatrixAdapter extends BaseAdapter {
    Context context;
    List<Matrix> matrixList;
    EditText[] cellData;

    public MatrixAdapter(Context context, List<Matrix> matrixList) {
        this.context = context;
        this.matrixList = matrixList;
        cellData = new EditText[matrixList.size()];
    }

    @Override
    public int getCount() {
        return matrixList.size();
    }

    /*@Override
    public Object getItem(int i) {
        return matrixList.get(i);
    }*/

    @Override
    public Object getItem(int i) {
        return cellData[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        EditText cell;

        if (cellData[i]==null){
            cell = cellData[i] = new EditText(context);
            cell.setText("" + matrixList.get(i).val);
        }
        else
            cell = cellData[i];


        /*View v=View.inflate(context,R.layout.griditem,null);*/

        return cell;
    }
}