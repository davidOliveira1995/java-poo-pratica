package exercicio03;

public class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario() {
    }

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    // Métodos
    public double calcularSalario() {
        return salarioBase;
    }

    public void exebirDados() {
        System.out.println("Nome: " + getNome() + "\n"
        + "Salário Base: R$ " + getSalarioBase());

    }
}
