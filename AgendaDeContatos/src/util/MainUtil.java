package util;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class MainUtil {

    public static void quickSort(List<Map.Entry<String, Long>> list, int low, int high) {
        if (low < high) {
            // Particiona o array e retorna o índice do pivô
            int pi = partition(list, low, high);

            // Ordena as duas metades
            quickSort(list, low, pi - 1);
            quickSort(list, pi + 1, high);
        }
    }

    // Função de particionamento usada no QuickSort
    public static int partition(List<Map.Entry<String, Long>> list, int low, int high) {
        Map.Entry<String, Long> pivot = list.get(high); // Pivô é o último elemento
        int i = (low - 1); // Índice do menor elemento
        for (int j = low; j < high; j++) {
            // Se o nome (chave) for menor que o pivô
            if (list.get(j).getKey().compareTo(pivot.getKey()) < 0) {
                i++;
                // Troca os elementos
                Collections.swap(list, i, j);
            }
        }

        // Troca o pivô com o elemento na posição correta
        Collections.swap(list, i + 1, high);
        return i + 1;
    }
}


