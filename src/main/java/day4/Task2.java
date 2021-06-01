package day4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] x = new int[100];
        int max = 0;
        int min = 10001;
        int sumWithZeroAtEnd = 0;
        int qtyWithZeroAtEnd = 0;

        for (int i = 0; i < 100; i++) {
            x[i] = (int) (10000 * Math.random());
        }

        System.out.println(Arrays.toString(x));

        for (int i : x) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
            if (i % 10 == 0) {
                sumWithZeroAtEnd += i;
                qtyWithZeroAtEnd++;
            }
        }

        System.out.println("max= " + max);
        System.out.println("min= " + min);
        System.out.println("qty of the elements with 0 ath the end= " + qtyWithZeroAtEnd);
        System.out.println("sum of elements with 0 ath the end= " + sumWithZeroAtEnd);
    }
}
