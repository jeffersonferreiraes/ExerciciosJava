package entities;

public class Juridica extends Pessoa{

    private Integer numFunc;

    public Juridica(){

    }

    public Juridica(Integer numFunc) {
        this.numFunc = numFunc;
    }

    public Juridica(String name, double rendaAnual, Integer numFunc) {
        super(name, rendaAnual);
        this.numFunc = numFunc;
    }

    public Integer getNumFunc() {
        return numFunc;
    }

    public void setNumFunc(Integer numFunc) {
        this.numFunc = numFunc;
    }

    @Override
    public double ImpostoPago() {
        double imposto = 0.16 * getRendaAnual();

        if (numFunc > 10){
            imposto = 0.14 * getRendaAnual();
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
