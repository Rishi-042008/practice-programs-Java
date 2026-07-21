package com.company;

class employee{
    String name;
    double salary;
    employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
}
class developer extends employee{
    double bonus ;
    developer(String name,double salary, double bonus){
        super(name,salary);
        this.bonus = bonus;
        this.bonus = bonus < 0 ? 0 : bonus;
    }
    double totalSalary(){
        return bonus + salary;
    }
    boolean isHighEarner() {
        return totalSalary() > 100000;
    }
}
class Manager extends developer{
    Manager(String name , double salary , double bonus){
        super(name,salary,bonus);
    }

    @Override
    double totalSalary() {
        return super.totalSalary();
    }
}

public class inheritance_3 {
    public static void main(String[] args){
    developer Rahul = new developer("Rahul M",400000,0);
        System.out.println("The total salary of the developer is "+ Rahul.totalSalary());
        if(Rahul.isHighEarner()){
            System.out.println("This developer is High earner");
            }
    Manager Sir = new Manager("Rana dagubatti",100000,50000);
        System.out.println("The total salary of the manager is "+ Sir.totalSalary());
    }
}