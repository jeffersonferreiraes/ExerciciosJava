package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProducts extends Product{

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date manufacturedDate;

    public UsedProducts(){

    }

    public UsedProducts(Date manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

    public UsedProducts(String name, Double price, Date manufacturedDate) {
        super(name, price);
        this.manufacturedDate = manufacturedDate;
    }

    public Date getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(Date manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

    @Override
    public String priceTag() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.priceTag())
                .append(" (used) ")
                .append("| Manufactured date: ")
                .append(sdf.format(manufacturedDate));
        return sb.toString();
    }

}
