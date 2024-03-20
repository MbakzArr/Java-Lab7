# Sports League Program Design

## Description
This repository outlines the design for a sports league program that supports players, teams, and a league. The sport chosen for this program is soccer, where each team consists of multiple players and competes within a single league.

## Program Design

### Player Class
- **Attributes**:
  - Name
  - Age
  - Position
  - Skill level
  - Jersey number
  
- **Fields**:
  - Name (String)
  - Age (int)
  - Position (String)
  - Skill level (int)
  - Jersey number (int)
  
- **Constructors**:
  - Player(String name, int age, String position, int skillLevel, int jerseyNumber)
  
- **Validations**:
  - Age must be a positive integer.
  - Skill level must be between 1 and 10.
  - Jersey number must be unique within the team.

- **Functions**:
  - Update player information
  - Calculate player statistics
  - Display player details

### Team Class
- **Attributes**:
  - Team name
  - Coach name
  - List of players

- **Fields**:
  - Team name (String)
  - Coach name (String)
  - List of players (ArrayList<Player>)

- **Constructors**:
  - Team(String teamName, String coachName)

- **Functions**:
  - Add player to the team
  - Remove player from the team
  - Update team information
  - Display team details
  
### League Class
- **Attributes**:
  - League name
  - List of teams

- **Fields**:
  - League name (String)
  - List of teams (ArrayList<Team>)

- **Constructors**:
  - League(String leagueName)

- **Functions**:
  - Add team to the league
  - Remove team from the league
  - Update league information
  - Display league details

### Relationships
- Each team consists of multiple players.
- The league tracks teams participating in it.
- Teams track their players.

## Design Considerations
- **Reusability**:
  - Classes are designed to be reusable for various sports.
- **Extendability**:
  - The design allows for easy addition of new features such as scheduling, match results, etc.
- **Clarity**:
  - Detailed descriptions and explanations ensure clarity for non-programmers.

## Unit Testing
- Simple JUnit tests should be written for key class features to ensure functionality and correctness.

## Author
This program outline was developed by [Your Name].

## Acknowledgments
Special thanks to Jason Wilder for providing the lab exercise and inspiration for this project.
