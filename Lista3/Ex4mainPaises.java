package Lista3;

import java.util.Scanner;

public class Ex4mainPaises {
    public static void main(String[] args) {
        Ex4paises[] paises = new Ex4paises[999];
        Scanner rc = new Scanner(System.in);
        int numPaisesCadastrados = 0;
        System.out.println("Digite a sigla do país, o nome, a população e a dimensão do país. Digite 0 para sair.");
        while(true) {
            System.out.print("Digite a sigla do país: ");
            String sigla = rc.nextLine();
            if(sigla.equals("0")) {
                break;
            }
            System.out.print("Digite o nome do país: ");
            String nome = rc.nextLine();
            if(nome.equals("0")) {
                break;
            }
            System.out.print("Digite a população do país: ");
            int populacao = rc.nextInt();
            if(populacao == 0) {
                break;
            }
            while(populacao < 0){
                System.out.print("População não pode ser um valor negativo. Digite novamente.");
                System.out.print("Digite a população do país: ");
                populacao = rc.nextInt();
            }
            System.out.println("Digite a dimensão do país: ");
            double dimensao = rc.nextDouble();
            if(dimensao == 0) {
                break;
            }
            while(dimensao < 0){
                System.out.println("Dimensão não pode ser um valor negativo. Digite novamente.");
                System.out.println("Digite a dimensão do país: ");
                dimensao = rc.nextDouble();
            }
            rc.nextLine();
            paises[numPaisesCadastrados] = new Ex4paises(sigla, nome, populacao, dimensao);
            numPaisesCadastrados++;
        }
        rc.close();

        for(int i = 0; i < numPaisesCadastrados; i++) {
            if(paises[i] == null) {
                break;
            }
            System.out.print(paises[i].toString());
        }
    }
}
