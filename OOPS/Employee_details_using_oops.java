package com.company.OOPS;
import java.util.Scanner;

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
public class Employee_details_using_oops {
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
}