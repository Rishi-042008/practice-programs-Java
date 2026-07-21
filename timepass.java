package com.company;


/*
class Student{
    int rollNo ;
    String name;
    double [] marks = new double[3];
    double average;

    Student(int rollNo, String name,double [] marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks= marks;
    }


    void details(){
        System.out.println("Name = "+name);
        System.out.println("Roll number = "+ rollNo);
    }

    void CalculateAverage(){
        double sum=0;
        for(int i=0;i<marks.length;i++){
            sum+=marks[i];
        }
        average = sum/marks.length;
    }

    void Display(){
        for(int i=0;i<marks.length;i++){
            System.out.println("The marks of the subject "+(i+1) + " is "+marks[i]);
        }
        System.out.println("The Average marks of the student is: "+average);
    }
}
public class timepass {
    public static void main(String[] args){

    Student ram = new Student(49,"Ramcharan",new double[]{85,95,78,48});
    ram.details();
    ram.CalculateAverage();
    ram.Display();
    }
}*/
/*
class Book{
    String title;
    String  Author;
    Book [] book = new Book[3];
    String userTitle;
    boolean found=false;
    Scanner sc = new Scanner(System.in);
    void Kitab(){

        for (int i=0;i<book.length;i++){
            book[i]= new Book();
            System.out.println("Enter the book title :");
            book[i].title=sc.next();
            System.out.println("Enter the author of the book:");
            book[i].Author=sc.next();
        }
    }
    void Display(){
        for (int i=0;i<book.length;i++){
            System.out.println(" Title = "+book[i].title+", by "+book[i].Author);
        }
    }
    void Search(){
        System.out.println("Enter the book you need to find :");
        userTitle=sc.next();
        for (int i=0;i<book.length;i++){
            if(userTitle.equals(book[i].title)){
                found=true;
                System.out.println("The book is found");
                System.out.println(" Title = "+book[i].title+", by "+book[i].Author);
                break;
            }
        }
        if(found==false){
            System.out.println("The book is not found");
        }
    }
}
public class timepass {
    public static void main(String[] args){
        Book x = new Book();
        x.Kitab();
        x.Display();
        x.Search();
    }
}*/


/*
class Employee1{
    String EmployeeName;
    int EmployeeID;
    int salary;

    Employee1(String EmployeeName,int EmployeeID,int salary){
        this.EmployeeID=EmployeeID;
        this.EmployeeName=EmployeeName;
        this.salary=salary;
    }

    void displayEmployee(){
        System.out.println("Name = "+EmployeeName);
        System.out.println("ID = "+EmployeeID);
        System.out.println("Salary = "+salary);
    }

    double yearsalary(){
        return salary*12;
    }

    double bonus(){
        if(salary>=50000){
            return salary*0.1;
        }
        else {
            return salary*0.05;
        }
    }

}
public class timepass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    Employee1[] emp = new Employee1[3];

    boolean found = false;

    for(int i=0;i<emp.length;i++){
        System.out.println("Enter the name of the Employee:");
        String name = sc.next();
        System.out.println("Enter the ID of the employee");
        int ID = sc.nextInt();
        System.out.println("Enter the salary of the employee");
        int salary = sc.nextInt();
        emp[i] = new Employee1(name,ID,salary);
    }
        for(int i=0;i< emp.length;i++) {
            emp[i].displayEmployee();
        }
        System.out.println("Enter the ID of the Employee:");
        int ID = sc.nextInt();
        for(int i=0;i< emp.length;i++){
            if(ID==emp[i].EmployeeID){
                found=true;
                System.out.println("The Employee is found :");
                System.out.println("Name = "+emp[i].EmployeeName);
                System.out.println("Salary = "+emp[i].salary);
                System.out.println("Bonus = "+emp[i].bonus());
                break;
            }
        }
        if(found==false) {
            System.out.println("The Employee is not found");
        }

    }
}*/


