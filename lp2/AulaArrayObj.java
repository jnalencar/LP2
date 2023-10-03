package lp2;

import java.util.Scanner;

public class AulaArrayObj {
    public static void main(String[] args) {
        System.out.println("Informe a quantidade de produtos:");
        Scanner rc = new Scanner(System.in);
        int quant = rc.nextInt();
        Produto[] listaProduto = new Produto[quant];
        for(int i = 0; i<listaProduto.length; i++){
            listaProduto[i] = new Produto();
            System.out.println("Informe código do produto: ");
            listaProduto[i].setCodigo(rc.nextInt());
            System.out.println("Informe nome do produto: ");
            listaProduto[i].setNome(rc.next());
            System.out.println("Informe valor do produto: ");
            listaProduto[i].setValor(rc.nextDouble());
        }
        rc.close();
        for(int i = 0; i<listaProduto.length; i++){
            System.out.println(listaProduto[i]);
        }
    }
}
