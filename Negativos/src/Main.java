import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt(); //numero de numeros a ser digitado
        int[] vect = new int[n]; //instacia o vetor
        for (int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        } //laço para retornar todos os valores de entrada até i < n


        System.out.println("NUMEROS NEGATIVOS: ");
        for (int i = 0; i < vect.length; i++){
            if (vect[i] < 0){
                System.out.println(vect[i]);
            }
        } //mostra todos os valores negativos na entrada

        sc.close();
    }
}