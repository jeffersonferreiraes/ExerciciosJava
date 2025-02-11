package entities;

public class Fisica extends Pessoa{

    private double gastoSaude;

    public Fisica(){

    }

    public Fisica(double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    public Fisica(String name, double rendaAnual, double gastoSaude) {
        super(name, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    public double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public double ImpostoPago() {
        double imposto = 0;

        if (getRendaAnual() < 20000) {
            imposto = 0.15 * getRendaAnual();
        } else {
            imposto = 0.25 * getRendaAnual();
        }
        if (getGastoSaude() > 0){
            imposto -= (getGastoSaude() * 0.5);
            if (imposto < 0.0){
                return 0.0;
            }
        }
        return imposto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ")
                .append(getName())
                .append(", Imposto: ")
                .append(String.format("%.2f", ImpostoPago()));
        return sb.toString();
    }



}
