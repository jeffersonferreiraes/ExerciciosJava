package application;

import model.entitites.CarRental;
import model.entitites.Vehicle;
import model.exception.InvalidateDate;
import model.service.BrazilTaxService;
import model.service.RentalService;
import model.util.Util;

import java.io.File;
import java.io.IOException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import static model.util.Util.dates;
import static model.util.Util.validarDatas;

public class Main {
    public static void main(String[] args) throws InvalidateDate {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        try {
            System.out.println("Enter rental data");

            System.out.print("Car model: ");
            String carModel = sc.nextLine();

            System.out.print("Pickup ");
            LocalDateTime start;
            start = dates(sc, fmt);

            LocalDateTime finish = null;
            while (finish == null) {
                try {
                    System.out.print("Return ");
                    finish = dates(sc, fmt);
                    validarDatas(start, finish);
                } catch (InvalidateDate e) {
                    System.out.println("Erro: " + e.getMessage() + " Tente novamente.");
                    finish = null; // Resetando a data para repetir o loop
                }
            }


            CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));

            Double pricePerHour = Util.price(sc, "Price per hour: ");
            Double pricePerDay = Util.price(sc, "Price per day: ");


            RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
            rentalService.processInvoice(carRental);

            System.out.println();
            System.out.println("FATURA:");
            System.out.println("Pagamento básico: " + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
            System.out.println("Imposto: " + String.format("%.2f", carRental.getInvoice().getTax()));
            System.out.println("Pagamento total: " + String.format("%.2f", carRental.getInvoice().getTotalPayment()));

            String caminho = System.getProperty("user.home") + File.separator + "Documents" + File.separator + "NotasFiscais";
            Util.gerarNota(carRental.getInvoice().getBasicPayment(), carRental.getInvoice().getTax(), carRental.getInvoice().getTotalPayment(),caminho);
            System.out.println("NOTA FISCAL GERADA COM SUCESSO");

        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
        } finally {
            sc.close();
        }
    }
}
