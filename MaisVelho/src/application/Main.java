package application;

import enitities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int n = sc.nextInt();
        Pessoa[] pessoa = new Pessoa[n];

        for (int i = 0; i < n; i++){
            System.out.println("Dados da " + (i+1) + "ª pessoa: ");
            System.out.print("Nome: ");
            String name = sc.next();
            System.out.print("Idade: ");
            int idade = sc.nextInt();

            pessoa[i] = new Pessoa(name, idade);
        }

        Pessoa maisVelha = pessoa[0];
        for(int i = 0; i < n; i++){
            if (pessoa[i].getIdade() > maisVelha.getIdade()) {
                maisVelha = pessoa[i];
            }
        }
        System.out.println("MAIS VELHO: " + maisVelha.getName());

        sc.close();
    }
}