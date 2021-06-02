package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYearOfIssue(1997);
        car.info();
        Motobike bike = new Motobike(1999, "Red", "Honda V4");
        bike.info();
        System.out.println("difference " + bike.yearDifference(2021));
        System.out.println("difference " + car.yearDifference(2011));
    }
}
