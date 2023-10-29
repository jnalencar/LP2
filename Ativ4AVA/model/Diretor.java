package Ativ4AVA.model;

public class Diretor {
    private String nome;
    private int anosExp;
    private String nacionalidade;

    public Diretor() {
    }

    public Diretor(String nome, int anosExp, String nacionalidade) {
        this.nome = nome;
        this.anosExp = anosExp;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public int getAnosExp() {
        return anosExp;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnosExp(int anosExp) {
        this.anosExp = anosExp;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String toString(){
        return "Nome: " + this.nome + "\nAnos de Experiência: " + this.anosExp + "\nNacionalidade: " + this.nacionalidade;
    }
}
