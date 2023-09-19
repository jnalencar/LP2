package lp2;

import java.text.DecimalFormat;

public class Empresa {
	public static void main(String[] args) {
		DecimalFormat decimalFormat =  new DecimalFormat("#0.00");
		Funcionario f1, f2;
		f1 = new Funcionario("abc", "Souza", -200);
		f2 = new Funcionario();
		f2.setNome("zyx");
		f2.setSobrenome("da Silva");
		f2.setSalario(200);
		
		f1.setSalario(f1.getSalario()*1.1);
		f2.setSalario(f2.getSalario()*1.1);
		
		System.out.println("Salario do "+f1.getNome()+" "+f1.getSobrenome()+": "+decimalFormat.format(f1.getSalario()*12));
		System.out.println("Salario do "+f2.getNome()+" "+f2.getSobrenome()+": "+decimalFormat.format(f2.getSalario()*12));
	}
}
