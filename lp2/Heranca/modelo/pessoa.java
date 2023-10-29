package modelo;

public class pessoa {
	private String nome;
	private Data dtNasc;
	private String cpf;
	
	public pessoa() {
	}

	public pessoa(String nome, Data dtNasc, String cpf) {
		this.nome = nome;
		this.dtNasc = dtNasc;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Data getDtNasc() {
		return dtNasc;
	}

	public void setDtNasc(Data dtNasc) {
		this.dtNasc = dtNasc;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "pessoa [nome=" + nome + ", dtNasc=" + dtNasc + ", cpf=" + cpf + "]";
	}
	
	
}
