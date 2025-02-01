import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n) {
        double sqrt5 = Math.sqrt(5);
        double phi = (1 + sqrt5) / 2;
        double psi = (1 - sqrt5) / 2;

        return (int) Math.round((Math.pow(phi, n) - Math.pow(psi, n)) / sqrt5);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular o Fibonacci: ");
        int n = scanner.nextInt();

        System.out.println("O " + n + "º termo da sequência de Fibonacci é: " + fibonacci(n));

        scanner.close();
    }
}
