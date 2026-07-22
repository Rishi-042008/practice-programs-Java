package com.company.OOPS;
import java.util.Scanner;

abstract class Vehicle1{
    String vehicleNumber;
    double baseRate;
    Vehicle1(String vehicleNumber,double baseRate){
        if(baseRate>=0){
            this.baseRate=baseRate;
        }
        this.vehicleNumber=vehicleNumber;
    }
    abstract double CalculateRent(int days);
}

class Car extends Vehicle1{
    String CarType;
    Car(String vehicleNumber,double baseRate,String CarType){
        super(vehicleNumber,baseRate);
        this.CarType=CarType;
    }
    @Override
    double CalculateRent(int days) {
        if(CarType.equals("SUV")){
            return (baseRate * days) + 500;
        }
        else {
            return baseRate * days;
        }
    }
}
class Bike extends Vehicle1{
    boolean includesHelmet;
    Bike(String vehicleNumber,double baseRate,boolean includesHelmet){
        super(vehicleNumber,baseRate);
        this.includesHelmet=includesHelmet;
    }

    @Override
    double CalculateRent(int days) {
        if(includesHelmet==true){
            return ((baseRate*days)+100);
        }
        else {
            return (baseRate*days);
        }
    }
}
public class Vehicle_using_oops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Vehicle1 v1 = new Car("KA01-1234", 1000, "SUV");
        System.out.println("Enter the number of Rent days:");
        System.out.println("Total amount = "+v1.CalculateRent(sc.nextInt()));
        Vehicle1 v2 = new Bike("KA05-5678", 400, true);
        System.out.println("Enter the number of Rent days:");
        System.out.println("Total amount = "+v2.CalculateRent(sc.nextInt()));
    }
}