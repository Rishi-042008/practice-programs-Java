package com.company;
import java.util.Scanner;
public class sense {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array:");
        int [] a = new int[sc.nextInt()];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<a.length;i++){
            a[i]= sc.nextInt();
        }
        int mid;
        for(int i=0;i< a.length/2;i++){

                int temp = a[i];
                a[i]=a[a.length-1-i];
                a[a.length-1-i]=temp;
        }
        for(int j=0;j<a.length;j++){
            System.out.print(a[j]+" ");
        }
    }
}