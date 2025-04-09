package exercicio4;

public class Aluno {
    private String nome;
    private int idade;
    private double mediaNotas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getMediaNotas() {
        return mediaNotas;
    }

    public void setMediaNotas(double mediaNotas) {
        this.mediaNotas = mediaNotas;
    }

    // Métodos

    public void exibirInfo() {
        System.out.println(
                "Nome: " + getNome() + "\n"
                + "Idade: " + getIdade() + "\n"
                + "Média Escolar: " + getMediaNotas()
        );
    }
}
