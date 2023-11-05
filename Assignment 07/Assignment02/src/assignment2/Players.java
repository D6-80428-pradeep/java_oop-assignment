
//2. Create an abstract Player class with id, name, age, and matchesPlayed as ﬁelds. Create a Batter interface with methods like getRuns(), getAverage(), and
//getStrikeRate(). Creater a Bowler interface with methods like getWickets(), and getEconomy(). Create a class Cricketer (with ﬁelds like runs, wickets, etc.)
//inherited from Player as well as Batter and Bowler interfaces. In all classes write appropriate constructors, getter/setters, accept(), toString(), and
//equals() methods. In main(), create a team (array) of 11 players and input their details from end user. Create a new (utilility) class Players that contains
//static methods to count number of batters, number of bowlers, total batter runs, total bowler wickets, return a batter with maximum runs, and return a
//bowler with maximum wickets.



package assignment2;


public class Players extends Cricketer {

	
	  public static int totalRuns(Player []arr) {
		int total_runs =  0;
		for(Player element:arr) {
			if(element != null) {
				 Cricketer c1 = (Cricketer)element;
				 total_runs += c1.getRuns();
			}

			 
		 }
		return total_runs;
	  }
	  
	  public static int numBatters(Player []arr) {
		int batters = 0;
		for(Player element:arr) {
			if(element != null) {
				 Cricketer c1 = (Cricketer)element;
				if(c1.ballsplayed > 0) {
					batters++;
				}
			}
			 
		 }
		
		  return batters;
	}
	  
	  
	  public static int Bowlers(Player []arr) {
		int bowlers = 0;
		  
		for(Player element:arr) {
			if(element != null) {
				 Cricketer c1 = (Cricketer)element;
				if(c1.ballsBowled > 0) {
					bowlers++;
				}
			}
			 
		 }
		  return bowlers;
	}
	  
	  
	  public static void maxwicket(Player []arr) {
		int maxwicket = 0;
		for(Player element:arr) {
			if(element != null) {
				 Cricketer c1 = (Cricketer)element;
				if(c1.getWickets() > maxwicket) {
					maxwicket = c1.getWickets();
				}
			}
			 
		 }
		
		for(Player element:arr) {
			if(element != null) {
				Cricketer c1 = (Cricketer)element;
			if(c1.getWickets() == maxwicket) {
				System.out.println("Maximum wicket "+c1.getName()+":"+ maxwicket);
			}
			}
			
		}
		
	}
	  
	  public static void maxRuns(Player []arr) {
			int maxruns = 0;
			for(Player element:arr) {
				if(element != null) {
					 Cricketer c1 = (Cricketer)element;
					if(c1.getRunScored() > maxruns) {
						maxruns = c1.getRunScored();
					}
				}
				 
			 }
			
			for(Player element:arr) {
				if(element != null) {
					Cricketer c1 = (Cricketer)element;
				if(c1.getWickets() == maxruns) {
					System.out.println("Maximum wicket "+c1.getName()+":"+ maxruns);
				}
				}
				
			}
	}
	  
}

//public static int totalWickets() {
	
//}}
