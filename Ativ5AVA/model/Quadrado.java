package Ativ5AVA.model;
import Ativ5AVA.interfaces.Forma;

public class Quadrado implements Forma {
    private float lado;

    public Quadrado(float lado){
        this.lado = lado;
    }

    public double calculaArea(){
        return Math.pow(lado, 2);
    }

    public double calculaPerimetro(){
        return 4 * lado;
    }

    public float getLado(){
        return lado;
    }

    public void setLado(float lado){
        this.lado = lado;
    }

    public String toString(){
        return "Quadrado de lado " + lado + "cm\nÁrea: " + calculaArea() + "cm²\nPerímetro: " + calculaPerimetro() + "cm";
    }
}
