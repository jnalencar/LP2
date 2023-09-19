package Lista2;

public class main {
    public static void main(String[] args) {
        Ex1 circulo1 = new Ex1();
        Ex1 circulo2 = new Ex1(2, "azul");
        System.out.println(circulo1.dadosCirculo());
        System.out.println(circulo2.dadosCirculo());
        circulo2.setRaio(3);
        circulo2.setCor("cinza");
        System.out.println(circulo2.dadosCirculo());
    }
}
