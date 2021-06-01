package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner  s= new Scanner(System.in);
        System.out.println("input quantity of floors");
        int floor = s.nextInt();
        if (floor<=4 && floor>0) {
            System.out.println("low-rise building");
        } else if (floor<=9 && floor>4) {
            System.out.println("middle-rise building");
        } else if (floor >9){
            System.out.println("high-rise building");
        } else {
            System.out.println("error, perhaps you entered wrong number");
        }
    }
}
