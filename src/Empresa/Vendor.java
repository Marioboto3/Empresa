package Empresa;

public class Vendor extends Employee {

    List<Venta> ventas;
    @Override
    public void ponersalario() {
    }

    public void addVenda(int id, double venda) {
        this.ventas.add(new Venda(id, venda));
    }
}
