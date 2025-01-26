import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        int positionMaiorValor = 0;
        double maiorValor = vect[0];
        for (int i = 0; i < n; i ++){
            if (vect[i] > maiorValor){
                maiorValor = vect[i];
                positionMaiorValor = i;
            }
        }

        System.out.println();
        System.out.println("MAIOR VALOR: " + String.format("%.2f", maiorValor));
        System.out.println("POSIÇÃO MAIOR VALOR: " + positionMaiorValor);

    }
}