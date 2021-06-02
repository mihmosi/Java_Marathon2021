package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("input first number:");
        int a = s.nextInt();
        System.out.println("imput second number:");
        int b = s.nextInt();
        if (a > b) {
            System.out.println("wrong input. second number must be greater then first one");
        } else {
            for (int i = a + 1; i < b; i++) {
                if (i % 5 == 0 && i % 10 != 0 && i != a) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
