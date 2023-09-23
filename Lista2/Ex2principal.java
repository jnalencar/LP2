package Lista2;

public class Ex2principal {
    public static void main(String[] args) {
        Ex2[] jogador = new Ex2[40];
        jogador[0] = new Ex2();
        jogador[1] = new Ex2("Messi", "Atacante", "Argentino", 1.70, 65.5);
        jogador[2] = new Ex2("Cristiano Ronaldo", "Atacante", "Português", 1.85, 80.5);
        System.out.println(jogador[0]);
        System.out.println(jogador[1]);
        System.out.println(jogador[2]);
    }
}
