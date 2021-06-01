package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double dividend = 0.1;
        double divisor = 0.1;
        for (int i = 1; i <= 5; i++) {
            System.out.println("input dividend:");
            dividend = s.nextDouble();
            System.out.println("input divisor:");
            divisor = s.nextDouble();
            if (divisor == 0) {
                System.out.println("division to 0!");
                continue;
            }
            System.out.println(dividend + " / " + divisor + " = " + dividend / divisor);
        }
    }
}
