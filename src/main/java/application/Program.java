package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = input.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = input.nextDouble();
        System.out.print("Tax: ");
        employee.tax = input.nextDouble();

        System.out.println();
        System.out.print("Employee: " + employee.name);
        System.out.printf(", $ %.2f%n", employee.netSalary());

        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = input.nextDouble();

        employee.increaseSalary(percentage);

        System.out.println();
        System.out.print("Update data: " + employee.name);
        System.out.printf(", $ %.2f", employee.netSalary());

        input.close();

    }
}
