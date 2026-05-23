package model;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca b1 = new Biblioteca();
        Scanner input = new Scanner(System.in);
        b1.popularDados();
        boolean rodando = true;

        while (rodando) {
            System.out.println("=== Biblioteca ===\n1 - Listar livros disponíves" +
                    "\n2 - Realizar empréstimo\n3 - Cadastrar novo livro\n0 - Sair");

            System.out.println("Informe sua opção");
            int option = Integer.parseInt(input.nextLine());
            switch (option) {
                case 1:
                    b1.listarLivrosDisponiveis();
                    break;
                case 2:
                    System.out.println("Qual o seu nome: ");
                    String nome = input.nextLine();
                    System.out.println("Qual é o ID do livro que deseja realizar o empréstimo");
                    int livro = Integer.parseInt(input.nextLine());
                    b1.realizarEmprestimo(livro, nome);
                    break;
                case 3:
                    System.out.println("Qual o titulo do livro? ");
                    String nomeLivro = input.nextLine();
                    System.out.println("Qual o nome do Autor");
                    String nomeAutor = input.nextLine();
                    System.out.println("Qual a data de nascimento nesse formato: aaaa-MM-dd (ex: 1888-06-13)");
                    LocalDate dataNascimento = LocalDate.parse(input.nextLine());
                    Autor autor = b1.cadastrarAutor(nomeAutor, dataNascimento);
                    b1.cadastrarLivro(nomeLivro, autor);
                    System.out.println("Livro cadastrado com sucesso");
                    break;
                case 0:
                    System.out.println("Até logo");
                    rodando = false;
                    break;
            }
        }
    }
}
