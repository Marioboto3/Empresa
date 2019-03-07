package Empresa;

import java.util.List;

public class Manager extends Employee{

    List<Employee> employees;

    @Override
    public void salario() {

    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
