package com.company.Arrays.Arrays_prac_set;
import java.util.Scanner;

public class Reverse_array_using_swapping {
    public static void main(String[] args) {
        float[] marks = {1, 2, 3, 4, 5, 6, 7};
        int a = Math.floorDiv(marks.length, 2);
        int l = marks.length;
        for (int i = 0; i < a; i++) {
            //swap
            float temp = marks[i];
            marks[i] = marks[l - i - 1];
            marks[l - i - 1] = temp;
        }
        System.out.println("The reversed array is:");
        for (float d : marks) {

            System.out.print(d + " ");
        }
    }
}