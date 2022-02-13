package Assignment2;

import java.util.Comparator;
import java.util.stream.Collector;

public class PlayerSort implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        if (o1.score < o2.score) {
            return 1;
        } else if (o1.score > o2.score) {
            return -1;
        } else {
            return o1.name.compareTo(o2.name);
        }
    }
}
