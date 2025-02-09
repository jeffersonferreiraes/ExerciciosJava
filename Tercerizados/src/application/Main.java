package application;

import entities.Employee;
import entities.OutsourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i ++){
            System.out.println("Employee #" + (i+1) + " data: ");
            System.out.print("Outsourced (y/n): ");
            char out = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            Integer hours = sc.nextInt();
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();
            if (out == 'y') {
                   System.out.print("Additional charge: ");
                   Double additionalCharge = sc.nextDouble();
                   Employee emp = new OutsourceEmployee(name, hours, valuePerHour, additionalCharge);
                   list.add(emp);
               }
            else if (out == 'n') {
                   Employee emp = new Employee(name, hours, valuePerHour);
                   list.add(emp);
               }
            else {
                   System.out.println("Opção invalida: Y ou N");
                   i--;
                   sc.nextLine();
            }
        }

        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee emp : list){
            System.out.println(emp);
        }

        sc.close();
    }
}