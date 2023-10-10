package Lista3;

public class Ex4paises {
    String sigla;
    String nome;
    int populacao;
    double dimensao;

    public Ex4paises() {
    }

    public Ex4paises(String sigla, String nome, int populacao, double dimensao) {
        this.sigla = sigla;
        this.nome = nome;
        this.populacao = populacao;
        this.dimensao = dimensao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public String getNome() {
        return nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public String getSigla() {
        return sigla;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String toString() {
        return "\nSigla: " + sigla + "\nNome: " + nome + "\nPopulação: " + populacao + "\nDimensão: " + dimensao;
    }

    public double densidadePopulacional() {
        return populacao/dimensao;
    }
}
