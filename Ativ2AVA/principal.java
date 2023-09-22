package Ativ2AVA;

public class principal {
    public static void main(String[] args) {
        Conta conta1 = new Conta(1, "João", 1, 1000, 1000);
        Conta conta2 = new Conta(2, "Maria", 2, 1000, 1000);
        conta1.sacar(2000);
        conta1.sacar(500);
        conta1.depositar(1000);
        conta1.transferir(500, conta2);
        conta1.transferir(5000, conta2);
        conta2.sacar(2000);
        conta2.sacar(500);
        conta2.depositar(1000);
        conta2.transferir(500, conta1);
        conta2.transferir(5000, conta1);
        System.out.println(conta1);
        System.out.println(conta2);

    }
}
