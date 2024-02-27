/**
 * TeamTest Class: the test class for the sports program
 * contains test cases for adding players to a team and also to the league
 * 
 * @author Khuliso Junior Ravhuravhu and Arehone Brenden Mbadaliga
 * Version 1.0
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TeamTest {

    private Team team;
    private League league;

    @BeforeEach
    void setUp() {
        team = new Team("Team A");
        league = new League("Football League");
    }

    @AfterEach
    void tearDown() {
        team = null;
        league = null;
    }

    @Test
    void testAddPlayerToTeam() {
        Player player = new Player("John", 10, "Forward", 25);

        team.addPlayer(player);

        assertEquals(1, team.getPlayers().size());
    }

    @Test
    void testAddTeamToLeague() {
        Team team = new Team("Team A");

        league.addTeam(team);

        assertEquals(1, league.getTeams().size());
    }
}
