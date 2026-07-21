package com.company.getters_and_setters;

    public class Bank_management_using_getters_setters {
        static class bankaccount{
           private String accountholder;
           private double balance;
           public bankaccount(String name,double reamin){
               accountholder=name;
               balance=reamin;
           }
           public void setBalance(double a){
               balance=a;
           }

            public double getBalance() {
                return balance;
            }

            public void setAccountholder(String name) {
                this.accountholder = name;
            }

            public String getAccountholder() {
                return accountholder;
            }
        }

        public static void main(String[] args){
            bankaccount ram=new bankaccount("Ram",45000);
            System.out.println(ram.getBalance());
            System.out.println(ram.getAccountholder());
        }
}