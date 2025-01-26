package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double sum = 0;

        System.out.print("Quantity itens: ");
        int n = sc.nextInt();
        Product[] product = new Product[n];
        for (int i = 0; i < n; i++){
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            product[i] = new Product(name, price);
            sum += product[i].getPrice();
        }
        System.out.println();
        for (int i = 0; i < n; i ++){
            System.out.println("PRODUCT " + (i+1) + ": " +
                    product[i].getName() + ", " +
                    product[i].getPrice());
        }

        double media = sum/n;
        System.out.println("AVERAGE PRICE: " + media);
        sc.close();

    }
}


/*
Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("Quantity: ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        double media = 0;
        int soma = 0;

        for (int i = 0; i < n; i++){
            vect[i] = sc.nextDouble();

            soma += vect[i];
        }
            media = soma/n;

        System.out.println(media);


        sc.close();
 */