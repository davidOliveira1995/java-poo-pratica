package exercicio02;

public class Papagaio extends Animal {

    public Papagaio(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Curupaco! Eu sou o " + getNome() + "! \uD83E\uDD9C");
    }

    public void repetirPalavras() {
        System.out.println(getNome() + " está repetindo palavras engraçadas! \uD83E\uDD9C");
    }
}
