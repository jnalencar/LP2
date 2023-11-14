package Ativ5AVA.model;
import Ativ5AVA.interfaces.Forma;

public class Retangulo implements Forma{
    private float lado;
    private float altura;

    public Retangulo(float lado, float altura){
        this.lado = lado;
        this.altura = altura;
    }

    public double calculaArea(){
        return lado * altura;
    }

    public double calculaPerimetro(){
        return 2 * (lado + altura);
    }

    public float getLado(){
        return lado;
    }

    public void setLado(float lado){
        this.lado = lado;
    }

    public float getAltura(){
        return altura;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public String toString(){
        return "Retângulo de lado " + lado + "cm e altura " + altura + "cm\nÁrea: " + calculaArea() + "cm²\nPerímetro: " + calculaPerimetro() + "cm";
    }

}
