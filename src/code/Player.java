/**
 * Player Class: Represents a player in the sports league program.
 * Each player has a name, number, position, and age
 * 
 * @author Khuliso Junior Ravhuravhu and Arehone Brenden Mbadaliga
 * Version 1.0
 */

import java.util.ArrayList;
import java.util.List;

class Player {

    // the squad
    private final String playerName;
    private final int playerNumber;
    private final String position;
    private final int age;

    // Constructors
    Player(final String playerName, final int playerNumber, final String position, final int age) {
        this.playerName = playerName;
        this.playerNumber = playerNumber;
        this.position = position;
        this.age = age;
    }

    // Getters and Setters
    String getPlayerName()
    {
        return playerName;
    }

    String setPlayerName(String playerName) {
        return playerName;
    }

    int getPlayerNumber()
    {
        return playerNumber;
    }

    int setPlayerNumber(int playerNumber)
    {
        return playerNumber;
    }

    String getPosition()
    {
        return position;
    }

    String setPosition(String position)
    {
        return position;
    }

    int getAge()
    {
        return age;
    }

    int setAge(int age)
    {
        return age;
    }

    // Functions
    public void performAction(String action)
    {
        System.out.println(playerName + " performs " + action);
    }
}
