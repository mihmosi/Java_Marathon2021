package day4;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix = new int[12][8];
        int[] sum = new int[12];
        int index = 0;
        int max = 0;
        for (int m = 0; m < 12; m++) {
            for (int n = 0; n < 8; n++) {
                matrix[m][n] = (int) (50 * Math.random());
                System.out.printf("%4d ", matrix[m][n]);
                sum[m] += matrix[m][n];
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(sum));
        for (int row = 0; row < sum.length; row++) {
            if (  max < sum[row]) {
                max = sum[row];
                index = row;
            }
        }
        System.out.println("the row with max sum = " + index);
    }
}
