package application;

import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many dollars will be bought? ");
        double quantDOll = sc.nextDouble();
        sc.nextLine();
        CurrencyConverter currencyConverter = new CurrencyConverter(quantDOll);
        currencyConverter.Amount();

        System.out.print(currencyConverter);

    }
}