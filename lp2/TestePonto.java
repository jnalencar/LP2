

public class TestePonto {
    public static void main(String[] args) {
        Ponto p1, p2;
        p1 = new Ponto(1, 8);
        p2 = new Ponto(1, 6);
        System.out.println(p1);
        System.out.println(p2);

        if (p1.eIgual(p2)) {
            System.out.println("Pontos iguais");
        } else {
            System.out.println("Pontos diferentes");
        }

    }
}
