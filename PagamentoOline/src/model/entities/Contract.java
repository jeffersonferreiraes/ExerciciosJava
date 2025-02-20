package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {

    private Integer number;
    private LocalDate dateContract;
    private Double totalValue;

    List<Installment> installments  = new ArrayList<>();

    public Contract(Integer number, LocalDate dateContract, Double totalValue) {
        this.number = number;
        this.dateContract = dateContract;
        this.totalValue = totalValue;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public LocalDate getDateContract() {
        return dateContract;
    }

    public void setDateContract(LocalDate dateContract) {
        this.dateContract = dateContract;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public List<Installment> getInstallments() {
        return installments;
    }
}
