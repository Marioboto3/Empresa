package Empresa;

public class Main {

    public static void main(String[] args) {

        CompanyManager companyManager = new CompanyManagerImpl();
        companyManager.addEmployee("2292828X", "Juan", 0,null);
        companyManager.addEmployee("123456789A", "Vendor",0, null);
    }
}
