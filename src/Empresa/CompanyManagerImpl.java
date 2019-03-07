package Empresa;

public class CompanyManagerImpl implements CompanyManager {

    HashMap<String, Employee> employees;

    public CompanyManagerImpl() {
        this.employees = new HashMap<String, Employee>();
    }

    @Override
<<<<<<< HEAD
    public void addEmployee(String name, int id, double salary) {
=======
    public void addEmployee(String name, String id, double salary) {

        Employee e = new Operator(id, name, salary);
        this.employees.put (e.getId(), e);

>>>>>>> refs/remotes/origin/master
    }
    @Override
    public void nuevaventa(int idventa, int idvendedor) {
    }

<<<<<<< HEAD
    void CompanyManagerImpl(){}
=======
    public List<Employee> findAllByManager(String idManager) {
        Employee e = this.employee.get(idManager);
        Manager manager;
        List<Employee> res = null;

        if (e!=null && e instance Manager) {
            manager = (Manager)e;
            res = manager.getEmployees();
        }

        return res;

    }
>>>>>>> refs/remotes/origin/master
}
