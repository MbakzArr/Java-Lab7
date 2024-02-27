/**
 * Team Class: Represents a team in the sports league program.
 * Each Team has a name and a list of players.
 * 
 * @author Khuliso Junior Ravhuravhu and Arehone Brenden Mbadaliga
 * Version 1.0
 */

import java.util.ArrayList;
import java.util.List;

class Team {

    // field
    private final String teamName;
    private List<Player> players;

    // Constructors
    Team(final String teamName)
    {
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }

    // Getters and Setters
    String getTeamName()
    {
        return teamName;
    }

    String setTeamName(String teamName)
    {
        return teamName;
    }

    List<Player> getPlayers()
    {
        return players;
    }

    void setPlayers(List<Player> players)
    {
        this.players = players;
    }

    // Functions
    public void addPlayer(Player player)
    {
        players.add(player);
    }
}
