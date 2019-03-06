package Empresa;

public interface CompanyManager {

    void addEmployee(String id, String name,  String type, double salary, String idManager);
    void nuevaVenta(int idventa, int idvendedor);

    List<Employee> findAllOrderBySalary();
    List<Employee> findAllOrderByName();
    List<Employee> findAllByManager(String idManager);


}
