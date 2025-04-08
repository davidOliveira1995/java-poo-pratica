package exercicio02;

public class Gato extends Animal {

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau! \uD83D\uDE3E");
    }

    public void arranharMoveis() {
        System.out.println(getNome() + " está arranhando os móveis! \uD83D\uDE3E");
    }
}
