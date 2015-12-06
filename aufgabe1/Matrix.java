package aufgabe1;

import java.util.Scanner;

/**
 * Created by Nils on 08.12.2014.
 */
public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = matrixErzeugen(sc.nextInt(), sc.nextInt());
        int faktor = sc.nextInt();
        int[][] multiplizierteMatrix = matrixKopierenMitMultiplizieren(matrix, faktor);

        System.out.println("Matrix:");
        ausgabeMatrix(matrix);
        System.out.println("Faktor:");
        System.out.println(faktor);
        System.out.println("Matrix x Faktor: ");
        ausgabeMatrix(multiplizierteMatrix);
    }

    private static int[][] matrixErzeugen(int n, int m) {
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = i + j + 1;
            }
        }
        return matrix;
    }

    private static int[][] matrixKopierenMitMultiplizieren(int[][] a, int b) {
        int[][] matrix = new int[a.length][a[0].length];
        //int[][] matrix = a.clone();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = a[i][j] * b;
            }
        }
        return matrix;
    }

    private static void ausgabeMatrix(int[][] a) {
        for (int[] b : a) {
            for (int c : b) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
