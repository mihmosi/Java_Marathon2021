package day5;


public class Task2 {
    public static void main(String[] args) {
        Motobike bike = new Motobike(1999,"Red","Honda V4");
        System.out.println("I have  " + bike.getColor() + " " +
                bike.getModel() + " " +bike.getYearOfIssue() + " year of issue");
    }
}
