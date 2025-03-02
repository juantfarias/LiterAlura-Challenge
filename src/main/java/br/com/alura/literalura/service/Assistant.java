package br.com.alura.literalura.service;

import java.net.URLEncoder;
import java.util.Scanner;

public class Assistant {

    private static final Scanner scanner = new Scanner(System.in);

    //Auxiliares de mensagem

    public static void showTitle() {
        System.out.println("\n=================================================================");
        System.out.println("|                    ♦♦♦♦♦ LiterAlura ♦♦♦♦♦                    |");
    }

    public static void showMenuOptions() {
        System.out.println("""
                =================================================================
                                     ♦♦♦ MENU DE OPÇÕES ♦♦♦
                
                ♦ 1 - Buscar e registrar livros via API Gutendex
                ♦ 2 - Listar livros e autores
                
                ♦ 0 - Sair
                """);
    }

    public static void showMenuSearch() {
        System.out.println("""
                =================================================================
                           ♦♦♦ MENU DE OPÇÕES DE BUSCA E REGISTRO ♦♦♦
                
                ♦ 1 - Livros pelo título
                ♦ 2 - Livros pelo autor e título
                
                ♦ 9 - Voltar
                
                ♦ 0 - Sair
                """);
    }

    public static void showMenuList() {
        System.out.println("""
                =================================================================
                               ♦♦♦ MENU DE OPÇÕES DE LISTAGEM ♦♦♦
                
                ♦ 1 - Livros registrados
                ♦ 2 - Autores registrados
                ♦ 3 - Livros registrados por autores vivos em um ano específico
                ♦ 4 - Livros registrados por idioma
                ♦ 5 - Livros registrados por título ou nome do autor
                ♦ 6 - Top 10 livros mais baixados
                
                ♦ 9 - Voltar
                
                ♦ 0 - Sair
                """);
    }

    public static void showMenuListLanguage() {
        System.out.println("""
                =================================================================
                                ♦♦ DIGITE O IDIOMA PARA BUSCA ♦♦

                ♦ "es" para Espanhol
                ♦ "en" para Inglês
                ♦ "fr" para Francês
                ♦ "pt" para Português
                """);
    }

    public static void titleBook() {
        System.out.println("\n=================================================================");
        System.out.println("|                       ♦♦♦♦♦ LIVRO ♦♦♦♦♦                      |");
        System.out.println("=================================================================\n");
    }

    public static void titleBooks() {
        System.out.println("\n=================================================================");
        System.out.println("|                 ♦♦♦♦♦ LISTA DE LIVRO(S) ♦♦♦♦♦                |");
        System.out.println("=================================================================\n");
    }

    public static void titleAuthor() {
        System.out.println("\n=================================================================");
        System.out.println("|                 ♦♦♦♦♦ LISTA DE AUTORES ♦♦♦♦♦                 |");
        System.out.println("=================================================================\n");
    }

    public static void topTitle() {
        System.out.println("\n=================================================================");
        System.out.println("|                 ♦♦♦♦♦ TOP 10 DOWNLOADS ♦♦♦♦♦                 |");
        System.out.println("=================================================================\n");
    }

    public static void closingSentence() {
        System.out.println("\n♦ Desafio do curso Java e Spring Framework ♦");
        System.out.println("♦ \"Oracle Next Education - ONE - T6\" ♦");
        System.out.println("♦ Feita por Juan Farias . ♦");
        System.out.println("♦ Obrigado por usar esta aplicação! ♦");
        System.out.println("♦ Finalizando! ♦\n.....");
        System.out.println("...\n.\n");
    }

    public static void message1() {
        System.out.println("\n♦ Você ainda não cadastrou nenhum livro!");
        System.out.println("♦ Por favor, cadastre algum através das opção 1 ou 2 do menu de busca e registro de livros. ♦\n");
    }

    public static void message2() {
        System.out.println("\n♦ Opção inválida! ♦");
    }

    public static void message3() {
        System.out.println("♦ Por favor, escolha uma das opções. ♦\n");
    }

   public static void message4() {
       System.out.println("\n♦ Entrada inválida! ♦");
   }

   public static void message5() {
       System.out.print("♦ Digite uma opção: ");
   }

    //Auxiliares de construção

    public static String takeBookName() {
        System.out.print("♦ Qual livro deseja pesquisar? ");
        return URLEncoder.encode(scanner.nextLine());
    }

    public static String takeAuthorName() {
        System.out.print("♦ Qual autor deseja pesquisar? ");
        return URLEncoder.encode(scanner.nextLine());
    }
}
