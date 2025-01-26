package application;

import entities.Pessoas;
import entities.enums.Genero;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        Pessoas[] pessoas = new Pessoas[n];
        int countM = 0;
        int counF = 0;
        double sumMulheres = 0;


        for (int i = 0; i < n; i++) {
            System.out.print("Altura da " + (i+1) + "ª pessoa: ");
            double height = sc.nextDouble();
            System.out.print("Genero da " + (i+1) + "ª pessoa: ");
            Genero genero = Genero.valueOf(sc.next().toUpperCase());

            pessoas[i] = new Pessoas(height, genero);

            if(genero == genero.M){
                countM++;
            } else if (genero == genero.F) {
                sumMulheres += pessoas[i].getHeight();
                counF ++;
            }

        }

        Pessoas maior = pessoas[0];
        for (int i = 0; i < n; i ++){
            if (pessoas[i].getHeight() > maior.getHeight() ){
                maior = pessoas[i];
            }
        }
        System.out.println("MAIOR ALTURA: " + maior.getHeight());

        Pessoas menor = pessoas[0];
        for (int i = 0; i < n; i ++){
            if (pessoas[i].getHeight() < menor.getHeight()){
                menor = pessoas[i];
            }
        }
        System.out.println("MENOR ALTURA: " + menor.getHeight());
        double mediaMulhers = sumMulheres/counF;
        System.out.println("MEDIA DE ALUTURA DAS MULHERES: = " + String.format("%.2f", mediaMulhers));
        System.out.println("NUMERO DE HOMENS: " + countM);
        sc.close();
    }
}