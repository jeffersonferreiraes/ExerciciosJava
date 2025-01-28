package application;

import jdk.jshell.execution.Util;
import util.PrimoUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inicio: ");
        int inicio = sc.nextInt();

        System.out.print("Fim: ");
        int fim = sc.nextInt();

        for (int i = inicio; i <= fim; i++){
            if(PrimoUtil.isPrimo(i)){
                System.out.println(i);
            }
        }
    }
}
