package application;

import entities.Estudantes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Estudantes[] vect = new Estudantes[10];

        System.out.println("========ALUGUEL DE QUARTOS========");
        System.out.println("===============CADASTRO===========");
        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Rent #" + (i + 1));
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();
            while (vect[roomNumber] != null) {
                System.out.println("Quarto ocupado, escolha outro: ");
                System.out.println("Quartos vazios: ");
                for (int j = 0; j < vect.length; j++) {
                    if (vect[j] == null) {
                        System.out.print(" | " + j);
                    }
                }
                roomNumber = sc.nextInt();
            }

            vect[roomNumber] = new Estudantes(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        Estudantes quartosDisponiveis;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }
        System.out.println("QUARTOS DISPONIVEIS");
        for (int i = 0; i < vect.length; i ++){
            if (vect[i] == null) {
                System.out.print(" | " + i);
            }
        }

        sc.close();
    }
}
