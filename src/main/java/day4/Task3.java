package day4;

import java.text.DecimalFormat;
import java.util.Arrays;
/*3. Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
Размер матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
В консоль вывести индекс строки, сумма чисел в которой максимальна.
Если таких строк несколько, вывести индекс последней из них.*/

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix = new int[12][8];
        int sum = Integer.MIN_VALUE;
        int index = 0; //index cant be less 0
        int max = Integer.MIN_VALUE;
        for (int m = 0; m < matrix.length; m++) {
            for (int n = 0; n < matrix[0].length; n++) {
                matrix[m][n] = (int) (50 * Math.random());
                System.out.printf("%4d ", matrix[m][n]);
                sum += matrix[m][n];
            }
            System.out.println();
            if (max < sum) {
                index = m;
                max = sum;
            }
            sum = 0;
        }

        System.out.println("the row with max sum = " + index);
    }
}
