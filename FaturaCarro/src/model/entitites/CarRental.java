package model.entitites;


import model.exception.InvalidateDate;

import java.time.LocalDateTime;

public class CarRental {

    private LocalDateTime start;
    private LocalDateTime finish;

    private Invoice invoice;
    private Vehicle vehicle;

    public CarRental(){

    }

    public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle) throws IllegalAccessException, InvalidateDate {
        if (finish.isBefore(start) || finish.equals(start)){
            throw new InvalidateDate("Data de return nao pode ser menor que a de entrega");
        }


        this.start = start;
        this.finish = finish;
        this.vehicle = vehicle;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }



}
