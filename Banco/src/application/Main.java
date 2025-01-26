package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char confirmation = sc.next().charAt(0);
        if (confirmation == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(accountNumber, name, initialDeposit);

        } else {
            account = new Account(accountNumber, name);
        }

        System.out.println();

        System.out.println(account);

        System.out.print("Enter deposit value: ");
        double depositValue = sc.nextDouble();
        sc.nextLine();
        account.deposit(depositValue);
        System.out.println(account);

        System.out.println();

        System.out.print("Enter withdraw value: ");
        double withdrawValue = sc.nextDouble();
        sc.nextLine();
        account.withdraw(withdrawValue);
        System.out.println(account);

        sc.close();
    }
}