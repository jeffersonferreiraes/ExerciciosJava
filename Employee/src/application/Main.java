package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Gross Salary: ");
        Double grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        double tax = sc.nextDouble();
        sc.nextLine();
        Employee employee = new Employee(name, grossSalary, tax);

        System.out.println("Employee: $" + employee.NetSalary());
        System.out.print("Wich percentage to increase salary? ");
        double percentage = sc.nextDouble();
        sc.nextLine();
        employee.IncreaseSalary(percentage);

        System.out.println(employee);
    }
}