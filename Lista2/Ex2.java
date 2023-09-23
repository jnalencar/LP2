package Lista2;

public class Ex2 {
    private String nome;
    private String posicao;
    private String nacionalidade;
    private double altura;
    private double peso;

    public Ex2() {
        this.nome = "Neymar";
        this.posicao = "Atacante";
        this.nacionalidade = "Brasileiro";
        this.altura = 1.75;
        this.peso = 68.5;
    }

    public Ex2(String nome, String posicao, String nacionalidade, double altura, double peso) {
        this.nome = nome;
        this.posicao = posicao;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return this.nome;
    }

    public String getPosicao() {
        return this.posicao;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public double getAltura() {
        return this.altura;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getIMC() {
        return this.peso / Math.pow(this.altura, 2);
    }   

    public String toString() {
        return "Nome: " + this.nome + "\nPosição: " + this.posicao + "\nNacionalidade: " + this.nacionalidade + "\nAltura: " + this.altura + "\nPeso: " + this.peso + "\nIMC: " + this.getIMC() + "\n";
    }   

}
