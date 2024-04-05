import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] letras = new char[10];
        char[] consoantes = new char [10];

        System.out.println("Digite abaixo dez letras");

        for (int i = 0; i < letras.length; i++) {
            //System.out.print("Insira o número " + (i+1) + ": ");
            letras[i] = in.next().charAt(0);
        }

        int vogais = 0, consoantesN = 0;

        for (int i = 0; i < letras.length; i++) {
            if (letras[i] != 'a' && letras[i] != 'e' && letras[i] != 'i' && letras[i] != 'o' &&letras[i] != 'u') {
                consoantesN++;
                consoantes[i] = letras[i] ;
            }
        }
        System.out.print("\nForam informadas " + consoantesN + " consoantes.\n");

        for (char letra : consoantes)
            System.out.print(letra + " ");




        in.close();
    }
}
