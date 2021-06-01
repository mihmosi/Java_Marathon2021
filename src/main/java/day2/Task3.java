package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("input first number:");
        int a = s.nextInt();
        System.out.println("imput second number:");
        int b = s.nextInt();
        if (a > b) {
            System.out.println("wrong input. second number must be greater then first one");
        } else {
            int i = a;
            while (i < b) {
                if (i % 5 == 0 && i % 10 != 0 && i != a && i != b) {
                    System.out.print(i + " ");
                }
                i++;
            }
        }
    }
}
