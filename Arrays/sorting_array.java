package com.company.Arrays;
import java.util.Scanner;


public class sorting_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no elements:");
        int[] a = new int[sc.nextInt()];
        System.out.println("enter the array a elements");
        for (int i = 0; i <a.length; i++) {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                 int temp = a[j];
                 a[j]=a[j+1];
                 a[j+1]=temp;
                }
            }
        }
        for (int i = 0; i <a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}