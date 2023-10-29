package Ativ4AVA.model;

public class Filme {
    private String titulo;
    private String descricao;
    private Diretor diretor;
    private int duracaoEmMinutos;

    public Filme() {
    }

    public Filme(String titulo, String descricao, Diretor diretor, int duracaoEmMinutos) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.diretor = diretor;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }
    
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String exibiDuracaoEmHoras(){
        int horas = this.duracaoEmMinutos / 60;
        int minutos = this.duracaoEmMinutos % 60;
        return "O filme "+this.titulo+" possui "+horas + "horas e " + minutos + " minutos de duração.";
    }

    public boolean comparaNome(String nome){
        return this.titulo.equals(nome);
    }

    public String toString(){
        return "\nTítulo: " + this.titulo + "\nDescrição: " + this.descricao + "\nDiretor: " + this.diretor.getNome() + "\nDuração: " + this.duracaoEmMinutos + " minutos";
    }
}
