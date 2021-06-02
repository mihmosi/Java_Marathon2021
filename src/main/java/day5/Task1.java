package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Green");
        car.setModel("Ford Mustang");
        car.setYearOfIssue(1985);

        System.out.println("I have  " + car.getColor() + " " +
                car.getModel() + " " + car.getYearOfIssue() + " year of issue");
    }
}
