package Ativ4AVA.principal;

import java.util.ArrayList;
import java.util.Scanner;
import Ativ4AVA.model.Filme;
import Ativ4AVA.model.Diretor;

public class MainFilme {
    public static void main(String[] args) {
        ArrayList<Filme> filmes = new ArrayList<>();
        Scanner rc = new Scanner(System.in);
        int op;
        do{
            System.out.println("***** MENU *****");
            System.out.println("1 - Cadastrar Filme");
            System.out.println("2 - Buscar Filme");
            System.out.println("3 - Exibir lista de Filmes");
            System.out.println("4 - Sair");
            op = rc.nextInt();
            rc.nextLine();
            switch(op){
                case 1:
                    System.out.println("Digite o título do filme: ");
                    String titulo = rc.nextLine();
                    System.out.println("Digite a descrição do filme: ");
                    String descricao = rc.nextLine();
                    System.out.println("Digite o nome do diretor do filme: ");
                    String nomeDiretor = rc.nextLine();
                    System.out.println("Digite a quantidade de anos de experiência do diretor: ");
                    int anosExp = rc.nextInt();
                    rc.nextLine();
                    System.out.println("Digite a nacionalidade do diretor: ");
                    String nacionalidade = rc.nextLine();
                    System.out.println("Digite a duração do filme em minutos: ");
                    int duracaoEmMinutos = rc.nextInt();
                    rc.nextLine();
                    Diretor diretor = new Diretor(nomeDiretor, anosExp, nacionalidade);
                    Filme filme = new Filme(titulo, descricao, diretor, duracaoEmMinutos);
                    filmes.add(filme);
                    break;

                case 2:
                    System.out.println("Digite o nome do filme: ");
                    String nome = rc.nextLine();
                    boolean achou = false;
                    for(Filme f : filmes){
                        if(f.comparaNome(nome)){
                            System.out.println(f);
                            achou = true;
                        }
                    }
                    if(!achou)
                        System.out.println("Filme não encontrado.");
                    break;

                case 3:
                    for(Filme f : filmes){
                        System.out.println(f);
                    }
                    break;
            }
        }while(op != 4);
        rc.close();
    }
}
