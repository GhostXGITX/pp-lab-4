import employees.*;
public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        
        employees[0] = new Manager("John Doe", 50000,0);
        employees[1] = new Worker("Jane Smith", 60000,"Junior Developer");
        employees[2] = new Employee("Alice Johnson", 55000);
        employees[3] = new Employee("Bob Brown", 52000);
        employees[4] = new Worker("Emma Wilson", 58000,"Team Leader");

       
        System.out.println("Dane dla pracownika o indeksie 3:");
        System.out.println(employees[3]);

        
        employees[3].setSalary(55000);

        
        System.out.println("\nDane dla wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
