package com.company.Abstract.Abstract_Beginner_problems;

class StreamingPlatform{
    void PlayContent(){
        System.out.println("playing the normal content");
    }
}
class Netflix extends StreamingPlatform{

    void PlayContent(){
        System.out.println("Playing netflix premium content");
    }
}
public class Streming_platform_using_abstract {
    public static void main(String[] args){
        Netflix MoneyHesit=new Netflix();
        MoneyHesit.PlayContent();
    }
}