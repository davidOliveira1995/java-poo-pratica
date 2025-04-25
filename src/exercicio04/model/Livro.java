package exercicio04.model;

public class Livro {
    private String titulo;
    private String autor;
    private boolean status;

    public Livro() {
    }

    public Livro(String titulo, String autor, boolean status) {
        this.titulo = titulo;
        this.autor = autor;
        this.status = status;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
