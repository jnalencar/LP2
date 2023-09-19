package Lista1;
/*
 * 3. Faça um programa que leia 15 números inteiros e exiba na tela qual
 * é o maior dos números lidos.
 */

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rc = new Scanner(System.in);
		System.out.println("Digite 15 numeros");
		int maior = -2147483648; 	/* 	Menor valor possivel para um int, logo todo valor digitado
									 *	que cabe na variavel deve ser maior do que -2147483648,
									 *	o valor digitado também deve ser menor que 2147483647 para nao
									 *	estourar o limite da variavel
									 */
		for(int i=1; i<=15; i++) {
			System.out.print("Numero "+i+": ");
			int n = rc.nextInt();
			maior = n>maior?n:maior;
		}
		rc.close();
		System.out.println("O maior numero digitado e: "+maior+".");
	}

}
