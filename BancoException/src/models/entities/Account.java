package models.entities;

import models.exception.DomainException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {

    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) throws DomainException {
        if (withdrawLimit <= 0){
            throw new DomainException("O limite deve ser maior que zero");
        }

        if (balance == null || balance < 0) {
            throw new DomainException("O saldo inicial deve ser válido (0 ou maior)");
        }

        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) throws DomainException {
        if (withdrawLimit == null || withdrawLimit <= 0) {
            throw new DomainException("O limite deve ser maior que zero.");
        }
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) throws DomainException{

        if (amount == null || amount <= 0){
            throw new DomainException("O valor de deposito deve ser valido");
        }
        balance += amount;
    }

    public void withdraw(Double amount) throws DomainException {
        if (amount == null || amount <= 0) {
            throw new DomainException("O valor de saque deve ser válido e maior que zero");
        }

        if (amount > withdrawLimit){
            throw new DomainException("Saque ultrapassa limite");
        }
        if (amount > balance) {
            throw new DomainException("Não há saldo suficiente para sacar");
        }

        balance -= amount;
    }

}
