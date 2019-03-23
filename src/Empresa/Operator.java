package Empresa;

public class Operator extends Employee {

    public Operator(String id, String name, double salary, String idManager) {
        super(id, name, salary, idManager);
    }

    @Override
    public double getSalary() {
        return this.salary;
    }
}
