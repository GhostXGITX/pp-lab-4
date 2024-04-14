import employees.*;
public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7];

        
        employees[0] = new Manager("John Doe", 50000,0);
        employees[1] = new Worker("Jane Smith", 60000,"Junior Developer");
        employees[2] = new Employee("Alice Johnson", 55000);
        employees[3] = new Employee("Bob Brown", 52000);
        employees[4] = new Worker("Emma Wilson", 58000,"Team Leader");
        employees[5] = new Manager("Michael Scott", 80000, 0);
        employees[6] = new Worker("Jim Halpert", 65000,"Senior Developer");
        
        for (Employee employee : employees) {
            double currentSalary = employee.getSalary();
            employee.setSalary(currentSalary + 500);
        }

        int nonManagerEmployeesCount = 0;
        for(Employee employee : employees) {
            if(!(employee instanceof Manager)) {
                nonManagerEmployeesCount++;
            }
        }

        for(Employee employee : employees) {
            if(employee instanceof Manager) {
                ((Manager) employee).setNumberOfSubordinates(5);
                employee.setSalary(7500);
            }
        }
        
        if (employees[0] instanceof Manager) {
            ((Manager) employees[0]).setNumberOfSubordinates(nonManagerEmployeesCount);
        }

        

        System.out.println("Dane dla pracownika o indeksie 3:");
        System.out.println(employees[3]);

        
        employees[3].setSalary(55000);

        
        System.out.println("\nDane dla wszystkich pracowników:");

        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}
