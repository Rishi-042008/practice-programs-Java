package com.company.Interfaces;

interface camera{
    void takephoto();
}

interface MusicPlayer{
    void playMusic();
}

class SmartPhone implements camera,MusicPlayer{
    public void takephoto(){
        System.out.println("Click the photo");
    }
    public void playMusic(){
        System.out.println("Play the music");
    }
}
public class Phone_using_interfaces {
    public static void main(String[] args){
        SmartPhone samsung = new SmartPhone();
        samsung.playMusic();
        samsung.takephoto();
    }
}