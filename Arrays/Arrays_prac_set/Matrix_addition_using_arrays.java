package com.company.Arrays.Arrays_prac_set;
import java.util.Scanner;

public class Matrix_addition_using_arrays {
    public static void main(String[] args) {
        int [][] m={{1,2,3},
                {4,5,6} };

        int [][] n={{7,8,9},{4,2,5}};
        int [][] x=new int[2][3];
        for(int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                x[i][j]=n[i][j]+m[i][j];
            }}
        for(int i=0;i<2;i++){
            for (int j=0;j<3;j++) {
                System.out.print(x[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}