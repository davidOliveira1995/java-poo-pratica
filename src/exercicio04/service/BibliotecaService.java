package exercicio04.service;

import exercicio04.model.Biblioteca;
import exercicio04.model.Livro;
import exercicio04.model.Usuario;

public class BibliotecaService {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Forrest Grump", "Mozard", false);
        Livro livro2 = new Livro("Aprendendo OOP", "Autor 2", true);
        Livro livro3 = new Livro("Aprendendo Java iniciante", "Autor 2", true);

        Usuario usuario1 = new Usuario("David de Oliveira", "37852");
    }
}
