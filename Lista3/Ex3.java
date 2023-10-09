package Lista3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner rc = new Scanner(System.in);
        String str = rc.nextLine();
        rc.close();
        System.out.println("A String tem "+str.length()+" caracteres");
        int palavras = 1;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                palavras++;
            }
        }
        System.out.println("A String tem "+palavras+" palavras");
    }
}
