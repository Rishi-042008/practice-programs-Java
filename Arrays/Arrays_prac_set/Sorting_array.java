package com.company.Arrays.Arrays_prac_set;
import java.util.Scanner;

public class Sorting_array {
    public static void main(String[] args) {
        int[] marks = {460, 520, 305, 450, 250};
        for (int i = 0; i < marks.length - 1; i++) {
            for (int j = 0; j < marks.length - 1 - i; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
            }
        }
        System.out.println("Array Sorted in Increasing order");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}