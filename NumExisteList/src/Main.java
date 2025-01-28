import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(4);

        boolean encontrado = false;

        while (!encontrado) {

            System.out.println("Digite o numero que gostaria de encontrar");
            int x = sc.nextInt();

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == x) {
                    encontrado = true;
                    System.out.println("Encontrado");
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("Não encontrado");
            }
        }

        sc.close();
    }
}
