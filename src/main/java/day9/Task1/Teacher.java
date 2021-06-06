package day9.Task1;

public class Teacher extends Human {
    private String subjName;

    public Teacher(String name, String subjName) {
        super(name);
        this.subjName = subjName;
    }

    public String getSubjName() {
        return subjName;
    }

    @Override
    public void printInfo() {
        System.out.println("this is a teacher with name " + super.getName());
        super.printInfo();
    }
}
