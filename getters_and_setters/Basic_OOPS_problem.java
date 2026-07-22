package com.company.getters_and_setters;

public class Basic_OOPS_problem {
    class  raj {
        int id;
        String name;
    }
    class employee{
        int id;
        String name;
        float salary;
    }
    public void main(String[] args){
     raj rishi=new raj();
     rishi.id=115;
     rishi.name="Rishikesh";
        System.out.println(rishi.id);
        System.out.println(rishi.name);
     employee ram = new employee();
     ram.id=113;
     ram.name="Ramchandra";
     ram.salary=54988.36f;
        System.out.println(ram.id);
        System.out.println(ram.salary);
        System.out.println(ram.name);
    }
}