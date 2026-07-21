package com.company.Constructors;

 class myemployee {
        int id;
        String name;
        int salary;
        public myemployee(){
            name="raj";
            id=65;
        }
        public myemployee(String myname){
         name=myname;
     }
       public myemployee(String myname,int myid){
           name=myname;
           id=myid;
       }
       public myemployee(String myname,int myid,int mysalary){
            name=myname;
            id=myid;
           salary=mysalary;
       }
        public String getName(){
            return name;
        }
        public int getId(){
            return id;
        }
        public void setName(String a){
            this.name=a;
        }
        public void setId(int x){
            this.id=x;
        }
        public void setSalary(int a){
            salary=a;
        }
        public int getsalary(){
            return salary;
        }

    public static void main(String[] args){
        myemployee raj=new myemployee("Raj",95,10000);
        System.out.println(raj.getName());
        System.out.println(raj.getId());
        System.out.println(raj.getsalary());
    }
}