package Empresa;

public abstract class Employee{
    public abstract void ponersalario();
    String name;
    int id;
    double salario;

    public void Employee (String nombre, int id, double salario) {
        this.name=nombre;
        this.id=id;
        this.salario=salario;
    }
}
