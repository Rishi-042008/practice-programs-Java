package com.company.OOPS;
import java.util.Scanner;

abstract class Account{
    int AccountNumber;
    String UserName;
    double Balance ;
    static double Total_Vault_Reserve=0;
    static int ActiveAccount = 0;
    public Account(int AccountNumber,String UserName, double Balance){
        this.UserName = UserName;
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
        ActiveAccount++;
        Total_Vault_Reserve+=Balance;
    }
    public abstract void applyMonthlyInterest();
}
class SavingsAccount extends Account{
    double DepositAmount = 0;
    SavingsAccount(int AccountNumber,String UserName, double Balance,double DepositAmount){
        super(AccountNumber,UserName,Balance);
        this.DepositAmount +=DepositAmount;
    }

    public void applyMonthlyInterest(){
        Balance += (Balance+DepositAmount)*0.04;
        Total_Vault_Reserve+=Balance;
    }

}
class PremiumAccount extends Account{
    public PremiumAccount(int AccountNumber,String UserName, double Balance){
        super(AccountNumber, UserName, Balance);
    }

    @Override
    public void applyMonthlyInterest() {
        double amountfee = 100.0;
        if(UserName.startsWith("VIP_")){
            System.out.println("VIP status verified for "+this.UserName+".Maintenance fee waived!");
        }
        else{
            this.Balance-=amountfee;
            Total_Vault_Reserve-=amountfee;
        }
    }

}
public class OOPS_practicing {
    public static void main(String[] args){
        Account [] SBI ={
                new SavingsAccount(9945,"Raj",5000,0),
                new SavingsAccount(9946,"Rishi",10000,500),
                new SavingsAccount(9947,"Rahul",8000,1000),
                new PremiumAccount(9947, "VIP_Rahul", 25000),
                new PremiumAccount(9948, "Regular_Anjali", 15000)
        };
        for(Account Acc: SBI){
            Acc.applyMonthlyInterest();
            System.out.println("Balance after Interest = "+ Acc.Balance);
        }
        System.out.println("Total vault Reserve = "+SavingsAccount.Total_Vault_Reserve);
        System.out.println("Active Account = "+SavingsAccount.ActiveAccount);
    }
}
























