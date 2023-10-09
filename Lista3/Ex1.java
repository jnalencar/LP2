package Lista3;

public class Ex1 {
    public static void main(String[] args) {
        int[] vetor = new int[50];
        for(int i = 101; i < 151; i++) {
            vetor[i-101] = i;
        }
        for(int i = 0; i < 50; i++) {
            System.out.println(vetor[i]);
        }
    }
}
