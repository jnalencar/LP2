package lp2;

import java.util.Scanner;

public class CadastroCliente {
    public static void main(String[] args) {
        System.out.print("Informe a quantidade de clientes:");
        Scanner rc = new Scanner(System.in);
        int quant = rc.nextInt();
        while(quant>50){
            System.out.println("Quantidade de clientes não pode ser maior que 50");
            System.out.print("Informe a quantidade de clientes:");
            quant = rc.nextInt();
        }
        Cliente[] listaCliente = new Cliente[quant];
        for(int i = 0; i<listaCliente.length; i++){
            listaCliente[i] = new Cliente();
            System.out.print("Informe código do cliente: ");
            listaCliente[i].setCodigo(rc.nextInt());
            System.out.print("Informe nome do cliente: ");
            listaCliente[i].setNome(rc.next());
            System.out.print("Informe CPF do cliente: ");
            listaCliente[i].setCpf(rc.nextInt());
            System.out.print("Informe telefone do cliente: ");
            listaCliente[i].setTelefone(rc.next());
            System.out.println("");
        }
        
        rc.close();
        System.out.println("\nForam cadastrados "+quant+" clientes");
        for(int i = 0; i<listaCliente.length; i++){
            System.out.println(listaCliente[i]);
        }
    }
}
