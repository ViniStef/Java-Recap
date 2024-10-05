package academy.devdojo.javaoneforall.javacore.Gassociation.test;

import academy.devdojo.javaoneforall.javacore.Gassociation.domain.Player;
import academy.devdojo.javaoneforall.javacore.Gassociation.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player = new Player("Pelé");
        Team team = new Team("Brazil's Nacional Team");
        player.setTeam(team);

        player.print();
    }
}
