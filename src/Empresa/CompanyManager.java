package Empresa;

import java.util.List;

public interface CompanyManager {

<<<<<<< HEAD
void nuevaventa(int idventa, int idvendedor);
void addEmployee(String name, int id, double salary);
=======
    void addEmployee(String id, String name,  String type, double salary, String idManager);
    void nuevaVenta(int idventa, int idvendedor);

    List<Employee> findAllOrderBySalary();
    List<Employee> findAllOrderByName();
    List<Employee> findAllByManager(String idManager);
>>>>>>> refs/remotes/origin/master


}
