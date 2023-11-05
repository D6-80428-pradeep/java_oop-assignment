package assignment2;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		Player [] arr = new Player[11];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i =0 ; i < 11 ; i++) {
			arr[i] = new Cricketer();
			arr[i].acceptPlayer(sc);
		}
		
		for(Player element : arr) {
			if(element != null) {
				element.displayPlayer();
			}
		}
		
		Players.maxRuns(arr);
		Players.maxwicket(arr);
		
		System.out.println("Total Score :"+Players.totalRuns(arr));
		System.out.println("No. Batters :"+Players.numBatters(arr));
		System.out.println("No. Bowlers :"+Players.Bowlers(arr));
	}

}
