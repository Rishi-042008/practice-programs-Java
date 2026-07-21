package com.company.getters_and_setters;

public class Employee_details_using_getter_setters {
    public static class employee{
        private int id;
        private String name;
        public String getName(){
            return name;
        }
        public void setName(String n){
            name=n;
        }
        public int getId(){
            return id;
        }
        public void setId(int a){id=a;
        }
    }
    public static void main(String[] args){
        employee ram = new employee();
        ram.setId(45);
        ram.setName("Raj");
        System.out.println(ram.getId());
        System.out.println(ram.getName());
        employee x=new employee();

    }
}