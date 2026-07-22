package packages.Employee_packages;

import packages.Employee_packages.Department;
import packages.Employee_packages.Employee;
public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Rishi",115,50000);
        Employee e2 = new Employee("Rahul", 117,45000);
        Employee e3 = new Employee("Pavan",100,51000);

        Department D1 = new Department("IT",2);
        Department D2 = new Department("HR",3);

        D1.addEmployee(e1);
        D1.addEmployee(e2);
        D2.addEmployee(e3);

        D1.displayEmployees();
        D2.displayEmployees();
    }
}
