package exercicio02;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro("Bertozo", 3));
        animais.add(new Gato("Julinho", 4));
        animais.add(new Papagaio("Louro José", 6));

        for(Animal animal : animais) {
            animal.emitirSom();

            if (animal instanceof Cachorro) {
                ((Cachorro) animal).abanarRabo();
            } else if(animal instanceof Gato) {
                ((Gato) animal).arranharMoveis();
            } else if (animal instanceof Papagaio) {
                ((Papagaio) animal).repetirPalavras();
            }
        }

        System.out.println();

    }
}
