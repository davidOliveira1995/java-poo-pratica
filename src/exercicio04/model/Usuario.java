package exercicio04.model;

import java.util.List;

public class Usuario {
    private String nome;
    private String id;
    private List<Livro> livrosEmprestados;

    public Usuario() {
    }

    public Usuario(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    public Usuario(String nome, String id, List<Livro> livrosEmprestados) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = livrosEmprestados;
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    private void adicionarLivro(Livro livro) {

    }

    private void removerLivro(Livro livro) {

    }
}
