class Employee {
    private String name;
    private double salary;

    void setName(String name){
        this.name =name;
    }

    String getName(){
        return name;
    }

    void setSalary(double salary){
        if(salary>=0){
            this.salary=salary;
        }
        else {
            System.out.print("Invalid Salary");
        }
    }

    double getSalary(){
        return salary;
    }
}

public class MainEmployee{
    public static void main (String[] args){

        //Employee 1
        Employee employee1 = new Employee();
        employee1.setName("Kasun");
        employee1.setSalary(85000);

        System.out.println("Employee 1");
        System.out.println("Name: " + employee1.getName());
        System.out.println("Salary: " + employee1.getSalary());

        System.out.println();

        //Employee 2
        Employee employee2 = new Employee();
        employee2.setName("Nimal");
        employee2.setSalary(-5000);

        System.out.println("Employee 2");
        System.out.println("Name: " + employee2.getName());
        System.out.println("Salary " + employee2.getSalary());
    }
}
