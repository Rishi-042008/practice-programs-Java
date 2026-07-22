package com.company.conditionals;
import java.util.Random;
import java.util.Scanner;

public class RPS_and_odd_even_count_using_conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /* int n=sc.nextInt();
        int ecount = 0;
        int ocount= 0;
        for(int i=0;i<=n;i++){
            System.out.println("Enter the value :");
            int num=sc.nextInt();
            if(num%2==0){
               ecount++;
            }else {
                ocount++;
            }
        }
        System.out.println("The even count is "+ecount);
        System.out.println("The odd count is "+ocount);*/
        System.out.println("Enter your option 1-3");
        int a=sc.nextInt( );
        switch (a){
            case 1:
                System.out.println("rock");
                break;
            case 2:
                    System.out.println("paper");
                    break;
            case 3:
                System.out.println("scissor");
                break;
        }
        Random r=new Random();
        int i=r.nextInt(3)+1;
            switch (i){
                case 1:
                    System.out.println("rock");
                    break;
                case 2:
                    System.out.println("paper");
                    break;
                case 3:
                    System.out.println("scissor");
                    break;
            }
            if(a==1 && i==1 ||a==2 && i==2 || a==3 && i==3  ){
                System.out.println("Draw");
        } else if (a==1 && i==2) {
                System.out.println("computer is winner");
            } else if (a==1 && i==3) {
                System.out.println("user is winner");
            }else if(a==2 && i==1){
                System.out.println("user is winner");
            } else if (a==2 && i==3) {
                System.out.println("computer is winner");
            } else if (a==3 && i==1) {
                System.out.println("computer is winner");
            } else if (a == 3 && i==2) {
                System.out.println("user is winner");
            }

    }}
