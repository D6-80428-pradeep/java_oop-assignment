package Q1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

enum menue{
	exit, insert_one_candidate, Display_all_candidates, Increment_votes_of_candidate_with_given_id, Delete_candidate_with_given_id, 
	Find_candidate_of_given_id, Find_candidates_of_given_party, Display_total_votes_for_each_party
	
}

public class Candidate {
	static Scanner sc = new Scanner(System.in);
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/CDAC_JAVA";
	public static final String DB_USER = "D6_80283_BhushanRajam";
	public static final String DB_PASSWORD = "sunbeam";
	
	static {
		try {
			Class.forName(DB_DRIVER);
			
		}catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public static int menu() {
		System.out.println("0. exit");
		System.out.println("1. Insert new candidate");
		System.out.println("2. Display all candidates");
		System.out.println("3. Increment votes of candidate with given id");
		System.out.println("4. Delete candidate with given id");
		System.out.println("5. Find candidate of given id");
		System.out.println("6. Find candidates of given party");
		System.out.println("7. Display total votes for each party");
		System.out.println("Enter your choice :- ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public static void main(String[]args) {
		int choice1; 
		menue []arr = menue.values();

		
		do {
			choice1 = menu();
			menue input = arr[choice1];
			switch (input) {
			case exit:
				System.out.println("Successfully exited the program !!");
				break;
				
			case insert_one_candidate:
				try(Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD)){
					String sql = "insert into candidates values (default, ?,?,?)";
					try(PreparedStatement stmt = con.prepareStatement(sql)){
						System.out.println("Enter name :- ");
						String name = sc.next();
						
						System.out.println("Enter party :- ");
						String party = sc.next();
						
						System.out.println("Enter votes :- ");
						int votes = sc.nextInt();
						
						stmt.setString(1, name);
						stmt.setString(2, party);
						stmt.setInt(3, votes);
						
						int count = stmt.executeUpdate();
						System.out.println(count + " rows affected");
						
					}
				}
				
				catch(Exception e) {
					e.printStackTrace();
				}
				break;
				
			case Display_all_candidates:
				try(Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD)){
					
					String sql = "SELECT * FROM candidates";
					try(PreparedStatement stmt = con.prepareStatement(sql)) {
						
						try(ResultSet rs = stmt.executeQuery()) {
							System.out.println("The data in the table is :- ");
							while(rs.next()) {
								int id = rs.getInt("id");
								String name = rs.getString("name");
								String party = rs.getString("party");
								int votes = rs.getInt("votes");
								System.out.println(id + " " + name + " " +party +" "+ votes);
							}
						}
					
					}
					
				}
				catch (Exception e) {
					e.printStackTrace();
					}
				break;
				
			case Increment_votes_of_candidate_with_given_id:
				try(Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD)){

					String sql = "update candidates set votes = votes + ? where id = ?";
					try(PreparedStatement stmt = con.prepareStatement(sql)){
						System.out.println("Enter votes to be added:- ");
						int votes = sc.nextInt();
						stmt.setInt(1, votes);
						
						System.out.println("Enter the id of candidate :- ");
						int ID = sc.nextInt();
						stmt.setInt(2, ID);
						
						
						int count = stmt.executeUpdate();
						System.out.println(count + " rows affected");
						
					}
				}
				
				catch(Exception e) {
					e.printStackTrace();
				}
				
				break;
				
			case Delete_candidate_with_given_id :
				try(Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD)){

					String sql = "delete from candidates where id = ?";
					try(PreparedStatement stmt = con.prepareStatement(sql)){
						
						System.out.println("Enter the id of candidate to be remove :- ");
						int ID = sc.nextInt();
						stmt.setInt(1, ID);
						
						int count = stmt.executeUpdate();
						System.out.println(count + " rows affected");
						
					}
				}
				
				catch(Exception e) {
					e.printStackTrace();
				}
				
				break;
				
			case Find_candidate_of_given_id:
				try(Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD)){

					String sql = "select * from candidates where id = ?";
					try(PreparedStatement stmt = con.prepareStatement(sql)){
						
						System.out.println("Enter the id of candidate to be display :- ");
						int ID = sc.nextInt();
						stmt.setInt(1, ID);
						
						try(ResultSet rs = stmt.executeQuery()) {
							while(rs.next()) {
								int id = rs.getInt("id");
								String name = rs.getString("name");
								String party = rs.getString("party");
								int votes = rs.getInt("votes");
								System.out.println(id + " " + name + " " +party +" "+ votes);
							}
						
						}
					}
				}
						
				catch(Exception e) {
					e.printStackTrace();
				}
				break;
				
			case Find_candidates_of_given_party:
				try(Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD)){

					String sql = "select * from candidates where party = ?";
					try(PreparedStatement stmt = con.prepareStatement(sql)){
						
						System.out.println("Enter the Party of candidate to be display :- ");
						String Party = sc.next();
						stmt.setString(1, Party);
						
						try(ResultSet rs = stmt.executeQuery()) {
							while(rs.next()) {
								int id = rs.getInt("id");
								String name = rs.getString("name");
								String party = rs.getString("party");
								int votes = rs.getInt("votes");
								System.out.println(id + " " + name + " " +party +" "+ votes);
							}
						
						}
					}
				}
						
				catch(Exception e) {
					e.printStackTrace();
				}
				break;
				
			case Display_total_votes_for_each_party:
				try(Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD)){

					String sql = "select party, sum(votes) as total from candidates group by party";
					try(PreparedStatement stmt = con.prepareStatement(sql)){
						
						System.out.println("Display total votes for each party :- ");

						try(ResultSet rs = stmt.executeQuery()) {
							while(rs.next()) {
								String party = rs.getString("party");
								int votes = rs.getInt("total");
								System.out.println(party +" "+ votes);
							}
						
						}
					}
				}
						
				catch(Exception e) {
					e.printStackTrace();
				}
				break;
				
			default:
				break;
			}
			
	}while(choice1 != 0);
		
		
		
		
		
		
		
		

	}
}
