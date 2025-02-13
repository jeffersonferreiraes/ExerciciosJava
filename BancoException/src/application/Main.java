package application;

import models.entities.Account;
import models.exception.DomainException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Enter account data: ");
            System.out.print("Number: ");
            Integer number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            Double balance = sc.nextDouble();
            sc.nextLine();
            System.out.print("Withdraw limit: ");
            Double withdrawLimit = sc.nextDouble();
            sc.nextLine();
            Account account = new Account(number, holder, balance, withdrawLimit);

            System.out.print("Enter amount for deposit: ");
            Double deposit = sc.nextDouble();
            System.out.println();
            sc.nextLine();
            account.deposit(deposit);
            System.out.println("New Balance: " + account.getBalance());

        } catch (DomainException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Certifique-se de inserir um valor correto.");
        }



        sc.close();
    }
}