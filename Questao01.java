import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num = new int[5];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Insira o número " + (i+1) + ": ");
            num[i] = in.nextInt();
        }

        System.out.print("\nNúmeros: ");

        for (int numero : num) {
            System.out.print(numero + " ");
        }


        in.close();
    }
}
