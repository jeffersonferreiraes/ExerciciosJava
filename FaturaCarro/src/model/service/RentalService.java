package model.service;

import model.entitites.CarRental;
import model.entitites.Invoice;

import java.time.Duration;

public class RentalService {

    private Double pricePerDay;
    private Double pricePerHour;

    private TaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){

        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes/60.00;

        double basicPayment;
        if (hours <= 12.00){
            basicPayment = pricePerHour * Math.ceil(hours);
        }
        else {
            basicPayment = pricePerDay * Math.ceil(hours / 24.00);
        }

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment,tax));

    }

}
