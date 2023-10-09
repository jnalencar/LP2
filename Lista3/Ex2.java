package Lista3;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner rc = new Scanner(System.in);
        String str = rc.nextLine();
        rc.close();
        System.out.println("A string é: " + str);
        System.out.println("O número de caracteres da string é: " + str.length());
        System.out.println("A string com todas suas letras em maiúsculo é: " + str.toUpperCase());
        int vogais = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || 
            str.charAt(i) == 'E' || str.charAt(i) == 'i' || str.charAt(i) == 'I' || 
            str.charAt(i) == 'o' || str.charAt(i) == 'O' || str.charAt(i) == 'u' || 
            str.charAt(i) == 'U') {
                vogais++;
            }
        }
        System.out.println("O número de vogais da string é: " + vogais);
        if(str.charAt(0) == 'a' || str.charAt(0) == 'A') {
            System.out.println("A string começa com 'A'");
        } else {
            System.out.println("A string não começa com 'A'");
        }
        if(str.charAt(str.length()-1) == 'o' || str.charAt(str.length()-1) == 'O') {
            System.out.println("A string termina com 'O'");
        } else {
            System.out.println("A string não termina com 'O'");
        }
        boolean palindromo = true;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                palindromo = false;
            }
        }
        if(palindromo) {
            System.out.println("A string é um palíndromo");
        } else {
            System.out.println("A string não é um palíndromo");
        }
    }
}
