package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double dividend = 0.1;
        double divisor = 0.1;
        while (divisor != 0) {
            System.out.println("input dividend:");
            dividend = s.nextDouble();
            System.out.println("input divisor:");
            divisor = s.nextDouble();
            if (divisor == 0) {
                System.out.println("run program is finished");
                break;
            }
            System.out.println(dividend + " / " + divisor + " = " + dividend / divisor);

        }

    }
}
