public class Main {
    public static void main(String[] args) {
        Professor ash = new Professor("ash",80,001);
        Student yuqi = new Student("yuqi", 20, 002);
        Student lala = new Student("lala", 20, 003);
        Student koko = new Student("koko", 18, 004);

        ash.giveQuiz("ash");
        yuqi.takeQuiz("yuqi");
        lala.takeQuiz("lala");
        koko.takeQuiz("koko");

    }
}
