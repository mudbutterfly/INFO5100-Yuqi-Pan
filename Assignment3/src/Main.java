public class Main {

    public static void main(String[] args) {
        SeattlePoliceDepartment capitalHill = new SeattlePoliceDepartment("capital hill");
        Person Kiki = new Person("Kiki",16);
        Person Sean = new Person("Sean",17);
        Person Koko = new Person("Koko",200);
        Person Kiko = new Person("Kiko",80);
        Person Noel = new Person("Noel",21);
        Person Elmo = new Person("Emlo",30);

        capitalHill.notifyCitizens("armed robbery");

        Kiki.subscribe(capitalHill);
        Sean.subscribe(capitalHill);
        Koko.subscribe(capitalHill);
        Kiko.subscribe(capitalHill);
        Noel.subscribe(capitalHill);
        Elmo.subscribe(capitalHill);

        Noel.unSubscribe(capitalHill);
        Elmo.unSubscribe(capitalHill);

        Kiki.getNotification(capitalHill,"armed robbery" );
        Sean.getNotification(capitalHill,"several stores been broken in");
    }
}
