
package com.company.conditionals;
import java.util.Scanner;


public class Leap_year_calculation_using_condtionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year ");
        int y = sc.nextInt();

        if ((y % 4 == 0) && (y % 100 != 0 || y % 400 == 0)) {
            System.out.println("The given year is leap year");
        } else {
            System.out.println("The given year is not a leap year");
        }
    }
}