package day6;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {
        int markNumber = (int) (5 - 3 * Math.random());
        String mark;

        switch (markNumber) {
            case 2:
                mark = "unsatisfied";
                break;
            case 3:
                mark = "satisfied";
                break;
            case 4:
                mark = "good";
                break;
            case 5:
                mark = "excelent";
                break;
            default: mark = "unknown mark";//this will never happened
        }
        System.out.println("The teacher " + name + " evaluated student " + student.getName() + " with mark " + mark);
    }
}