/*
abstract class BankAccount{
    public String accountHolder;
    public double balance;


    public double deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount that you are going to deposit");
        double amount=sc.nextDouble();
        return balance=amount+balance;
    }

    abstract double abstractWithdraw();
}

class SavingsAccount extends BankAccount{
    Scanner sc = new Scanner(System.in);

    SavingsAccount(String accountHolder, double balance){
        super();
        this.accountHolder=accountHolder;
        this.balance= balance;
    }

    @Override
    double abstractWithdraw() {
        System.out.println("Enter the withdraw amount:");
        double withdrawAmount = sc.nextDouble();
        if(balance*0.9<withdrawAmount){
            System.out.println("Withdraw less than 90% money ");
            return 0;
        }
        else {
            System.out.println("You withdraw "+(balance-withdrawAmount)+"form the account");
            return balance-withdrawAmount;
        }
    }

}

class CurrentAccount extends BankAccount{
    Scanner sc = new Scanner(System.in);
    CurrentAccount(String accountHolder,double balance){
        super();
        this.accountHolder =accountHolder;
        this.balance = balance;
    }
    double abstractWithdraw(){
        System.out.println("Enter the withdraw amount:");
        double withdrawAmount = sc.nextDouble();
        if(balance<withdrawAmount){
            System.out.println("The amount is greater than the balance");
            return 0;
        }
        else {
            balance -= withdrawAmount;
            return balance;
        }
    }
}
public class timepass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BankAccount[] accounts = new BankAccount[3];
        accounts[0]=new SavingsAccount("Raj",10000);
        accounts[1] = new CurrentAccount("Ravi",20000);
        accounts[2] = new SavingsAccount("Ram",15000);
        System.out.println("Enter the number 1 for withdraw or 0 for the deposit");
        int type = sc.nextInt();
        if(type==1) {
            for (int i = 0; i < accounts.length; i++) {
                System.out.println("Account Holder =  " + accounts[i].accountHolder);
                System.out.println("Balance = " + accounts[i].balance);
                System.out.println("Withdraw = " + accounts[i].abstractWithdraw());
            }
        } else if (type==0) {
            for (int i = 0; i < accounts.length; i++) {
                System.out.println("Account Holder =  " + accounts[i].accountHolder);
                System.out.println("Balance = " + accounts[i].balance);
                System.out.println("Updated balance = " + accounts[i].deposit());
            }
        }
        else {
            System.out.println("Invalid choice");
        }
    }
}
*/
/*
interface discount{
    double applydiscount();
}

class productname implements discount{

    String productname;
    double price;
    double discountPercentage;
    productname(String productname,double price,double discountPercentage){
        this.discountPercentage=discountPercentage;
        this.productname=productname;
        this.price=price;
    }
    public double applydiscount(){
        return price-((discountPercentage*price)/100);
    }
}

public class timepass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of products");
        productname [] product = new productname[sc.nextInt()];
        for(int i =0;i< product.length;i++){
            System.out.println("Enter the product name , price and the percentage of discount");
            product[i]= new productname(sc.next(),sc.nextDouble(),sc.nextDouble());
        }
        double totalamount=0;
        for (int i = 0; i<product.length;i++){
            System.out.println("Discounted amount for the "+product[i].productname+" = "+product[i].applydiscount());
            totalamount+=product[i].applydiscount();
        }
        System.out.println("Total amount = "+totalamount);
    }
}*/
/*

abstract class Vehicle1{
    String vehicleNumber;
    double baseRate;
    Vehicle1(String vehicleNumber,double baseRate){
        if(baseRate>=0){
            this.baseRate=baseRate;
        }
        this.vehicleNumber=vehicleNumber;
    }
    abstract double CalculateRent(int days);
}

class Car extends Vehicle1{
    String CarType;
    Car(String vehicleNumber,double baseRate,String CarType){
        super(vehicleNumber,baseRate);
        this.CarType=CarType;
    }
    @Override
    double CalculateRent(int days) {
        if(CarType.equals("SUV")){
            return (baseRate * days) + 500;
        }
        else {
            return baseRate * days;
        }
    }
}
class Bike extends Vehicle1{
    boolean includesHelmet;
    Bike(String vehicleNumber,double baseRate,boolean includesHelmet){
        super(vehicleNumber,baseRate);
        this.includesHelmet=includesHelmet;
    }

    @Override
    double CalculateRent(int days) {
        if(includesHelmet==true){
            return ((baseRate*days)+100);
        }
        else {
            return (baseRate*days);
        }
    }
}
public class timepass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Vehicle1 v1 = new Car("KA01-1234", 1000, "SUV");
        System.out.println("Enter the number of Rent days:");
        System.out.println("Total amount = "+v1.CalculateRent(sc.nextInt()));
        Vehicle1 v2 = new Bike("KA05-5678", 400, true);
        System.out.println("Enter the number of Rent days:");
        System.out.println("Total amount = "+v2.CalculateRent(sc.nextInt()));
    }
}*//*
interface WifiConnectable{
    void connectToInternet();
}
interface BrightnessLevel{
    void adjustBrightness(int level);
}


public class timepass {
    public static void main(String[] args){

    }
}*/
/*
public class timepass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 0;
        while (count<n){
            System.out.print(a+" ");
            int c = a+b;
            a=b;
            b=c;
            count++;
        }
    }
}*/
/*
abstract class Shipment{
    String trackingID;
    double weight;
    Shipment(String trackingID,double weight){
        this.trackingID = trackingID;
        this.weight = weight;
    }
    abstract double calculateShippingCost();
}
class FragileShipment extends Shipment{
    boolean extraPadding;
    FragileShipment(String trackingID,double weight,boolean extraPadding){
        super(trackingID,weight);
        this.extraPadding = extraPadding;
    }
    double calculateShippingCost(){
        if(extraPadding==true){
            return (weight*20)+150;
        }
        else {
            return weight*20;
        }
    }
}
class ExpressShippment extends Shipment{
    int deliveryDays;
    ExpressShippment(String trackingID,double weight,int deliveryDays){
        super(trackingID,weight);
        this.deliveryDays=deliveryDays;
    }
    double calculateShippingCost(){
        if(deliveryDays==1){
            return (weight * 50)+300;
        }
        else {
            return weight*50;
        }
    }
}

public class timepass {
    public static void main(String[] args){
        Shipment[] dock={
                new FragileShipment("FRG-902", 4.5, true),
                new ExpressShippment("EXP-114", 2.0, 1),
                new ExpressShippment("EXP-550", 10.0, 3)
        };
        for (Shipment s : dock) {
            System.out.println("Shipment ID: " + s.trackingID + " | Cost: " + s.calculateShippingCost());
        }
    }
}*/
/*
class Book{
    String title;
    int pages;
    Book(String title,int pages){
        this.title=title;
        this.pages=pages;
    }
    void printDetails(){
        System.out.println("Title of the book = "+title);
        System.out.println("Number of pages = "+pages);
    }
}
public class timepass {
    public static void main(String[] args){
        Book [] mahabharata ={
                new Book("MAHABHARATHA",1000000000),
                new Book("RAMAYANA",100000000),
                new Book("BHAGAVADHGEETHA",1000000)
        };
        for (Book i:mahabharata){
            i.printDetails();
        }

    }
}*/
/*
class XYZ{
    static int count = 0;
    int a;
    int b;
    XYZ(int a , int b){
        this.a=a;
        this.b=b;
    }
    static int mul(int a,int b){
        count++;
        return a*b;
    }
    static float div(int a, int b){
        count++;
        return a/b;
    }
}
public class timepass {
    public static void main(String[] args){
        System.out.println("Multiplication = "+XYZ.mul(4,5));
        System.out.println("Division = "+XYZ.div(8,4));
        System.out.println("count = "+XYZ.count);
    }
}
*/
abstract class Account{
    int AccountNumber;
    String UserName;
    double Balance ;
    static double Total_Vault_Reserve=0;
    static int ActiveAccount = 0;
    public Account(int AccountNumber,String UserName, double Balance){
        this.UserName = UserName;
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
        ActiveAccount++;
        Total_Vault_Reserve+=Balance;
    }
    public abstract void applyMonthlyInterest();
}
class SavingsAccount extends Account{
    double DepositAmount = 0;
    SavingsAccount(int AccountNumber,String UserName, double Balance,double DepositAmount){
        super(AccountNumber,UserName,Balance);
        this.DepositAmount +=DepositAmount;
    }

