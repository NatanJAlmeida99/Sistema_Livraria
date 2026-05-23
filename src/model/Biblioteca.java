package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public void popularDados() {
        Autor a1 = new Autor(1, "Machado de Assis", LocalDate.of(1838, 6, 21));
        Autor a2 = new Autor(2, "Gregório de Matos", LocalDate.of(1636, 12, 23));
        autores.add(a1);
        autores.add(a2);

        Livro l1 = new Livro(1, "Dom Casmurro", a1, LocalDate.of(2023, 12, 5));
        Livro l2 = new Livro(2, "Poemas Escolhidos de Gregório de Matos", a2, LocalDate.of(2022, 6, 8));
        livros.add(l1);
        livros.add(l2);
    }

    public void listarLivrosDisponiveis() {
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                System.out.println(livro.toString());
            }
        }
    }

    public void realizarEmprestimo(int id, String nomeCliente) {
        boolean encontrado = false;
        for (Livro livro : livros) {
            if (livro.getId() == id) {
                encontrado = true;
                livro.setDisponivel(false);
                livro.setDataAtualizacao(LocalDate.now());
                Emprestimo e1 = new Emprestimo(livro);
                e1.setNomeCliente(nomeCliente);
                e1.setDataEmprestimo(LocalDate.now());
                emprestimos.add(e1);
                System.out.println("Emprestimo realizado com sucesso por " + e1.getNomeCliente());
            }
        }
        if (!encontrado) {
            System.out.println("Livro de ID " + id + " não encontrado");
        }
    }
}
