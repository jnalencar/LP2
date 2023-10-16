package Lista3;

public class Ex5aluno {
    int matricula;
    String nome;
    double nota1;
    double nota2;
    double media;

    public Ex5aluno() {
    }

    public Ex5aluno(int matricula, String nome, double nota1, double nota2) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = getMedia();
    }

    public double getMedia() {
        return (nota1 + nota2)/2;
    }
    
    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /*public void setMedia(double media) {
        this.media = media;
    }*/ 
    // Não é possível alterar a média, pois ela é calculada a partir das notas 1 e 2

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
        this.media = (nota1 + this.nota2)/2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
        this.media = (this.nota1 + nota2)/2;
    }

    public String toString() {
        return "\nMatrícula: " + matricula + "\nNome: " + nome + "\nNota 1: " + nota1 + "\nNota 2: " + nota2 + "\nMédia: " + media;
    }

    public boolean comparaNome(String nome) {
        return this.nome.equals(nome);
    }
}

