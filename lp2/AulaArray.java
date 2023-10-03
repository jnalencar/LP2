package lp2;

import java.util.Scanner;

public class AulaArray {
	public static void main(String[] args) {
		Scanner rc = new Scanner(System.in);
		System.out.println("Insira a quantidade de alunos na turma: ");
		int quant = rc.nextInt();
		float notas[] = new float[quant];
		float total = 0;
		for(int i = 0; i<quant; i++) {
			System.out.print("Insira a nota do aluno "+(i+1)+": ");
			notas[i]= rc.nextFloat();
			total+=notas[i];
		}
		System.out.println("A media da turma é de: "+total/quant);
	}
}
