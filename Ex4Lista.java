/* 
 * 4. Faça um programa que, enquanto o usuário desejar, leia números
 * inteiros. Ao final, o programa deve exibir a quantidade de números pares e
 * ímpares informados.
 */

package lp20232;

import java.util.Scanner;

public class Ex4Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int par = 0;
		int impar = 0;
		int contador = 1;
		Scanner rc = new Scanner(System.in);
		System.out.println("Digite numeros inteiros, para finalizar a leitura digite qualquer coisa que nao seja um inteiro.");
		System.out.print("Numero "+contador+": ");
		while(rc.hasNextInt()) {
			System.out.print("Numero "+contador+": ");
			int j = rc.nextInt();
			if (j % 2 == 0) {
				par++;
			}
			else {
				impar++;
			}
			contador++;
		}
		rc.close();
		System.out.println("Foram digitados "+par+" numeros pares e "+impar+" numeros impares.");
			
	}

}
