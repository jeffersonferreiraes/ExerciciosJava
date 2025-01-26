import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qunatos valores vai ter cada vetor? ");
        int n = sc.nextInt();
        double[] vectA = new double[n];
        double[] vectB = new double[n];
        double[] vectResul = new double[n];

        System.out.println("DIgite os valores do vetor A: ");
        for (int i = 0; i < n; i++){
            vectA[i] = sc.nextDouble();
        }
        System.out.println("DIgite os valores do vetor B: ");
        for (int i = 0; i < n; i++){
            vectB[i] = sc.nextDouble();
        }
        System.out.println("VALOR RESULTANTE: ");
        for (int i = 0; i < n; i++){
            vectResul[i] = vectA[i] + vectB[i];
            System.out.println(vectResul[i]);
        }



        sc.close();
    }
}