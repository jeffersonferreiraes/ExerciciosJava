package Util;
import java.util.ArrayList;
import java.util.List;


public class MainUtil {

    public static int buscaMenor(List<Integer> list) {
        int menor = list.get(0);
        int menorIndice = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < menor) {
                menor = list.get(i);
                menorIndice = i;
            }
        }
        return menorIndice;
    }

    public static List<Integer> ordenacaoPorSelecao(List<Integer> list) {

        List<Integer> newList = new ArrayList<>();
        while(!list.isEmpty()){
           int menor = buscaMenor(list);
           newList.add(list.remove(menor));
        }
        return newList;
    }
}
