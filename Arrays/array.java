package com.company.Arrays;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
      /*  int [] marks=new int[5];
        marks[0]=98;
        marks[1]=45;
        marks[2]=62;
        marks[3]=85;
        marks[4]=54;
        System.out.println(marks[2]);*/


        /*float [] marks= {100,98.5f,45.3f,69,87};
        String [] students= {"manav","danav","devta","rakshas"};
        System.out.println(marks[3]);
        System.out.println(students[2]);


        // to find the length of an array we use marks.length
        System.out.println(marks.length);
        System.out.println(students.length);*/


        //Displaying the array
        /*float [] marks= {100,98.5f,45.3f,69,87};
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }*/


        //quiz:Write a java program to print the elements of an array in reverse order
       /* float [] marks= {100,98.5f,45.3f,69,87};
        for(int i= marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }*/


        //for each loop
       /* float [] marks= {100,98.5f,45.3f,69,87};
    for (float element: marks){
        System.out.println(element);
    }*/
       /* String [] family = {"Raj", "Ratna", "Rishi","Chaya"};
        for (String element:family){
            System.out.println(element);
        }
        for (int i=0;i<=3;i++){
            System.out.println(family[i]);
        }*/


        //Multidimensional arrays
        /*int [][] flats=new int[2][3];
        Scanner sc=new Scanner(System.in);
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
            System.out.print(flats[i][j]);
            System.out.print(" ");
        }
            System.out.println();
    }*/
        /*String [][] family=new String[6][3];
        family[0][0]="Shivakumar :";
        family[0][1]="Pavana";
        family[0][2]="      ";
        family[1][0]="Ramesh :";
        family[1][1]="Deepu";
        family[1][2]="Shilpa";
        family[2][0]="Mangala :";
        family[2][1]="Sukhi";
        family[2][2]="     ";
        family[3][0]="Rajshekharaiah :";
        family[3][1]="Rishikesh";
        family[3][2]="Chayashree";
        family[4][0]="Padma :";
        family[4][1]="Kusuma";
        family[4][2]="Renukananda";
        family[5][0]="Suma :";
        family[5][1]="Madan";
        family[5][2]="    ";
        System.out.println("Parents name  : Childrens name");
        for(int i=0;i< family.length;i++) {
            for (int j = 0; j < family[i].length; j++) {
                System.out.print(family[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }*/

}}