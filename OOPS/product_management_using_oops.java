package com.company.OOPS;
import java.util.Scanner;


interface discount{
    double applydiscount();
}

class productname implements discount{

    String productname;
    double price;
    double discountPercentage;
    productname(String productname,double price,double discountPercentage){
        this.discountPercentage=discountPercentage;
        this.productname=productname;
        this.price=price;
    }
    public double applydiscount(){
        return price-((discountPercentage*price)/100);
    }
}

public class product_management_using_oops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of products");
        productname [] product = new productname[sc.nextInt()];
        for(int i =0;i< product.length;i++){
            System.out.println("Enter the product name , price and the percentage of discount");
            product[i]= new productname(sc.next(),sc.nextDouble(),sc.nextDouble());
        }
        double totalamount=0;
        for (int i = 0; i<product.length;i++){
            System.out.println("Discounted amount for the "+product[i].productname+" = "+product[i].applydiscount());
            totalamount+=product[i].applydiscount();
        }
        System.out.println("Total amount = "+totalamount);
    }
}