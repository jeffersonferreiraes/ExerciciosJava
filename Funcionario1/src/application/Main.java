package application;

import entities.Employee;
import util.EmployeeUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++ ){
            System.out.println();
            System.out.println("Employee #" + (i+1) + ": ");
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            while (EmployeeUtil.hasId(employees, id)){
                System.out.println("ID already exist");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            String name = sc.next();
            sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            employees.add(new Employee(id, name, salary));

        }

        System.out.println();

        System.out.print("Enter the employee id that will have salary increase: ");
        Integer id = sc.nextInt();
        while (true) {
            if (EmployeeUtil.CompareID(employees, id)) {
                System.out.println("ID not exist!");
                System.out.println("Availables id:");
                for (Employee obj : employees) {
                    System.out.println(obj);
                }
                System.out.print("Choose one of the ids above: ");
                id = sc.nextInt();
            } else {
                System.out.print("Enter the percentage: ");
                Double percentage = sc.nextDouble();
                EmployeeUtil.increaseSalary(employees, id, percentage);
                break;
            }

        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee obj : employees){
            System.out.println(obj);
        }

        sc.close();

    }
}