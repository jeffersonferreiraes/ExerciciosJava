import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Product name: ");
        String name = sc.nextLine();
        System.out.print("Price Product: ");
        Double price = sc.nextDouble();
        System.out.print("Quantity: ");
        Integer quantity = sc.nextInt();
        sc.nextLine();
        Product product = new Product(name, price, quantity);

        System.out.print("Add product: ");
        int productAdd = sc.nextInt();
        sc.nextLine();
        product.addProduct(productAdd);
        System.out.println("Total no estoque = " + product.getQuantity());
        System.out.println("Total value in stock = " + product.TotalValueStock());

        System.out.println();

        System.out.print("Remove product: ");
        int productRemove = sc.nextInt();
        sc.nextLine();
        product.removeProducts(productRemove);
        System.out.println("Total no estoque = " + product.getQuantity());
        System.out.println("Total value in stock = " + product.TotalValueStock());

        System.out.println(product);



        sc.close();
    }
}