package util;

import entities.Employee;

import java.util.List;

public class EmployeeUtil {

    public static boolean hasId(List<Employee> employees, int id){
        Employee emp = employees.stream()
                .filter(x -> x.getId() == id)
                .findFirst()
                .orElse(null);
        return emp != null;
    }

    public static boolean CompareID(List<Employee> employees, int id){
        Employee emp = employees.stream()
                .filter(x -> x.getId() == id)
                .findFirst()
                .orElse(null);
        return emp == null;
    }

    public static void increaseSalary(List<Employee> employees, int id, double percentage) {
        Employee emp = employees.stream()
                .filter(employee -> employee.getId() == id)
                .findFirst()
                .orElse(null);

        if (emp != null) {
            emp.incrementSalary(percentage);
        } else {
            System.out.println("Employee not found!");
        }
    }
}
