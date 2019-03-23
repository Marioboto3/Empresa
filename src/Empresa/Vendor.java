package Empresa;

import java.util.List;

public class Vendor extends Employee {

    private List<Sale> sales;

    public Vendor(String id, String name, double salary, String idManager) {
        super(id, name, salary, idManager);
    }

    @Override
    public double getSalary() {
        return this.salary * (1 + this.sales.size() * 0.01);
    }
}
