/**
 * League Class: Represents a league in the sports league program.
 * Each league has a name and a list of teams
 * 
 * @author Khuliso Junior Ravhuravhu and Arehone Brenden Mbadaliga
 * Version 1.0
 */

import java.util.ArrayList;
import java.util.List;

class League {

    // Fields
    private final String leagueName;
    private List<Team> teams;

    // Constructors
    League(final String leagueName)
    {
        this.leagueName = leagueName;
        this.teams = new ArrayList<>();
    }

    // Getters and Setters
    String getLeagueName()
    {
        return leagueName;
    }

    String setLeagueName(String leagueName)
    {
        return leagueName;
    }

    List<Team> getTeams()
    {
        return teams;
    }

    void setTeams(List<Team> teams)
    {
        this.teams = teams;
    }

    // Functions
    public void addTeam(Team team)
    {
        teams.add(team);
    }
}
