package com.company.Abstract.Abstract_Beginner_problems;

abstract class FoodDelivery{
    public String customer;
    public String restaurantName;
    public int deliveryTime;
    public FoodDelivery(String restaurantName,int deliveryTime,String customer){
        this.deliveryTime=deliveryTime;
        this.restaurantName=restaurantName;
        this.customer=customer;
    }
    public void displayInfo(){
        System.out.println("Customer "+customer+" need food from "+restaurantName+" at "+deliveryTime+"mins");
    }
    abstract public void deliverFood();
}

class swiggy extends FoodDelivery{

    public swiggy(String restaurantName, int deliveryTime, String customer) {
        super(restaurantName, deliveryTime, customer);
    }
    public void deliverFood(){
        System.out.println("Swiggy delivered the food in 15 mins, and we gave 10% offer for you order");
    }
}
class zomato extends FoodDelivery{

    public zomato(String restaurantName, int deliveryTime, String customer) {
        super(restaurantName, deliveryTime, customer);
    }

    public void deliverFood(){
        System.out.println("Zomato delivered the food in 10 mins, and we gave gift voucher of 100rs for you order");
    }
}
public class Food_Delhivery_using_abstract {
    public static void main(String[] args){
        swiggy Chapati = new swiggy("Dwarka Hotel",15,"Rishikesh");
        Chapati.displayInfo();
        Chapati.deliverFood();

        zomato Rice = new zomato("Ravi darshan",10,"Rajshekar");
        Rice.displayInfo();
        Rice.deliverFood();
    }
}