
package com.company.conditionals;
import java.util.Scanner;


public class Tax_percentage_calculation_using_conditonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary:");
        int sal= sc.nextInt();

        if(sal<=500000 && sal>250000){
            System.out.println("Tax = 5%");
        } else if (sal<=1000000 && sal>500000) {
            System.out.println("Tax = 20%");
        } else if (sal>1000000) {
            System.out.println("Tax = 30%");
        }
        else {
            System.out.println("No Tax");
        }
    }
}