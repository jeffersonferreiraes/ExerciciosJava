package application;

import entities.Fisica;
import entities.Juridica;
import entities.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Pessoa> pessoa = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++){
            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Fisica ou Juridica? ");
            char option = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Renda anual: ");
            Double rendaAnual = sc.nextDouble();
            sc.nextLine();
            if (option == 'f'){
                System.out.print("Gastos com saude: ");
                Double gastosSaude = sc.nextDouble();
                sc.nextLine();
                pessoa.add(new Fisica(name, rendaAnual, gastosSaude));
            }
            if (option == 'j'){
                System.out.print("Numero de funcionarios: ");
                Integer numFunc = sc.nextInt();
                sc.nextLine();
                pessoa.add(new Juridica(name, rendaAnual, numFunc));
            }
        }
        System.out.println();
        System.out.println("IMPOSTO:");
        Double total = 0.0;
        for (Pessoa p : pessoa){
            System.out.println(p);
            System.out.println("-------------------------------");
            total += p.ImpostoPago();
        }
        System.out.println("Total: " + String.format("%.2f", total));


        sc.close();
    }
}