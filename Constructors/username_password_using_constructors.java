package com.company.Constructors;

public class username_password_using_constructors {
    static class user{
        private String username;
        public String password;
        public user(String name,String PIN){
            username=name;
            if(PIN.length()<=6)
                System.out.println("!!!Error!!!");
            else
                password=PIN;
        }

        public void setPassword(String pin) {
           if(pin.length()>=6)
               this.password = pin;
           else
               System.out.println("!!!Error!!!");
        }

        public void setUsername(String name) {
            this.username = name;
        }

        public String getPassword() {
            return password;
        }

        public String getUsername() {
            return username;
        }
    }
    public static void main(String[] args){
        user ram=new user("Rameshwar","Ram1234");
        System.out.println("Name="+ram.getUsername());
        System.out.println("password = "+ram.getPassword());

    }
}