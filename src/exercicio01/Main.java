package exercicio01;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cachorro pastorAlemao = new Cachorro("Pastor Alemão", "Bartolomeu", 4);

        Cachorro salsicha = new Cachorro("Salsicha", "Ferdinan", 4);

        pastorAlemao.mostrarInfo();
        pastorAlemao.latir();

        System.out.println();

        salsicha.mostrarInfo();
        salsicha.latir();

        System.out.println();

        salsicha.envelhecer();
        salsicha.mostrarInfo();

    }
}