package academy.devdojo.javaoneforall.javacore.Gassociation.test;

import academy.devdojo.javaoneforall.javacore.Gassociation.domain.Player;
import academy.devdojo.javaoneforall.javacore.Gassociation.domain.Team;

public class PlayerTest03 {
    public static void main(String[] args) {
        Player player1 = new Player("Pelé");
        Team team = new Team("Brazil");
        Player player2 = new Player("Cafu");
        player1.setTeam(team);
        player2.setTeam(team);
        Player[] players = new Player[]{player1, player2};

        team.setPlayers(players);

        System.out.println("--- Player ---");
        player1.print();
        player2.print();
        System.out.println("--- Team ---");
        team.print();
    }
}
