package com.company.Constructors;

public class Book_using_constructors {
    static class book{
        private String title;
        private int finalprice;
        private int price;
        public book(String name,int disamount,int amount){
            title=name;
            finalprice=disamount;
            price=amount;
        }
        public void setTitle(String name){
            this.title=name;
        }
        public void sePrice(int amount) {
            this.price = amount;
        }
        public int getPrice() {
            return price;
        }
        public String getTitle() {
            return title;
        }

        public void setDisprice(int disprice) {
            this.finalprice = disprice;
        }

        public int getDisprice() {
            return finalprice;
        }

        public double applydiscount(){
            return ((price-finalprice)/(double)price)*100;
        }

    }
    public static void main(String[] args){
        book buildyourself=new book("Don't talk build",400,500);
        System.out.println("The book is:"+buildyourself.getTitle());
        System.out.println("The total amount is : "+buildyourself.getPrice());
        System.out.println("The percentage of discount is :"+buildyourself.applydiscount()+"%");
        System.out.println("The amount after discount is :"+buildyourself.getDisprice());
    }
}