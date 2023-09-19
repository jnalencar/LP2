package Lista2;

public class Ex1 {
    private double raio;
    private String cor;

    public Ex1 () {
        this.raio = 1;
        this.cor = "vermelho";
    }

    public Ex1(double raio, String cor) {
        this.raio = raio;
        this.cor = cor;
    }

    public double getRaio() {
        return this.raio;
    }

    public String getCor() {
        return this.cor;
    }   

    public void setRaio(double raio) {
        this.raio = raio;
    }   

    public void setCor(String cor) {
        this.cor = cor;
    }   

    public double getArea() {
        return  2 * Math.PI * Math.pow(this.raio, 2);
    }

    public String dadosCirculo() {
        return "Raio: " + this.raio + "\nCor: " + this.cor + "\nArea: " + this.getArea()+"\n";
    }
}
