package Empresa;

import java.util.List;

public class Manager extends Employee {

    private List<Employee> employees;

    public Manager(String id, String name, double salary) {
        super(id, name, salary, null);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public double getSalary() {
        return this.salary * ( 1 + this.employees.size() * 0.01 );
    }
}
