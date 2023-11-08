package com.sunbeam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		
		while((choice = menu()) != 0) {
			
				switch (choice) {
				case 1:
					try(UserDao dao = new UserDao()) {
						User u = acceptUser(sc);
						int count = dao.save(u);
						System.out.println("Rows Updated: " + count);
					}
					catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 2:
					try(UserDao dao = new UserDao()){
						List<User> li = dao.findAll();
						li.forEach(c -> System.out.println(c));
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 3:
					try(UserDao dao = new UserDao()) {
						System.out.print("Enter id: ");
						int id = sc.nextInt();
						System.out.print("Enter status: ");
						int status = sc.nextInt();
						User u = new User();
						u.setId(id);
						u.setStatus(status);
						int count = dao.update(u);
						System.out.println("Rows Updated: " + count);
					}
					catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 4:
					try(UserDao dao = new UserDao()) {
						System.out.print("Enter Id: ");
						int id = sc.nextInt();
						int count = dao.delete(id);
						System.out.println("Rows Updated: " + count);
					}
					catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 5:
					try(UserDao dao = new UserDao()) {
						System.out.print("Enter Id: ");
						int id = sc.nextInt();
						User u = dao.findById(id);
						System.out.println(u);
					}
					catch (Exception e) {
						e.printStackTrace();
					}
					break;
				default:
					System.out.println("Invalid choice !!!");
					break;
				}
		}
	}
	
	public static User acceptUser(Scanner sc) throws Exception {
		System.out.print("Enter fname: ");
		String fname = sc.next();
		System.out.print("Enter lname: ");
		String lname = sc.next();
		System.out.print("Enter email: ");
		String email = sc.next();
		System.out.print("Enter password: ");
		String pass = sc.next();
		System.out.print("Enter dob: ");
		String dob = sc.next();
		System.out.print("Enter status: ");
		int status = sc.nextInt();
		System.out.print("Enter role: ");
		String role = sc.next();
		
		User u = new User();
		u.setFname(fname);
		u.setLname(lname);
		u.setEmail(email);
		u.setPass(pass);
		
		SimpleDateFormat sdf;
		sdf = new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date uDate = sdf.parse(dob);
		
		u.setDob(uDate);
		
		u.setStatus(status);
		u.setRole(role);
		return u;
	}
	
	public static int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------MENU-------------");
		System.out.println("0. Exit");
		System.out.println("1. Insert new user");
		System.out.println("2. Display all users");
		System.out.println("3. Update user");
		System.out.println("4. Delete user with given id");
		System.out.println("5. Find user of given id");
		System.out.println("--------------------------------");
		System.out.print("Enter choice: ");
		int choice = sc.nextInt();
		return choice;
	}
}
