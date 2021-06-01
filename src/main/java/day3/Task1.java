package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String city = "";
        while (!city.equals("stop")) {
            System.out.println("input city");
            city = s.nextLine();

            switch (city) {
                case "Moscow":
                case "Vladivostok":
                case "Rostov":
                    System.out.println("Russia");
                    break;
                case "Roma":
                case "Milano":
                case "Turin":
                    System.out.println("Italy");
                    break;
                case "Liverpool":
                case "Manchester":
                case "London":
                    System.out.println("England");
                    break;
                case "Berlin":
                case "Munich":
                case "Keln":
                    System.out.println("Germany");
                    break;
                case "stop": break;
                default:
                    System.out.println("unknown country");
            }

        }
    }
}
