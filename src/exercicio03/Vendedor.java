package exercicio03;

public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, double salarioBase, double comissao) {
        super(nome, salarioBase);
        this.comissao = comissao;
    }

    public Vendedor(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double getSalarioBase() {
        return super.getSalarioBase() + comissao;
    }
}
