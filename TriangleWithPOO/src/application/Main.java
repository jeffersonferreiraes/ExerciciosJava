package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Triangle x,y;
        x = new Triangle();
        y = new Triangle();
        Double p;

        System.out.println("Enter the measures of Triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of Triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();


        Double areaX = x.area();

        Double areaY = y.area();

        System.out.println("AreaX = " + areaX);
        System.out.println("AreaY = " + areaY);

        if (areaX > areaY){
            System.out.println("AreaX maior");
        } else if (areaX < areaY) {
            System.out.println("AreaY maior");
        } else{
            System.out.println("Equals");
        }

        sc.close();
    }
}