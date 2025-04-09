package exercicio03;

public class Gerente extends Funcionario{
    private double bonus;

    public Gerente(double bonus) {
        this.bonus = bonus;
    }

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return super.getSalarioBase() + bonus;
    }

    @Override
    public String getCargo() {
        return "Gerente";
    }
}
