public class Cachorro {
    private String nome;
    private String raca;
    private int idade;

    public Cachorro(String raca, String nome, int idade) {
        this.raca = raca;
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Métodos

    public void latir() {
        System.out.println("Au au! Eu sou o " + this.nome);
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + this.nome + "\n" +
                "Raça: " + this.raca + "\n" +
                "Idade: " + this.idade + " anos!");
    }

    public void envelhecer() {
        String mensagem = "O " + this.nome + " fez aniversário!";
        System.out.println(mensagem);
        this.idade += 1;
    }
}
