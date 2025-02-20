package model.services;

public interface OnlinePaymentService {

    Double PaymentFee(Double amount);
    Double Interest(double amount, int months);

}
