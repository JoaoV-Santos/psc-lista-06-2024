import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[] numeros = new double[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira o número " + (i+1) + ": ");
            numeros[i] = in.nextDouble();
        }

        for (int n = numeros.length; n > 0; n--) {
            System.out.println(numeros[n-1]);
        }




        in.close();
    }
}
