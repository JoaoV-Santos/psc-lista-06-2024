import java.sql.SQLOutput;
import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[] media = new double[3];
        double soma = 0;
        int aprovados = 0;

        for (int i = 0; i < media.length; i++) {
            soma = 0;
            System.out.print("\nAluno " + (i+1) + "\n");

            for (int x = 0; x < 4; x++) {
                System.out.print("Digite a nota " + (x+1) + ": ");
                soma += in.nextDouble();
            }
            media[i] = soma / 4;

            if (media[i] >= 7)
                aprovados++;
        }

        System.out.println("\n" + aprovados + " alunos foram aprovados com nota maior ou igual a 7.");


        in.close();
    }
}
