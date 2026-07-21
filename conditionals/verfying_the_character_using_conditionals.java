package com.company.conditionals;
import java.util.Scanner;

public class verfying_the_character_using_conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char d = sc.next().charAt(0);
        System.out.println("the given letter is " + d);
        if (d >= 'a' && d <= 'z') {
            System.out.println("The "+ d +" is small letter");
        } else if (d >= 'A' && d <= 'Z') {
            System.out.println("The "+ d +" is capital letter");
        } else if (d >= '0' && d <= '9') {
            System.out.println("The "+ d +" is Digit");
        } else {
            System.out.println("The"+ d +" is special symbol");
        }
    }
}
