package com.company.Constructors;

public class Employee_details2_using_constructors {
    static class employee{
        private String name;
        private int pastsalary;
        private int presentsalary;

        public employee(String emp_name,int emp_pastsalary,int emp_presentsalary ){
            name=emp_name;
            presentsalary=emp_presentsalary;
            pastsalary=emp_pastsalary;
        }

        public void setName(String n) {
            this.name = n;
        }

        public void setPastsalary(int s) {
           if(s>0)
               this.pastsalary = s;
           else
               System.out.println("Invalid value");
        }

        public String getName() {
            return name;
        }

        public int getPastsalary() {
            return pastsalary;
        }

        public void setPresentsalary(int p) {
            this.presentsalary = p;
        }

        public int getPresentsalary() {
            return presentsalary;
        }

        public void increaseSalary(){
            double percent=((presentsalary-pastsalary)/(double)pastsalary)*100;
            System.out.println("The percent of increase in salary ="+percent+"%");
        }
    }
    public static void main(String[] args){
        employee rahul=new employee("Rahul M",50000,55000);
        System.out.println("The name of the employee is "+rahul.getName());
        System.out.println("The salary credit to the employee is "+rahul.getPresentsalary());
        rahul.increaseSalary();
    }
}