package com.company.Methods;
import java.util.Scanner;
import java.util.Random;

public class Rock_paper_scissor_using_methods {
    static class Number_GAME{
        private int user_num;
        private int comp_num;
        private int guesses=7;
        public Number_GAME(int comp){
                comp_num=comp;
        }
        public void takeUserInput(int user){
            if(user>0 && user<=100)
                user_num=user;
            else if(user>100){
                System.out.println("Enter number is larger than the bound number, so default 100 is taken");
                user_num=100;
            }
            else {
                System.out.println("Invalid number,so default 1 is assigned");
                user_num = 1;
            }
        }

        public void setUser_num(int user_num) {
            if(user_num>0)
                this.user_num = user_num;

            else
                System.out.println("Invalid number,so default 1 is assigned ");
        }

        public void setComp_num(int comp_num) {
            this.comp_num = comp_num;
        }

        public int getComp_num() {
            return comp_num;
        }

        public int getUser_num() {
            return user_num;
        }

        public void setGuesses(int guesses) {
            this.guesses = guesses;
        }

        public int getGuesses() {
            return guesses;
        }

        public void isCorrectnumber(){
            boolean isHigher = user_num > comp_num;
            int diff = Math.abs(user_num - comp_num);
            if( diff<=5 && diff>0)
                System.out.println("VERY CLOSE!");
            else if( diff<=15 && diff>5)
                System.out.println("CLOSE!!");
            else if(diff !=0)
                System.out.println("FAR AWAY ");


            if(user_num==comp_num)
                System.out.println("🏆🏆!!! YOU WIN !!!🏆🏆");
            else if(isHigher)
                System.out.println("GO LESSER");
            else
                System.out.println("GO GREATER");


        }
public void noOfGuesses(){
    guesses--;
}
    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Random r=new Random();
    Number_GAME play = new Number_GAME(r.nextInt(1,101));
    System.out.println("ENTER THE NUMBER IN THE RANGE OF 1-100");
    while (true){
        play.takeUserInput(sc.nextInt());
        play.isCorrectnumber();
        play.noOfGuesses();
        System.out.println("REMAINING CHANCES : "+play.getGuesses());
        if(play.getUser_num()== play.getComp_num())
            break;
        if (play.getGuesses()==0) {
            System.out.println("SORRY YOU ARE OUT OF CHANCES");
            break;
        }
    }
}
}