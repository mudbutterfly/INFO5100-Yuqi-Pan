public class Professor extends Person{
    public Professor(String name, int age, int id) {
        super(name, age, id);
    }

    public void giveQuiz(String name) {
        System.out.println("I am professor" + name +  ", here is the quiz");
    }
}
