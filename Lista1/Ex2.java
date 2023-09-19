package Lista1;
/*
 * 2. Faça um programa que leia 10 números inteiros e calcule a média
 * desses números.
 */

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rc = new Scanner(System.in);
		System.out.println("Digite 10 numeros inteiros.");
		int total = 0;
		for(int i=0; i<10; i++) {
			System.out.print("Numero "+(i+1)+": ");
			total = total + rc.nextInt();
		}
		rc.close();
		System.out.println("A media dos numeros digitados e: "+(double)total/10+".");
	}

}
