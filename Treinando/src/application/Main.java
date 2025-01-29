package application;

import Util.MainUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        System.out.print("Quantos numeros? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i ++){
            System.out.print("NUMERO " + (i + 1) + ": ");
            list.add(sc.nextInt());
        }

        List<Integer> sortedList = MainUtil.ordenacaoPorSelecao(list);

        System.out.println(sortedList);

    }
}
