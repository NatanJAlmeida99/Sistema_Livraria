package model;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca b1 = new Biblioteca();
        Scanner input = new Scanner(System.in);
        b1.popularDados();

        while (true) {
            System.out.println("Quer ver a lista de livro: ");
            String option = input.nextLine();

            if (option.equalsIgnoreCase("Sim")) {
                b1.listarLivrosDisponiveis();

                System.out.println("Qual o seu nome? ");
                String nome = input.nextLine();
                System.out.println("Qual o ID do livro que quer fazer o emprestimo ");
                int livro = Integer.parseInt(input.nextLine());
                b1.realizarEmprestimo(livro, nome);
            } else {
                System.out.println("Até logo");
                break;
            }
        }
    }
}
