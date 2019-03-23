package Empresa;

public class Main {

    public static void main(String[] args) {

        CompanyManager companyManager = new CompanyManagerImpl();

        Manager manager = new Manager("987654321Z", "Marc", 123);
        Vendor vendor = new Vendor("123456789A", "Pol", 321, "987654321Z");
        Operator operator = new Operator("567891234H", "Mike", 312, "987654321Z");

        companyManager.addEmployee(manager);
        companyManager.addEmployee(vendor);
        companyManager.addEmployee(operator);
    }
}
