package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer month){

        Double basicQuota = contract.getTotalValue()/month;

        for (int i = 1; i <= month; i ++){

            LocalDate dueDate = contract.getDateContract().plusMonths(i);

            Double interest = onlinePaymentService.Interest(basicQuota, i);
            Double fee = onlinePaymentService.PaymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;

            contract.getInstallments().add(new Installment(dueDate, quota));
        }
    }

}
