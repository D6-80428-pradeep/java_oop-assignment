
//2. Create an abstract Player class with id, name, age, and matchesPlayed as ﬁelds. Create a Batter interface with methods like getRuns(), getAverage(), and
//getStrikeRate(). Creater a Bowler interface with methods like getWickets(), and getEconomy(). Create a class Cricketer (with ﬁelds like runs, wickets, etc.)
//inherited from Player as well as Batter and Bowler interfaces. In all classes write appropriate constructors, getter/setters, accept(), toString(), and
//equals() methods. In main(), create a team (array) of 11 players and input their details from end user. Create a new (utilility) class Players that contains
//static methods to count number of batters, number of bowlers, total batter runs, total bowler wickets, return a batter with maximum runs, and return a
//bowler with maximum wickets.


package assignment2;

import java.util.Scanner;

public  abstract class Player {
	 int Id;
	 String name;
	 int age ;
	 int matchPlayed;
	 
	 public Player() {
			
	 }
	public Player(int id, String name, int age, int matchPlayed) {
	
		Id = id;
		this.name = name;
		this.age = age;
		this.matchPlayed = matchPlayed;
	}
	
	 public void displayPlayer() {
		 System.out.println("Name : "+name);
		 System.out.println("Player Id : "+Id);
		 System.out.println("Age  : "+age);
		 System.out.println("Matchs played: "+matchPlayed);
	 }
	 public void acceptPlayer(Scanner sc) {
		 
			System.out.print("Enter name of player :");
			name = sc.next();
			
			System.out.print("Enter id of player :");
			Id = sc.nextInt();
			
			System.out.print("Enter age of player :");
			age = sc.nextInt();
			
			System.out.print("Enter matches played :");
			matchPlayed = sc.nextInt();
	 }

	@Override
	public String toString() {
		return "Player [Id=" + Id + ", name=" + name + ", age=" + age + ", matchPlayed=" + matchPlayed + "]";
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMatchPlayed() {
		return matchPlayed;
	}
	public void setMatchPlayed(int matchPlayed) {
		this.matchPlayed = matchPlayed;
	}
	 
	
}
