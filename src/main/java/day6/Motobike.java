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
        System.out.println("this is " + this.getClass().getName());
    }

    public int yearDifference(int inputYear) {
        if (inputYear > yearOfIssue) {
            return (inputYear - yearOfIssue);
        } else {
            System.out.println("input tear is less then year of issue");
            return 0;
        }

    }
}
