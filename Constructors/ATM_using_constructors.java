package com.company.Constructors;
import java.util.Scanner;

public class ATM_using_constructors {
    static class ATM{
        private double balance;
        public ATM(double initialbalance){
           if(initialbalance>=0) {
               balance = initialbalance;
           }
               else{
               System.out.println("invalid balance , default 0 is assigned");
               balance=0;
               }
        }

        public double getBalance() {
            return balance;
        }
        public double deposit(double amount){
            if(amount>0){
            balance+=amount;
            }
            else {
                System.out.println("Invalid amount");
            }
            return balance;
        }
        public double withdraw(double amount){
            if(amount>0){
                if(amount<=balance){
                    balance-=amount;
                }
                else
                    System.out.println("Insufficient balance!");
            }
            else
                System.out.println("Invalid amount");

            return balance;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ATM Raj=new ATM(10000);
        System.out.println("The balance of your account is "+Raj.getBalance());
        System.out.println("Enter your deposit: ");
        Raj.deposit(sc.nextDouble());
        System.out.println("Remaining balance = "+Raj.getBalance());
        System.out.println("Enter the amount you are going to withdraw:");
        Raj.withdraw(sc.nextDouble());
        System.out.println("Remaining balance = "+Raj.getBalance());
    }
}