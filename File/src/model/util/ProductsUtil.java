package model.util;

import model.entities.Products;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductsUtil {
    public static List<Products> readProductsFromFile(String filePath) {

        List<Products> products = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String itemcsv = br.readLine();
            while (itemcsv != null) {
                String[] fields = itemcsv.split(",");
                String name = fields[0];
                Double price = Double.parseDouble(fields[1]);
                Integer quantity = Integer.parseInt(fields[2]);

                products.add(new Products(name, price, quantity));

                itemcsv = br.readLine();
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        return products;
    }

    public static String createOutputDirectory(String sourceFilePath){
        File sourceFile = new File(sourceFilePath);
        String outputDir = sourceFile.getParent() + "\\out";
        boolean isCreated = new File(outputDir).mkdir();
        System.out.println("CREATED " + isCreated);
        return outputDir;
    }

    public static void writedSummaryToFile (List<Products> products, String outFilePath) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outFilePath))) {
            for (Products p : products){
                bw.write(p.getName() + ", " + p.total());
                bw.newLine();
            }
            System.out.println("SUMMARY FILE CREATED: " + outFilePath);
        }
        catch (IOException e){
            System.out.println("Error file: " + e.getMessage());
        }
    }

}
