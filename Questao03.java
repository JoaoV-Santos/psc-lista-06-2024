import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[] notas = new double[4];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Informe a nota " + (i+1) + ": ");
            notas[i] = in.nextDouble();
        }
        System.out.println("\n");
        int posicao = 1;

        for (double n : notas) {
            System.out.println("Nota " + posicao + ": " + n);
            posicao++;
        }

        double soma = 0;
        for (double n : notas) {
            soma += n;
        }

        System.out.printf("\nMédia do aluno: %.2f" , (soma/ notas.length));


        in.close();
    }
}
