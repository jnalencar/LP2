/*
 * 1. A prefeitura do Rio de Janeiro abriu uma linha de crédito para os seus
 * funcionários. O valor máximo da prestação não poderá ultrapassar 30% do
 * salário bruto. Faça um programa em Java que permita entrar com o salário
 * bruto e o valor da prestação e informe se o empréstimo pode ou não ser
 * concedido.
 */

package lp20232;

import java.util.Scanner;

public class Ex1Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rc = new Scanner(System.in);
		System.out.print("Insira o salario bruto: ");
		double salario = rc.nextDouble();
		System.out.print("Insira o valor da prestacao: ");
		double prestacao = rc.nextDouble();
		rc.close();
		String resultado = prestacao/salario<=0.3?"aprovado. :)":"recusado, a prestacao nao pode ser maior do que 30% do salario bruto.";
		System.out.println("Seu pedido de credito foi "+resultado);
	}

}
