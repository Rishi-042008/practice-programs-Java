
package com.company.conditionals;
import java.util.Scanner;


public class website_url_using_conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if (a.endsWith(".com")) {
            System.out.println("The given website url is commercial one");
        } else if (a.endsWith(".org")) {
            System.out.println("The given website url is organization one");
        } else if (a.endsWith(".in")) {
            System.out.println("The given website url is Indian one");
        } else {
            System.out.println("unknown url");
        }
    }
}





