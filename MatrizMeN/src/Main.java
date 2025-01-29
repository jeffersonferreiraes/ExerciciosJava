import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o tamanho da matriz? ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        for (int i = 0; i < mat.length; i ++ ){
            for (int j = 0; j < mat[i].length; j ++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Qual o numero x? ");
        int x = sc.nextInt();
        for (int i = 0; i < mat.length; i ++ ){
            for (int j = 0; j < mat[i].length; j ++) {
                if (mat[i][j] == x) {
                    if (j < n - 1) {
                        System.out.println("DIREITA: " + mat[i][j + 1]);
                    }
                    if (i < m - 1) {
                        System.out.println("BAIXO: " + mat[i + 1][j]);
                    }
                    if (j > 0) {
                        System.out.println("ESQUERDA: " + mat[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("CIMA: " + mat[i - 1][j]);
                    }
                }
            }
        }



        sc.close();
    }
}