package packages.Employee_packages;  // Instead of company.department
public class Department {
    String depname;
    Employee [] employee;
    int count;

    public Department(String depname, int count) {
        this.depname = depname;
        this.employee = new Employee[count];
        this.count = 0;
    }
    public void addEmployee(Employee e){
        if (count < employee.length){
            employee[count]=e;
            count++;
        }
        else{
            System.out.println("Department is full ");
        }
    }
    public void displayEmployees(){
        System.out.println("Department name = "+depname);
        for (int i = 0; i < count; i++) {
            employee [i].display();
        }
    }
    
}
