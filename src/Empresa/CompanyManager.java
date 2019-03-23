package Empresa;

import java.util.List;

public interface CompanyManager {

    void addSale(int id, int idVendor);
    void addEmployee(String name, int id, double salary, String idManager);
    List<Employee> findAllOrderBySalary();
    List<Employee> findAllOrderByName();
    List<Employee> findAllByManager(String idManager);

}
