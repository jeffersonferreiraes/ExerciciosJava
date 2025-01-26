import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        int countPares = 0;
        System.out.println("NUMEROS PARES: ");
        for (int i = 0; i < n; i++) {
            if (vect[i] % 2 == 0 && vect[i] > 0) {
                System.out.print(vect[i] + " ");
                countPares++;
            }
        }

        System.out.println();
        if (countPares == 0) {
            System.out.println("Nenhum numero par encontrado.");
        } else {
            System.out.println();
            System.out.println("QUANTIDADE DE PARES: " + countPares);
        }

        sc.close();
    }
}