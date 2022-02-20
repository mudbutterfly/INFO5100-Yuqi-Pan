public class Student extends Person{

    public Student(String name, int age, int id) {
        super(name, age, id);
    }

    public void takeQuiz(String name) {
        System.out.println("I am student" + name + ", I have to take quiz");

    }
}


