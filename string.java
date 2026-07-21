package com.company;


import java.sql.SQLOutput;

public class string{
public static void main(String[]args) {
    String a = "Rishi";
    System.out.println(a.length());
    System.out.println(a.toLowerCase());
    System.out.println(a.toUpperCase());
    System.out.println(a.replace('i','a'));
    System.out.println(a.replace("ishi","am"));
    String b="      nellamma      ";
    System.out.println(b);
    System.out.println(b.trim());
    System.out.println(a.substring(3));
    System.out.println(a.substring(1,4));
    System.out.println(a.startsWith("Ri"));
    System.out.println(a.endsWith("hi"));
    System.out.println(a.charAt(3));
    System.out.println(a.indexOf('s'));
    System.out.println(a.indexOf('i',3));
    System.out.println(b.lastIndexOf('l'));
    System.out.println(b.lastIndexOf('m',13));





}}