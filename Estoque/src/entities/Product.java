package entities;

public class Product {

    private String name;
    private Double price;
    private Integer quantity;

    public Product(){

    }

    public Product(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double TotalValueStock(){
        return getPrice() * getQuantity();
    }

    public void addProduct(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return "Product: " +
                "name: "  + name +
                String.format("%.2f", price) +
                ", quantity = " + quantity +
                ", TotalValue = " + TotalValueStock()
                ;
    }
}
