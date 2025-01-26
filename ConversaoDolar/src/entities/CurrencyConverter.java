package entities;

import util.Dolar;

public class CurrencyConverter {

    private double quantDoll;

    public CurrencyConverter(){

    }

    public CurrencyConverter(double quantDoll) {
        this.quantDoll = quantDoll;
    }

    public double getQuantDoll() {
        return quantDoll;
    }

    public void setQuantDoll(double quantDoll) {
        this.quantDoll = quantDoll;
    }

    public double Amount(){
        return (Dolar.IOF * (Dolar.VALOR_DOLAR * getQuantDoll())) + Dolar.VALOR_DOLAR * getQuantDoll();
    }

    @Override
    public String toString() {
        return "Amount " +
                String.format("%.2f", Amount());
    }
}
