package models.services;

import models.entities.CarRental;
import models.entities.Invoice;

import java.time.Duration;

public class RentalServices {

    private Double pricePerHour;
    private Double pricePerDay;

    private BrazilTaxService taxService;

    public RentalServices(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){
        double durationMinutes = Math.ceil(Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes()/60.00);

        double basicPayment;
        if (durationMinutes <= 12){
            basicPayment = pricePerHour * durationMinutes;
        }
        else {
            basicPayment = pricePerDay * Math.ceil(durationMinutes/24);
        }

        double tax = taxService.tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment, tax));

    }

}
