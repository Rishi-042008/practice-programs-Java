package com.company;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class RPS {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int ui=sc.nextInt();
        switch (ui) {
            case 1:
                System.out.println("Rock");
                break;
            case 2:
                System.out.println("Paper");
                break;
            case 3:
                System.out.println("scissors");
                break;

        }
        Random r=new Random();
        int ci= r.nextInt(3)+1;
        switch (ci) {
            case 1:
                System.out.println("Rock");
                break;
            case 2:
                System.out.println("Paper");
                break;
            case 3:
                System.out.println("scissors");
                break;
        }

        if(ci==ui){
            System.out.println("The match is draw");
        } else if (ci==1 && ui==2) {
            System.out.println("user is the winner");
        } else if (ci==1 && ui==3) {
            System.out.println("computer is the winner");
        } else if (ci==2 && ui==1) {
            System.out.println("computer is the winner");
        } else if (ci==2 && ui==3) {
            System.out.println("user is the winner");
        } else if (ci==3 && ui==1) {
            System.out.println("user is the winner");
        } else if (ci==3 && ui==2) {
            System.out.println("computer is the winner");
        }



    }
}