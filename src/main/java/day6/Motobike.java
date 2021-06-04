package day6;

public class Motobike {
    private int yearOfIssue;
    private String color;
    private String model;

    public Motobike(int yearOfIssue, String color, String model) {
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.model = model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    void info() {
        System.out.println("this is Motobike class");
    }

    public int yearDifference(int inputYear) {
        return Math.abs(yearOfIssue-inputYear);
    }
}
