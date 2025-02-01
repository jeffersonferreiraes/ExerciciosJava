import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );

        System.out.print("Digite uma palavra ou frase para saber se é uma palindroma: ");
        String frase = sc.nextLine();

        frase = frase.replaceAll("[\\W_]", "").toLowerCase();

        String invertida = new StringBuilder(frase).reverse().toString();
        if (frase.equals(invertida)){
            System.out.print("palindroma");
        } else {
            System.out.println("Nao é palindroma");
        }

    }

}