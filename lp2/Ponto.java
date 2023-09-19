package lp2;

public class Ponto {
    private int x;
    private int y;
    
    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean eIgual(Ponto p) {
        return (this.x == p.x && this.y == p.y);
    }

    public String toString(){
        return "("+this.x+","+this.y+")";
    }
}
