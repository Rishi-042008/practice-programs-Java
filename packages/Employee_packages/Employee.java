package packages.Employee_packages;  

public class Employee{
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void display(){
        System.out.println("Name : "+name);
        System.out.println("ID = "+id);
        System.out.println("Salary : "+salary);
    }
    
}