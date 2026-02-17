package app;

import model.Developer;
import model.Employee;
import model.Intern;
import model.Manager;

public class PayrollApplication {
    public static void main(String[] args) {
        Employee manager = new Manager("Raj", 75000, 26, 5, 75);
        Employee developer = new Developer("Rohit", 45000, 28, 4, 12);
        Employee intern = new Intern("Raman", 30000, 29, 4);

        System.out.println(manager.getNetSalary());
        System.out.println(developer.getNetSalary());
        System.out.println(intern.getNetSalary());
    }
}
