package Empresa;

public class Main {

    public static void main(String[] args) {
	// write your code here

        CompanyManager cm = new CompanyManagerImpl();
        cm.addEmployee("2292828X", "Juan", 0,null);
        cm.addEmployee("123456789A", "Vendor",0, null);
    }
}
