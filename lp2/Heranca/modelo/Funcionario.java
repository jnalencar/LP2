package modelo;

public class Funcionario extends pessoa{
	private Data dtAdm;
	private double salario;
	
	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Funcionario(String nome, Data dtNasc, String cpf) {
		super(nome, dtNasc, cpf);
		// TODO Auto-generated constructor stub
	}

	public Funcionario(String nome, Data dtNasc, String cpf, Data dtAdm, double salario) {
		super(nome, dtNasc, cpf);
		this.dtAdm = dtAdm;
		this.salario = salario;
	}

	public Data getDtAdm() {
		return dtAdm;
	}

	public void setDtAdm(Data dtAdm) {
		this.dtAdm = dtAdm;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String toStrin() {	
		return super.toString()+"\nData de admissao="+getDtAdm()+" Salario= "+getSalario();
	}

}
