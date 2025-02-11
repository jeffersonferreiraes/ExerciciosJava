package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProducts;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.print("Commom, used or imported (c/u/i)? ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            Double price = sc.nextDouble();

            if (type == 'i'){
                System.out.print("Customs Fee: ");
                Double customsFee = sc.nextDouble();

                Product importProduct = new ImportedProduct(name, price, customsFee);
                products.add(importProduct);
            }

            else if (type == 'u'){
                System.out.print("Manufactured date: ");
                String date = sc.next();
                Date manufaturedDate = sdf.parse(date);

                Product usedProduct = new UsedProducts(name, price, manufaturedDate);
                products.add(usedProduct);
            }
            else if (type == 'c'){
                Product product = new Product(name, price);
                products.add(product);
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product product : products){
            System.out.println(product.priceTag());
        }


        sc.close();
    }
}