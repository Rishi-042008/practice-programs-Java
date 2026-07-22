package com.company.Constructors;
import java.util.Scanner;


abstract class BankAccount{
    public String accountHolder;
    public double balance;


    public double deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount that you are going to deposit");
        double amount=sc.nextDouble();
        return balance=amount+balance;
    }

    abstract double abstractWithdraw();
}

class SavingsAccount extends BankAccount{
    Scanner sc = new Scanner(System.in);

    SavingsAccount(String accountHolder, double balance){
        super();
        this.accountHolder=accountHolder;
        this.balance= balance;
    }

    @Override
    double abstractWithdraw() {
        System.out.println("Enter the withdraw amount:");
        double withdrawAmount = sc.nextDouble();
        if(balance*0.9<withdrawAmount){
            System.out.println("Withdraw less than 90% money ");
            return 0;
        }
        else {
            System.out.println("You withdraw "+(balance-withdrawAmount)+"form the account");
            return balance-withdrawAmount;
        }
    }

}

class CurrentAccount extends BankAccount{
    Scanner sc = new Scanner(System.in);
    CurrentAccount(String accountHolder,double balance){
        super();
        this.accountHolder =accountHolder;
        this.balance = balance;
    }
    double abstractWithdraw(){
        System.out.println("Enter the withdraw amount:");
        double withdrawAmount = sc.nextDouble();
        if(balance<withdrawAmount){
            System.out.println("The amount is greater than the balance");
            return 0;
        }
        else {
            balance -= withdrawAmount;
            return balance;
        }
    }
}
public class Bank_details_using_oops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BankAccount[] accounts = new BankAccount[3];
        accounts[0]=new SavingsAccount("Raj",10000);
        accounts[1] = new CurrentAccount("Ravi",20000);
        accounts[2] = new SavingsAccount("Ram",15000);
        System.out.println("Enter the number 1 for withdraw or 0 for the deposit");
        int type = sc.nextInt();
        if(type==1) {
            for (int i = 0; i < accounts.length; i++) {
                System.out.println("Account Holder =  " + accounts[i].accountHolder);
                System.out.println("Balance = " + accounts[i].balance);
                System.out.println("Withdraw = " + accounts[i].abstractWithdraw());
            }
        } else if (type==0) {
            for (int i = 0; i < accounts.length; i++) {
                System.out.println("Account Holder =  " + accounts[i].accountHolder);
                System.out.println("Balance = " + accounts[i].balance);
                System.out.println("Updated balance = " + accounts[i].deposit());
            }
        }
        else {
            System.out.println("Invalid choice");
        }
    }
}