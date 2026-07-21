package com.company;

/*Order
        orderId
amount
OnlineOrder extends Order
        deliveryCharge
override:
finalAmount()

👉 amount + deliveryCharge

StoreOrder extends Order
        discount
override:
finalAmount()

👉 amount - discount*/

abstract class Order{
     double OrderId;
     double amount;

    Order(double OrderId,double amount){
        this.OrderId = OrderId;
        this.amount = amount >=0 ? amount:1;
    }

    abstract double finalAmount();
}

class OnlineOrder extends Order{
    double deliveryCharge;
    OnlineOrder(double OrderId, double amount , double deliveryCharge){
        super(OrderId, amount);
        this.deliveryCharge = deliveryCharge >=0 ? deliveryCharge:1;
    }
    double finalAmount(){
        return amount + deliveryCharge;
    }
}

class StoreOrder extends Order {
    double discount;

    StoreOrder(double OrderId, double amount, double discount) {
        super(OrderId, amount);
        this.discount = discount >=0 ? discount:1;
    }

    @Override
    double finalAmount() {
        return Math.max(0,amount - discount);
    }
}

public class xyz {
    public static void main(String[] args){
    OnlineOrder Dominos = new OnlineOrder(998467,899,100);
        System.out.println("The total amount for the Online order is :"+Dominos.finalAmount());
    StoreOrder Dominos1 = new StoreOrder(Dominos.OrderId,Dominos.amount,49);
        System.out.println("The total amount for the Store order is :"+Dominos1.finalAmount());
    }
}