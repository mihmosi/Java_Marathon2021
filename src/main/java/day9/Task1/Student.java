package day9.Task1;

public class Student extends Human {
    private String groupName;

    public Student(String name) {
        super(name);
    }

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    @Override
    public void printInfo() {
        System.out.println("this is a student with name " + super.getName());
        super.printInfo();
    }

    public String getGroupName() {
        return groupName;
    }
}
