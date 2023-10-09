package Ativ3AVA;

public class Cliente {
    int codigo;
    String nome;
    int cpf;
    String telefone;

    public Cliente() {
    }

    public Cliente(int codigo, String nome, int cpf, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
            this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String toString() {
        return "\nCodigo: " + codigo + "\nNome: " + nome + "\nCPF: " + cpf + "\nTelefone: " + telefone;
    }

    public boolean comparaNome(String nome) {
        return this.nome.equals(nome);
    }
}
