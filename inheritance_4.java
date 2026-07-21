package com.company;

abstract class Vehicle{
    String brand;
    double basePrice;

    Vehicle(String brand,double basePrice) {
        this.brand = brand;
        this.basePrice = basePrice >0 ? basePrice:1;
    }
    double roadtax(){
        return (basePrice*0.08);
    }
    abstract double finalPrice();

}
class car extends Vehicle{
    String fuelType ;
    int milage;
    car(String fuelType,int milage,String brand , double basePrice) {
        super(brand, basePrice);
        if (fuelType.equals("petrol") || fuelType.equals("diesel"))
        {
        this.fuelType=fuelType;
        }
        else {
            System.out.println("Enter the correct fuel type");
        }
        this.milage = milage;
    }
    double insurance(){
        if("petrol".equals(fuelType)){
            return 5000;
        }
        else {
            return 7000;
        }
    }
    @Override
    double finalPrice(){
        return basePrice + roadtax() + insurance();
    }
}
class ElectricCar extends Vehicle{
    int batteryCapacity;
    boolean fastCharging;
    int range;
    ElectricCar(int batteryCapacity,boolean fastCharging,int range,String brand , double basePrice){
        super(brand,basePrice);
        this.batteryCapacity=batteryCapacity;
        this.fastCharging=fastCharging;
        this.range=range;
    }
    double subsidy(){
        if(batteryCapacity>50){
            return 100000;
        }
        else
            return 50000;
    }
    double finalPrice(){
        return basePrice  + roadtax() -subsidy();
    }
}

public class inheritance_4 {
    public static void main(String[] args){
        car car1 = new car("petrol",25,"TATA",500000);
        System.out.println("Total price = "+car1.finalPrice());

        ElectricCar car2 = new ElectricCar(45,true,1000,"OLA",400000);
        System.out.println("Total price = "+car2.finalPrice());
    }
}