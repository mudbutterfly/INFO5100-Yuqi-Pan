package Assignment2;

public class Main {

    public static void main(String[] args) {
        //Q1
        System.out.println("-----------Q1-----------");
        Student student1 = new Student(101, "ABC");
        System.out.println(" Roll number of the first student: " + student1.printRoll());
        System.out.println(" Name of the first student: "+ student1.printName());

        Student student2 = new Student(student1);
        System.out.println(" Roll number of the second student: "+ student2.printRoll());
        System.out.println(" Name of the second student: "+ student2.printName());

        //Q2
        System.out.println("-----------Q2-----------");
        Triangle congruentTriangle = new Triangle(2);
        congruentTriangle.printShape();
        congruentTriangle.getArea();
        congruentTriangle.getPerimeter();

        Parallelogram parallelogram = new Parallelogram(3,5,4);
        parallelogram.printShape();
        parallelogram.getArea();
        parallelogram.getPerimeter();

        Parallelogram square = new Parallelogram(3);
        square.printShape();
        square.getAreaByOnlyside();
        square.getPerimeter();

    }
}
