package com.company.Constructors;

public class Car_using_constructors {
    static class car{
        private String brand;
        private int speed;
        public car(String company,int carspeed){
            brand=company;
            if(carspeed<0){
                System.out.println("Error");
            }
            else
                speed=carspeed;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setSpeed(int speed) {
           if(speed>=0)
               this.speed = speed;
           else
               System.out.println("Error");
        }

        public int getSpeed() {
            return speed;
        }

        public String getBrand() {
            return brand;
        }
    }
    public static void main(String[] args){
        car tata= new car("Curvv",250);
        System.out.println("Speed of the car is = "+tata.getSpeed());
        System.out.println("car name = "+tata.getBrand());
    }
}