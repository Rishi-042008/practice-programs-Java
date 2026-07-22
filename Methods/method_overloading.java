package com.company.Methods;
import java.util.Scanner;
public class method_overloading {

    static int add(int x,int y){
        int z=x+y;
        return z;
    }
    static int square(int x) {
        int s=(int) Math.pow(x,2);
        return s;
    }
    static void eor(int x){
        if(x%2==0){
            System.out.println("The given number is even");
        }
        else {
            System.out.println("The given number is odd");
        }
    }
    static void max(int x,int y){
        if(x>y){
            System.out.println("The max of two number is: "+x);
        }
        else {
            System.out.println("The max of two number is: "+y);
        }
    }
    static void N(int x){
        for(int i=1;i<=x;i++){
            System.out.print(i+ " ");
        }
    }
    static int fac(int x){
        int mul=1;
        for(int i=1;i<=x;i++){
            mul*=i;
        }
        return mul;
    }
    static int rev(int n){
        int reverse=0;
        while(n>0){
            int l=n%10;
            reverse=reverse*10+l;
            n=n/10;
        }
        return reverse;
    }
    static int count(int n){
      int temp=0;
      while(n>0){
        n=n/10;
        temp=temp+1;
        }
      return temp;
    }
    static int arr(int [] x){
        int sum=0;
        for( int i=0;i<x.length;i++){
            sum=sum+x[i];
        }
        return sum;
    }
    static int sum(int n){
        if(n==1)
            return 1;
        else
            return n+sum(n-1);
    }
    static int pow(int x,int y){
        if(y==0){
            return 1;
        }
        else if(y==1){
            return x;
        }else{
            return x*pow(x,y-1);
        }
    }
    static int num(int x){
        if(x!=0)
            return num(x-1);
        else
            return 1;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        /*System.out.println("Enter the two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The addition of two numbers is: "+add(a,b));*/

        /*System.out.println("Enter the number you want the square of: ");
        int a=sc.nextInt();
        System.out.println("The square of the number is: "+square(a));*/

        /*System.out.println("Enter the integer number: ");
        int a=sc.nextInt();
        eor(a);*/

       /* System.out.println("Enter the two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        max(a,b);*/

       /* System.out.println("Enter the Nth number: ");
        int a=sc.nextInt();
        N(a);*/

       /* System.out.println("Enter the number that you want the factorial of: ");
        int a=sc.nextInt();
        System.out.println("The factorial of the given number is: "+fac(a));*/

        /*System.out.println("Enter the number: ");
        int a= sc.nextInt();
        System.out.println(rev(a));*/

        /*System.out.println("Enter the number: ");
        int a=sc.nextInt();
        System.out.println(count(a));*/


       /* int [] a=new int[5];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("The array is: ");
        System.out.print("{");
        for(int i=0;i<5;i++) {
            if (i == 4) {
                System.out.print(a[i]);
            }else {
                System.out.print(a[i]+",");
            }
        }
        System.out.println("}");
        System.out.println("Sum of the array is: "+ arr(a));
*/
      /*  System.out.println("Enter the number: ");
        int a=sc.nextInt();
        System.out.println("The sum is: "+sum(a));*/
      /*  System.out.println("Enter the number you want the power of: ");
        int a=sc.nextInt();
        System.out.println("Enter the power of the number: ");
        int b= sc.nextInt();
        System.out.println("The solution is : "+pow(a,b));
*/
        int a=sc.nextInt();
        System.out.println(num(a));

    }
}