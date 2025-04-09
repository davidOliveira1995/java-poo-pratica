package exercicio4;

import java.util.ArrayList;

public class Turma extends Aluno {
    private String nometurma;
    private ArrayList<Aluno> alunos;

    public Turma(String s) {
        super();
    }

    // Métodos

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }
    
    public void exibirTurma() {
        
    }
}
