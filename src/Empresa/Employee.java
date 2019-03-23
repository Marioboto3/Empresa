package Empresa;

public abstract class Employee {

    //Attributes
    private String id;
    private String name;
    double salary;
    private String idManager;

    //Constructor
    public Employee(String id, String name, double salary, String idManager) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.idManager = idManager;
    }

    //Methods
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public abstract double getSalary();

    public String getIdManager() {
        return idManager;
    }

}