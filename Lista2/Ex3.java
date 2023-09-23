package Lista2;

public class Ex3 {
    private int l1;
    private int l2;
    private int l3;

    public Ex3() {
        this.l1 = 1;
        this.l2 = 1;
        this.l3 = 1;
    }

    public Ex3(int l1, int l2, int l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public int getL1() {
        return this.l1;
    }

    public int getL2() {
        return this.l2;
    }

    public int getL3() {
        return this.l3;
    }

    public void setL1(int l1) {
        this.l1 = l1;
    }

    public void setL2(int l2) {
        this.l2 = l2;
    }

    public void setL3(int l3) {
        this.l3 = l3;
    }

    public boolean isTriangulo() {
        if (this.l1 < this.l2 + this.l3 && this.l2 < this.l1 + this.l3 && this.l3 < this.l1 + this.l2) {
            return true;
        } else {
            return false;
        }
    }

    public String tipoTriangulo() {
        if (this.isTriangulo()) {
            if (this.l1 == this.l2 && this.l2 == this.l3) {
                return "Equilátero";
            } else if (this.l1 == this.l2 || this.l1 == this.l3 || this.l2 == this.l3) {
                return "Isósceles";
            } else {
                return "Escaleno";
            }
        } else {
            return "Não é um triângulo";
        }
    }

    public String toString() {
        return "Lado 1: " + this.l1 + "\nLado 2: " + this.l2 + "\nLado 3: " + this.l3 + "\nTipo de triângulo: " + this.tipoTriangulo() + "\n";
    }
    
}
