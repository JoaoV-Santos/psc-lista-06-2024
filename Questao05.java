import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numeros = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira o número " + (i+1) + ": ");
            numeros[i] = in.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0)
                pares[i] = numeros[i];
            else
                impares[i] = numeros[i];
        }
        System.out.print("\nNúmeros Pares: ");
        for (int p : pares)
            System.out.print(p + " ");

        System.out.print("\nNúmeros Ímpares: ");
        for (int i : impares)
            System.out.print(i + " ");

        in.close();
    }
}
