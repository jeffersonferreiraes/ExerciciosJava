package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;
    private Client client;

    List<OrderItem> orderItems = new ArrayList<>();

    public Order(){

    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void addItem(OrderItem item){
        orderItems.add(item);
    }

    public void removeItem(OrderItem item){
        orderItems.remove(item);
    }

    public Double total(){
        Double sum = 0.0;
        for (OrderItem c : orderItems){
            sum += c.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY: \n");
        sb.append("Order moment: " + sdf.format(moment) + "\n");
        sb.append("Order status: " + status + "\n");
        sb.append("Client: " + client + "\n");
        sb.append("Order items: \n");
        for (OrderItem c : orderItems){
            sb.append(c.getProduct().getName() + ", " + "$" + String.format("%.2f", c.getPrice())  + ", Quantity: " + c.getQuantity() + ", Subtotal: $" + String.format("%.2f", c.subTotal()) + "\n");
        }
        sb.append("Total: $" + String.format("%.2f", total()));
        return sb.toString();
    }
}
