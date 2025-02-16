package application;

import model.entities.Products;
import model.util.ProductsUtil;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter for file path: ");
        String sourceFilePath = sc.nextLine();

        List<Products> products = ProductsUtil.readProductsFromFile(sourceFilePath);

        if (products.isEmpty()) {
            System.out.println("No products found.");
        } else {
            String outputFilePath = ProductsUtil.createOutputDirectory(sourceFilePath) + "\\summary.txt";
            ProductsUtil.writedSummaryToFile(products, outputFilePath);
        }

        sc.close();
    }
}