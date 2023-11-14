package Ativ5AVA.model;
import Ativ5AVA.interfaces.Forma;

public class Circulo implements Forma{
    private float raio;

    public Circulo(float raio){
        this.raio = raio;
    }

    public double calculaArea(){
        return Math.PI * Math.pow(raio, 2);
    }

    public double calculaPerimetro(){
        return 2 * Math.PI * raio;
    }
    
    public float getRaio(){
        return raio;
    }

    public void setRaio(float raio){
        this.raio = raio;
    }

    public String toString(){
        return "Círculo de raio " + raio + "cm\nÁrea: " + calculaArea() + "cm²\nPerímetro: " + calculaPerimetro() + "cm";
    }
}
