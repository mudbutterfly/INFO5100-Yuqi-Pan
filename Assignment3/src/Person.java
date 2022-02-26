import java.util.ArrayList;
import java.util.List;

public class Person {
    private List<SeattlePoliceDepartment> subs = new ArrayList<>();
    private String name;
    private Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void subscribe(SeattlePoliceDepartment spd) {
        subs.add(spd);
    }

    public void unSubscribe(SeattlePoliceDepartment spd) {
        subs.remove(spd);
    }

    public void getNotification(SeattlePoliceDepartment spd, String str) {
        for (SeattlePoliceDepartment sub : subs) {
            sub.notifyCitizens(str);
        }
    }
}
