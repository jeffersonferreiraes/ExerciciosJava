package entities;

public class ImportedProduct extends Product{

    private Double customsFee;

    public ImportedProduct(){

    }

    public ImportedProduct(Double customsFee) {
        this.customsFee = customsFee;
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice(){
        return customsFee + getPrice();
    }

    @Override
    public String priceTag() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.priceTag());
        sb.append(" Total price: ")
                .append(String.format("%.2f", totalPrice()))
                .append(" | Customs fee: $")
                .append(customsFee);
    return sb.toString();
    }
}
