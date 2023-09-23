package Lista2;

public class Ex3principal {
    public static void main(String[] args) {
        Ex3 triangulo1 = new Ex3();
        Ex3 triangulo2 = new Ex3(2, 3, 2);
        System.out.println(triangulo1);
        System.out.println(triangulo2);
        triangulo1.setL1(3);
        triangulo1.setL2(4);
        triangulo1.setL3(5);
        System.out.println(triangulo1);
    }
}
