package Empresa;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class CompanyManagerImpl implements CompanyManager {

    private HashMap<String, Employee> employees;

    public CompanyManagerImpl() {
        this.employees = new HashMap<>();
    }

    @Override
    public void addSale(int id, int idVendor) {

    }

    @Override
    public void addEmployee(String id, String name, double salary, String idManager) {
        Employee employee = new Employee(id, name, salary, idManager);
        this.employees.put(employee.getId(), employee);
    }

    @Override
    public List<Employee> findAllOrderBySalary() {
        return null;
    }

    @Override
    public List<Employee> findAllOrderByName() {
        return null;
    }


    @Override
    public List<Employee> findAllByManager(String idManager) {

        Employee employee = this.employees.get(idManager);
        Manager manager;
        List<Employee> res = new LinkedList<>();

        if (employee instanceof Manager) {
            manager = (Manager) employee;
            res = manager.getEmployees();
        }

        return res;
    }
}
