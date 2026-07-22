package com.company.OOPS;
import java.util.Scanner;

abstract class Shipment{
    String trackingID;
    double weight;
    Shipment(String trackingID,double weight){
        this.trackingID = trackingID;
        this.weight = weight;
    }
    abstract double calculateShippingCost();
}
class FragileShipment extends Shipment{
    boolean extraPadding;
    FragileShipment(String trackingID,double weight,boolean extraPadding){
        super(trackingID,weight);
        this.extraPadding = extraPadding;
    }
    double calculateShippingCost(){
        if(extraPadding==true){
            return (weight*20)+150;
        }
        else {
            return weight*20;
        }
    }
}
class ExpressShippment extends Shipment{
    int deliveryDays;
    ExpressShippment(String trackingID,double weight,int deliveryDays){
        super(trackingID,weight);
        this.deliveryDays=deliveryDays;
    }
    double calculateShippingCost(){
        if(deliveryDays==1){
            return (weight * 50)+300;
        }
        else {
            return weight*50;
        }
    }
}

public class Shipment_using_oops {
    public static void main(String[] args){
        Shipment[] dock={
                new FragileShipment("FRG-902", 4.5, true),
                new ExpressShippment("EXP-114", 2.0, 1),
                new ExpressShippment("EXP-550", 10.0, 3)
        };
        for (Shipment s : dock) {
            System.out.println("Shipment ID: " + s.trackingID + " | Cost: " + s.calculateShippingCost());
        }
    }
}