package Assignment2;

public class Student{
    private int rollNumber;
    private String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public Student(Student student) {
        this.rollNumber = student.getRollNumber();
        this.name = student.getName();
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String printName() {
        return getName();
    }
    public int printRoll() {
        return getRollNumber();
    }

}
