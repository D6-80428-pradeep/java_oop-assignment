package com.sunbeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		
		while((choice = menu()) != 0) {
			
				switch (choice) {
				case 1:
					try(CandidateDao dao = new CandidateDao()) {
						Candidate c = acceptCandidate1(sc);
						int count = dao.save(c);
						System.out.println("Rows Updated: " + count);
					}
					catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 2:
					try(CandidateDao dao = new CandidateDao()){
						List<Candidate> li = dao.findAll();
						li.forEach(c -> System.out.println(c));
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 3:
					try(CandidateDao dao = new CandidateDao()) {
						Candidate c = acceptCandidate2(sc);
						int count = dao.update(c);
						System.out.println("Rows Updated: " + count);
					}
					catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 4:
					try(CandidateDao dao = new CandidateDao()) {
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
					try(CandidateDao dao = new CandidateDao()) {
						System.out.print("Enter Id: ");
						int id = sc.nextInt();
						Candidate c = dao.findById(id);
						System.out.println(c);
					}
					catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 6:
					try(CandidateDao dao = new CandidateDao()) {
						List<PartyVotes> li = dao.getPartywiseVotes();
						li.forEach(pv -> System.out.println(pv));
					}
					catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 7:
					try(CandidateDao dao = new CandidateDao()) {
						System.out.print("Enter Party: ");
						String party = sc.next();
						List<Candidate> li = dao.findByParty(party);
						li.forEach(pv -> System.out.println(pv));
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
	
	public static Candidate acceptCandidate1(Scanner sc) {
		System.out.print("Enter Name: ");
		String name = sc.next();
		System.out.print("Enter Party: ");
		String party = sc.next();
		System.out.print("Enter Votes: ");
		int votes = sc.nextInt();
		Candidate c = new Candidate();	
		c.setName(name);
		c.setParty(party);
		c.setVotes(votes);
		return c;
	}
	
	public static Candidate acceptCandidate2(Scanner sc) {
		System.out.print("Enter Id: ");
		int id = sc.nextInt();
		System.out.print("Enter Name: ");
		String name = sc.next();
		System.out.print("Enter Party: ");
		String party = sc.next();
		System.out.print("Enter Votes: ");
		int votes = sc.nextInt();
		Candidate c = new Candidate(id, name, party, votes);	
		return c;
	}
	
	public static int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------MENU-------------");
		System.out.println("0. Exit");
		System.out.println("1. Insert new candidate");
		System.out.println("2. Display all candidates");
		System.out.println("3. Update candidate");
		System.out.println("4. Delete candidate with given id");
		System.out.println("5. Find candidate of given id");
		System.out.println("6. Display total votes for each party");
		System.out.println("7. Find candidates of given party");
		System.out.println("--------------------------------");
		System.out.print("Enter choice: ");
		int choice = sc.nextInt();
		return choice;
	}
}
