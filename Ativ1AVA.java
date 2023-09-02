/* 
 * Faça um programa em Java que leia uma quantidade desconhecida de números e 
 * conte quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. 
 * A entrada de dados deve terminar quando for lido um número negativo. Ao final, o programa 
 * deve exibir o resultado contabilizado em cada intervalo, bem como a quantidade total de 
 * números lidos.
 */

import java.util.Scanner;

public class Ativ1AVA {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rc = new Scanner(System.in);
		int grp1 = 0; // Inteiros no intervalo [0-25]
		int grp2 = 0; // Inteiros no intervalo [26-50]
		int grp3 = 0; // Inteiros no intervalo [51-75]
		int grp4 = 0; // Inteiros no intervalo [76-100]
		int contador = 0; // Contador de quantos numeros foram digitados.
		
		System.out.print("Digite um numero maior que 0: ");
		int i = rc.nextInt();
		while(i>=0) {
			contador++;
			if (i<=25){
				grp1++;
			}
			else {
				if(i<=50) {
					grp2++;
				}
				else {
					if(i<=75) {
						grp3++;
					}
					else {
						if(i<=100) {
							grp4++;
						}
					}
				}
			}
			System.out.print("Digite um numero maior que 0: ");
			i = rc.nextInt();
		}
		rc.close();
		System.out.println("Numeros no intervalo [0-25]: "+grp1+".");
		System.out.println("Numeros no intervalo [26-50]: "+grp2+".");
		System.out.println("Numeros no intervalo [51-75]: "+grp3+".");
		System.out.println("Numeros no intervalo [76-100]: "+grp4+".");
		System.out.println("Total de numeros digitados: "+contador+".");
	}
}
