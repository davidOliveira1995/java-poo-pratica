package exercicio03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Gerente("Lucas", 4000, 3000));
        funcionarios.add(new Vendedor("Carla",3000,2000));
        funcionarios.add(new Funcionario("Ana", 3200));

        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof Gerente) {
                ((Gerente) funcionario).exebirDados();
            } else if(funcionario instanceof Vendedor) {
                ((Vendedor) funcionario).exebirDados();
            } else if(funcionario instanceof Funcionario) {
                ((Funcionario) funcionario).exebirDados();
            }
        }
    }
}
