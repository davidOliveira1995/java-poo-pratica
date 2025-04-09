package exercicio03;

public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, double salarioBase, double comissao) {
        super(nome, salarioBase);
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return super.getSalarioBase() + comissao;
    }

    @Override
    public String getCargo() {
        return "Vendedor";
    }
}
