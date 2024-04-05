import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numeros = new int[20];
        int[] pares = new int[20];
        int[] impares;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira o número " + (i+1) + ": ");
            numeros[i] = in.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0)
                pares[i] = numeros[i];
        }

        for (int p : pares)
            System.out.println(p);

        in.close();
    }
}
