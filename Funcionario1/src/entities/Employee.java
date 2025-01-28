package entities;

public class Employee {

    private Integer id;
    private String name;
    private Double salary;

    public Employee(){

    }

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSalary() {
        return salary;
    }

    public void incrementSalary(Double percentage){
        salary += salary * percentage / 100;
    }

    @Override
    public String toString() {
        return "id: " + id + " | " +
                "Name: " + name + " | " +
                "Salary: " + String.format("%.2f", salary);
    }
}
