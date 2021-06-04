package day6;

public class Car {
    private int yearOfIssue;
    private String color;
    private String model;

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    void info() {
        System.out.println("this is Car class");
    }

    public int yearDifference(int inputYear) {
            return Math.abs(yearOfIssue - inputYear);
    }
}
