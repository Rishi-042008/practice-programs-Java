package com.company.Inheritance_and_Dynamic_dispatch;

class Product{
 double price_range ;
 Product(double price_range){
     this.price_range = price_range < 0 ? 0 : price_range;
 }
}
class Electronic extends Product{
    String company;
    Electronic(double price,String company){
        super(price);
        this.company = company;
    }
}
class Laptop extends Electronic{
    String RAM;
    int amount;
    String intel_Generation;
    boolean isGraphics_card = true;
    Laptop (double price,String company,String RAM,String intel_Generation,boolean graphics_card) {
        super(price, company);
        this.isGraphics_card = graphics_card;
        this.intel_Generation = intel_Generation;
        this.RAM = RAM;
    }
    double specifications() {
        if (RAM.equals("8GB") && intel_Generation.equals("i5") && isGraphics_card == false && price_range == 55000 && company.equals("HP")) {
            return amount = 50000;
        } else if (RAM.equals("8GB") && intel_Generation.equals("i7") && isGraphics_card == false && price_range == 70000 && company.equals("HP")) {
            return amount = 60000;
        } else if (RAM.equals("16GB") && intel_Generation.equals("i7") && isGraphics_card && price_range == 80000 && company.equals("HP")) {
            return amount = 70000;
        } else if (RAM.equals("16GB") && intel_Generation.equals("i7") && isGraphics_card && price_range == 95000 && company.equals("HP")) {
            return amount = 85000;
        } else if (RAM.equals("16GB") && intel_Generation.equals("Mac9") && isGraphics_card && price_range == 150000 && company.equals("MacBook")) {
            return amount = 135000;
        } else {
            System.out.println("There is no laptop");
            return 0;
        }
    }
     double finalprice() {
         return amount+amount*0.1;
         }
         boolean ispremium(){
        if(amount>100000)
            return true;
        else
            return false;
         }
     }

public class Laptop_guide_using_inheritance {
    public static void main(String[] args){
    Laptop hp = new Laptop(70000,"HP","8GB","i7",false);
    hp.specifications();
        System.out.println("Total price with tax = "+hp.finalprice());
        if(hp.ispremium()){
            System.out.println("Premium🏆🏆🏆🏆");
        }
    }
}