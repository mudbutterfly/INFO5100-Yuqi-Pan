public class Person {
    private String name;
    private Integer age;
    private String address;

    public Person() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void printPersonInfo(Person person) {
        System.out.println("name: " + person.getName() + " age: " + person.getAge() + " address:" + person.getAddress());
    }

    public void shallowCopy(Person person) {
        Person p = new Person();
        p = person;
        person.printPersonInfo(person);
        person.printPersonInfo(p);
    }

    public void deepCopy(Person person) {
        Person p = new Person();
        p.setName(person.getName());
        p.setAge(person.getAge());
        p.setAddress(person.getAddress());

        person.setName("yuqi");
        person.printPersonInfo(person);
        person.printPersonInfo(p);
    }
}
class Main1{
    public static void main(String[] args) {
        Person kiki = new Person();
        kiki.setName("kiki");
        kiki.setAddress("seattle");
        kiki.setAge(23);
        //the result of shallow copy will change as the original changes
        kiki.shallowCopy(kiki);
        //the result of deep copy will not change as the original has changes in it
        kiki.deepCopy(kiki);
    }
}
