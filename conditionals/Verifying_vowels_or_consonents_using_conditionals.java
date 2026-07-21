package com.company.conditionals;
import java.util.Scanner;

public class Verifying_vowels_or_consonents_using_conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char q = sc.next().charAt(0);
        if (q == 'a' || q == 'A' || q == 'E' || q == 'e' || q == 'i' || q == 'I' || q == 'o' || q == 'O' || q == 'u' || q == 'U') {
            System.out.println("The given character is vowel");
        } else {
            System.out.println("The given character is consonants");
        }
    }
}