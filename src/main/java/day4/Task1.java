package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("input the length of the array");
        int length = s.nextInt();
        int[] x = new int[length];
        int moreThen8 = 0;
        int equalOne = 0;
        int oddNumber = 0;
        int evenNumber = 0;
        int sum = 0;

        for (int i = 0; i < length; i++) {
            x[i] = (int) (10 * Math.random());
            if (x[i] > 8) {
                moreThen8++;
            }
            if (x[i] == 1) {
                equalOne++;
            }
            if (x[i] % 2 == 0 && x[i] != 0) {
                evenNumber++;
            } else {
                oddNumber++;
            }
            sum += x[i];
        }

        System.out.println(Arrays.toString(x));
        System.out.println("length of the array = " + x.length);
        System.out.println("numbers grater then 8: " + moreThen8);
        System.out.println("number of element equal 1: " + equalOne);
        System.out.println("quantity of odd numbers: " + oddNumber);
        System.out.println("quantity of even numbers: " + evenNumber);
        System.out.println("sum = " + sum);
    }
}
