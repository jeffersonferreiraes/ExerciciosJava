package application;

import entities.Retangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle widht and height");
        double widht = sc.nextDouble();
        double height = sc.nextDouble();

        Retangle retangle = new Retangle(widht, height);

        System.out.println("AREA = " + retangle.Area());
        System.out.println("PERIMETER = " + retangle.Perimeter());
        System.out.println("DIAGONAL = " + retangle.Diagonal());


        sc.close();
    }
}