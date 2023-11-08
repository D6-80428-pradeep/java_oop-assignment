package Q2;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Scanner;


enum menue{
	exit, Insert_new_user_Voter, Display_all_users, Delete_voter_with_given_id, Change_status_of_voter_with_given_id_to_true, 
	Change_the_name_and_birth_date_of_voter
	
}

public class User {
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
		System.out.println("1. Insert new user (Voter)");
		System.out.println("2. Display all users");
		System.out.println("3. Delete voter with given id");
		System.out.println("4. Change status of voter with given id to true");
		System.out.println("5. Change the name and birth date of voter0");
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
				
			case Insert_new_user_Voter:
				try(Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD)){
					String sql = "insert into users values (default, ?,?,?,?,?,?,?)";
					try(PreparedStatement stmt = con.prepareStatement(sql)){
						System.out.println("Enter first name :- ");
						String Fname = sc.next();
						stmt.setString(1, Fname);
						
						System.out.println("Enter last name :- ");
						String Lname = sc.next();
						stmt.setString(2, Lname);
						
						System.out.println("Enter Email :- ");
						String email = sc.next();
						stmt.setString(3, email);
						
						System.out.println("Enter Password :- ");
						String password = sc.next();
						stmt.setString(4, password);
						
						System.out.println("Enter dob :- ");
						String dob = sc.next();
						SimpleDateFormat sdf;
						sdf = new SimpleDateFormat("dd-MM-yyyy");
						java.util.Date udate = sdf.parse(dob);
						java.sql.Date sdate = new java.sql.Date(udate.getTime());
						stmt.setDate(5, sdate);
						
	
						System.out.println("Enter status :- ");
						int status = sc.nextInt();
						stmt.setInt(6, status);
						
						System.out.println("Enter Role :- ");
						String role = sc.next();
						stmt.setString(7, role);
						
						int count = stmt.executeUpdate();
						System.out.println(count + " rows affected");
						
					}
				}
				
				catch(Exception e) {
					e.printStackTrace();
				}
				break;
				
			case Display_all_users:
				try(Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD)){
					
					String sql = "SELECT * FROM users";
					try(PreparedStatement stmt = con.prepareStatement(sql)) {
						
						try(ResultSet rs = stmt.executeQuery()) {
							System.out.println("The data in the table is :- ");
							while(rs.next()) {
								int id = rs.getInt("id");
								String Fname = rs.getString("first_name");
								String Lname = rs.getString("last_name");
								String email = rs.getString("email");
								String password = rs.getString("password");
								String dob = rs.getString("dob");
								int status = rs.getInt("status");
								String role = rs.getString("role");
								
								
								System.out.println(id + " " + Fname + " " +Lname +" "+ email + " " + password + " " + dob + " " + status + " " + role);
							}
						}
					
					}
					
				}
				catch (Exception e) {
					e.printStackTrace();
					}
				break;
				
			case Delete_voter_with_given_id:
					try(Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD)){

						String sql = "delete from users where id = ?";
						try(PreparedStatement stmt = con.prepareStatement(sql)){
							
							System.out.println("Enter the id of user to be remove :- ");
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
				
			case Change_status_of_voter_with_given_id_to_true :
				try(Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD)){

					String sql = "update users set status = ? where id = ?";
					try(PreparedStatement stmt = con.prepareStatement(sql)){
						System.out.println("Enter status of the user:- ");
						int status1 = sc.nextInt();
						stmt.setInt(1, status1);
						
						System.out.println("Enter the id of user :- ");
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
				
			case Change_the_name_and_birth_date_of_voter:
				try(Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD)){

					String sql = "update users set first_name = ?, last_name = ?, dob = ? where id = ?";
					try(PreparedStatement stmt = con.prepareStatement(sql)){
						System.out.println("Enter First name :- ");
						String Fname  = sc.next();
						stmt.setString(1, Fname);
						
						System.out.println("Enter Last name :- ");
						String Lname  = sc.next();
						stmt.setString(2, Lname);
					
						System.out.println("Enter dob :- ");
						String dob = sc.next();
						SimpleDateFormat sdf;
						sdf = new SimpleDateFormat("dd-MM-yyyy");
						java.util.Date udate = sdf.parse(dob);
						java.sql.Date sdate = new java.sql.Date(udate.getTime());
						stmt.setDate(3, sdate);

						System.out.println("Enter the id of user :- ");
						int ID = sc.nextInt();
						stmt.setInt(4, ID);
						
						
						int count = stmt.executeUpdate();
						System.out.println(count + " rows affected");
						
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
