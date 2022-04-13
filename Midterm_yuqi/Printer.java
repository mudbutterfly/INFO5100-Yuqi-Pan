public class Printer {
    private Printer() {
    }

    public void getConnection() {
        System.out.println("Your Printer is working");
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    private static Printer instance;
    private static Object obj = new Object();
    private String connection = "";

    public static Printer getInstance() {
        if (instance == null) {
            synchronized (obj) {
                if (instance == null) {
                    instance = new Printer();
                }
            }
        }
        return instance;
    }

}

class Main3 {
    public static void main(String[] args) {
       Printer p1;
       p1 = Printer.getInstance();
       p1.getConnection();
    }
}

