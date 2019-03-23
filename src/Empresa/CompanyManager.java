package Empresa;

import java.util.List;

public interface CompanyManager {

    void addSale(int id, int idVendor);
    void addEmployee(String id, String name, double salary, String idManager);
    List<Employee> findAllOrderBySalary();
    List<Employee> findAllOrderByName();
    List<Employee> findAllByManager(String idManager);

}
