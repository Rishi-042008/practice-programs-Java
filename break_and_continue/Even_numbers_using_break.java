package com.company.break_and_continue;

public class Even_numbers_using_break {
    public static void main(String[] args){

        for(int i=0;i<50;i++){

            if(i%2!=0){
                continue;
        }
            System.out.println(i);
        }
    }
}