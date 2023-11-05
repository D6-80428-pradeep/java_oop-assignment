
//2. Create an abstract Player class with id, name, age, and matchesPlayed as ﬁelds. Create a Batter interface with methods like getRuns(), getAverage(), and
//getStrikeRate(). Creater a Bowler interface with methods like getWickets(), and getEconomy(). Create a class Cricketer (with ﬁelds like runs, wickets, etc.)
//inherited from Player as well as Batter and Bowler interfaces. In all classes write appropriate constructors, getter/setters, accept(), toString(), and
//equals() methods. In main(), create a team (array) of 11 players and input their details from end user. Create a new (utilility) class Players that contains
//static methods to count number of batters, number of bowlers, total batter runs, total bowler wickets, return a batter with maximum runs, and return a
//bowler with maximum wickets.


package assignment2;

import java.util.Scanner;

public class Cricketer extends Player implements Batter,Bowler {
	
	int runScored;
	int wickets;
	int ballsBowled;
	int ballsplayed;
	int runsConcided;
	
	
	public int getBallsBowled() {
		return ballsBowled;
	}

	public void setBallsBowled(int ballsBowled) {
		this.ballsBowled = ballsBowled;
	}
	
	public int getBallsplayed() {
		return ballsplayed;
	}



	public void setBallsplayed(int ballsplayed) {
		this.ballsplayed = ballsplayed;
	}

	public int getRunsConcided() {
		return runsConcided;
	}



	public void setRunsConcided(int runsConcided) {
		this.runsConcided = runsConcided;
	}

	public Cricketer() {
		
	}

	public void setRuns(int run) {
		this.runScored = run;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	@Override
	public int getWickets() {
		return this.wickets;
	
	}
	@Override
	public double getEconomy() {
		double eco;
		eco = (double)runsConcided/(ballsBowled/6);
		return eco;
	}
	@Override
	public int getRuns() {
		
		return this.runScored;
		
	}
	@Override
	public double getAverage() {
		double ave ;
		ave = runScored / matchPlayed;
		return ave;
	}
	@Override
	public double getStrikeRate() {
		double strikerate; 
		
		strikerate = (this.runScored/this.ballsplayed) * 100;
		return strikerate;
		
	}
	@Override
	public void acceptPlayer(Scanner sc) {
		super.acceptPlayer(sc);
		System.out.print("Enter total runs by player :");
		runScored = sc.nextInt();
		
		System.out.print("Enter no of balls played :");
		ballsplayed = sc.nextInt();
		
		System.out.print("Enter wicket taken :");
		wickets = sc.nextInt();
		
		System.out.print("Enter total balls bowled :");
		ballsBowled = sc.nextInt();
		
		System.out.print("Enter total runs concided by player :");
		runsConcided = sc.nextInt();
		
	}
	@Override
	 public void displayPlayer() {
		super.displayPlayer();
		if(ballsplayed > 0) {
			System.out.println("Runs :"+ runScored);
			System.out.println("Balls :"+ballsplayed);
			System.out.println("Strike Rate :"+this.getStrikeRate());
			System.out.println("Average :"+this.getAverage());
		
		}
		if(ballsBowled > 0) {
			System.out.println("Wikets :"+ wickets);
			System.out.println("Runs :"+runsConcided);
			System.out.println("Economy : "+ this.getEconomy());
		}
		
	}

	public int getRunScored() {
		return runScored;
	}


}
