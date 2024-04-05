import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numeros = new int[5];
        int soma = 0;
        int mult = 1;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Informe o número " + (i+1) + ": ");
            numeros[i] = in.nextInt();
            soma += numeros[i];
            mult *= numeros[i];
        }

        System.out.print("\nNúmeros informados: ");
        for (int num : numeros)
            System.out.print(num + " ");

        System.out.println("\nSoma dos números: " + soma);
        System.out.println("Multiplicação dos números: " + mult);


        in.close();
    }
}
