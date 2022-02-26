import java.nio.channels.Channel;

public class SeattlePoliceDepartment {
    private String location;

    public SeattlePoliceDepartment() {
    }

    public SeattlePoliceDepartment(String location) {
        this.location = location;
    }

    public void notifyCitizens(String str) {
        System.out.println("ALERT: " + str);
    }
}