    public void applyMonthlyInterest(){
        Balance += (Balance+DepositAmount)*0.04;
        Total_Vault_Reserve+=Balance;
    }

}
class PremiumAccount extends Account{
    public PremiumAccount(int AccountNumber,String UserName, double Balance){
        super(AccountNumber, UserName, Balance);
    }

    @Override
    public void applyMonthlyInterest() {
        double amountfee = 100.0;
        if(UserName.startsWith("VIP_")){
            System.out.println("VIP status verified for "+this.UserName+".Maintenance fee waived!");
        }
        else{
            this.Balance-=amountfee;
            Total_Vault_Reserve-=amountfee;
        }
    }

}
public class timepass {
    public static void main(String[] args){
        Account [] SBI ={
                new SavingsAccount(9945,"Raj",5000,0),
                new SavingsAccount(9946,"Rishi",10000,500),
                new SavingsAccount(9947,"Rahul",8000,1000),
                new PremiumAccount(9947, "VIP_Rahul", 25000),
                new PremiumAccount(9948, "Regular_Anjali", 15000)
        };
        for(Account Acc: SBI){
            Acc.applyMonthlyInterest();
            System.out.println("Balance after Interest = "+ Acc.Balance);
        }
        System.out.println("Total vault Reserve = "+SavingsAccount.Total_Vault_Reserve);
        System.out.println("Active Account = "+SavingsAccount.ActiveAccount);
    }
}
























