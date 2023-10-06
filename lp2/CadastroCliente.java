package lp2;

import java.util.Scanner;

public class CadastroCliente {
	public static Cliente cadastraClientes() {
		Scanner rc = new Scanner(System.in);
        Cliente novoCliente = new Cliente();
        System.out.print("Informe código do cliente: ");
        novoCliente.setCodigo(rc.nextInt());
        System.out.print("Informe nome do cliente: ");
        novoCliente.setNome(rc.next());
        System.out.print("Informe CPF do cliente: ");
        novoCliente.setCpf(rc.nextInt());
        System.out.print("Informe telefone do cliente: ");
        novoCliente.setTelefone(rc.next());
        System.out.println("");
        rc.close();
        return novoCliente;
	}
	
	public static boolean buscaCliente(String nome, Cliente[] listaClientes) {
		boolean j = false;
		for(int i = 0; i < listaClientes.length; i++) {
			if(listaClientes[i].getNome().equals(nome)) { //CRIAR O EQUALS
				System.out.println(listaClientes[i]);
				j = true;
				
			}
		}
		return j;
	}
	
	public static void exibirDadosClientes(Cliente[] listaClientes, int qtdClientes) {
		for(int i = 0; i<qtdClientes; i++) {
			System.out.println(listaClientes[i]);
			System.out.println("");
		}
	}
	
    public static void main(String[] args) {
        System.out.println("Menu:");
        System.out.println("1 - Cadastrar clientes\n2 - Buscar cliente pelo nome\n3 - Exibir dados dos clientes\n4 - Sair");
        System.out.println("Escolha uma opção: ");
        Scanner rc = new Scanner(System.in);
        int opcao = rc.nextInt();
        Cliente[] listaClientes = new Cliente[50];
        for(int k = 0; k<50; k++) {
        	listaClientes[k] = new Cliente();
        }
        int qtdClientes = 0;
        while(opcao != 4) {
        	if(opcao == 1) {
        		Cliente novoCliente = cadastraClientes();
        		listaClientes[qtdClientes] = novoCliente;
        		qtdClientes = qtdClientes + 1;
        		//Cliente[] listaNovosClientes = cadastraClientes();
        		//listaClientes = listaClientes + listaNovosClientes
        	}
        	if(opcao == 2) {
        		System.out.print("Digite o nome do cliente que deseja buscar: ");
        		String nomeCliente = rc.next();
        		if(!buscaCliente(nomeCliente, listaClientes)) {
        			System.out.println("Nenhum cliente com o nome "+nomeCliente+" foi encontrado.");
        		}
        	}
        	if(opcao == 3) {
        		//if(qtdClientes > 0) {
        			exibirDadosClientes(listaClientes, qtdClientes);
        		//}
        		//else {
        			//System.out.println("Nenhum cliente cadastrado");
        		//}
        	}
        	System.out.println("Escolha uma opção: ");
        	opcao = rc.nextInt();
        	
        }
        rc.close();
    }
}
