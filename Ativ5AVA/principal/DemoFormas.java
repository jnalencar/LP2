package Ativ5AVA.principal;
import Ativ5AVA.model.Retangulo;
import Ativ5AVA.model.Quadrado;

import java.util.Scanner;

import Ativ5AVA.model.Circulo;

public class DemoFormas {
    public static void main(String[] args) {
        Scanner rc = new Scanner(System.in);
        int op;
        do{
            System.out.println("***** MENU *****");
            System.out.println("1 - Criar Retângulo");
            System.out.println("2 - Criar Quadrado");
            System.out.println("3 - Criar Círculo");
            System.out.println("4 - Sair");
            System.out.print("Digite a opção desejada: ");
            op = rc.nextInt();
            rc.nextLine();
            switch(op){
                case 1:
                    System.out.println("Digite o lado do retângulo: ");
                    float lado = rc.nextFloat();
                    rc.nextLine();
                    System.out.println("Digite a altura do retângulo: ");
                    float altura = rc.nextFloat();
                    rc.nextLine();
                    Retangulo retangulo = new Retangulo(lado, altura);
                    System.out.println(retangulo);
                    break;

                case 2:
                    System.out.println("Digite o lado do quadrado: ");
                    float ladoQ = rc.nextFloat();
                    rc.nextLine();
                    Quadrado quadrado = new Quadrado(ladoQ);
                    System.out.println(quadrado);
                    break;

                case 3:
                    System.out.println("Digite o raio do círculo: ");
                    float raio = rc.nextFloat();
                    rc.nextLine();
                    Circulo circulo = new Circulo(raio);
                    System.out.println(circulo);
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }while(op != 4);
    }
}
