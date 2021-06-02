package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("input dividend:");
            double dividend = s.nextDouble();
            System.out.println("input divisor:");
            double divisor = s.nextDouble();
            if (divisor == 0) {
                System.out.println("run program is finished");
                break;
            }
            System.out.println(dividend + " / " + divisor + " = " + dividend / divisor);
        }
    }


}
