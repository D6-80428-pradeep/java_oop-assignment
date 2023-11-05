

//2. Create an abstract Player class with id, name, age, and matchesPlayed as ﬁelds. Create a Batter interface with methods like getRuns(), getAverage(), and
//getStrikeRate(). Creater a Bowler interface with methods like getWickets(), and getEconomy(). Create a class Cricketer (with ﬁelds like runs, wickets, etc.)
//inherited from Player as well as Batter and Bowler interfaces. In all classes write appropriate constructors, getter/setters, accept(), toString(), and
//equals() methods. In main(), create a team (array) of 11 players and input their details from end user. Create a new (utilility) class Players that contains
//static methods to count number of batters, number of bowlers, total batter runs, total bowler wickets, return a batter with maximum runs, and return a
//bowler with maximum wickets.

package assignment2;

import java.util.Scanner;

public interface Batter {
	public abstract int getRuns();
	public abstract double  getAverage();
	public abstract double getStrikeRate();
}
