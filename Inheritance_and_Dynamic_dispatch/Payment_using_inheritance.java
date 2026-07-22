package com.company.Inheritance_and_Dynamic_dispatch;

 class Payment{
    double amount;
    Payment(double amount){
        this.amount = amount >0 ? amount:0;
    }
     double ProcessPayment(){
         return amount;
     }
}

class CardPayment extends Payment{
    String CardType;
    CardPayment(String cardType,double amount){
        super(amount);
        if(cardType.equals("Credit") || cardType.equals("Debit")){
            this.CardType=cardType;
        }
        else {
            this.CardType = "Invalid";
        }
    }
    @Override
    double ProcessPayment(){
        if("Credit".equals(CardType)){
            //2 percent charge as you said
            return amount+amount*0.02;
        }
        else {
            // no charge for debit as you said
            return amount;
        }
    }
}
class UPIPayment extends Payment{
    int UPI_id;
    UPIPayment(int UPI_id,double amount){
        super(amount);
        if(UPI_id==8724){
            this.UPI_id=UPI_id;
        }
        else {
            System.out.println("Invalid UPI id , so it is shown as null");
            this.UPI_id = 0;
        }
    }
    double ProcessPayment() {
        return super.ProcessPayment();
    }
}
public class Payment_using_inheritance {
    public static void main(String[] args){
        CardPayment card = new CardPayment("Credit",8000);
        System.out.println(card.ProcessPayment());
        UPIPayment upi = new UPIPayment(8724,5444);
        System.out.println(upi.ProcessPayment());
    }
}