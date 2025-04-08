package exercicio02;

public class Cachorro extends Animal{

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au! \uD83D\uDC36");
    }

    public void abanarRabo() {
        System.out.println(getNome() + " está abanando o rabo! \uD83D\uDC36");
    }
}
