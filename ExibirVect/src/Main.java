import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quanto numeros voce vai digitar: ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        double soma = 0;
        System.out.println();
        System.out.print("VALORES = ");
        for (int i = 0; i < n; i++){
            System.out.print(vect[i] + " ");
            soma += vect[i];
        }
        System.out.println();
        System.out.println("SOMA = " + String.format("%.2f", soma));
        double media = soma/n;
        System.out.println("MEDIA = " + String.format("%.2f", media));


        sc.close();
    }
}