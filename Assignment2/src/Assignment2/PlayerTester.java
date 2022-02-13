package Assignment2;
import Assignment2.Player;

import java.util.Arrays;


public class PlayerTester {
    public static void main(String[] args) {

        Player[] player = new Player[6];

        player[0] = new Player("Celia", 9);
        player[1] = new Player("Bob", 10);
        player[2] = new Player("Json", 7);
        player[3] = new Player("Jeferry", 1);
        player[4] = new Player("Ason", 1);
        player[5] = new Player("Alex", 8);

        Arrays.sort(player,new PlayerSort());

        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
