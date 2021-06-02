package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.info();
        Motobike bike = new Motobike(1999, "Red", "Honda V4");
        bike.info();
        System.out.println("difference " + bike.yearDifference(2021));
    }
}
