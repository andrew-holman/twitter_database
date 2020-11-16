package cs363project;

import java.sql.*;

public class project {

	
	public static void main(String[] args) {
		String dbServer = "jdbc:mysql://localhost:3306/group89?useSSL=false";
		// For compliance with existing applications not using SSL the verifyServerCertificate property is set to ‘false’,
		String userName = "";
		String password = "";

//		String result[] = loginDialog();
		userName = "cs363";
		password = "363F2020";

		Connection conn;
		Statement stmt;
//		if (result[0]==null || result[1]==null) {
//			System.out.println("Terminating: No username nor password is given");
//			return;
//		}
		System.out.println("Type letter to select option and press enter");
		System.out.println("");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dbServer, userName, password);
			stmt = conn.createStatement();
			String sqlQuery = "";

			String option = "";
//			String instruction = "Enter 1: Find all food with chicken as ingredient." + "\n"
//					+ "Enter 2: For each food, list food name, total number of ingredients, and total amount of ingredients (gram)."
//					+ "\n" + "Enter 3: Find all food without green onion as ingredient." + "\n"
//					+ "Enter 4: Find all ingredients and amount of each ingredient of Pad Thai" + "\n"
//					+ "Enter 5: Enter new food" + "\n"
//					+ "Enter 6: Check whether an ingredient exists" + "\n"
//					+ "Enter 7: Quit Program";
//
//			while (true) {
//				option = JOptionPane.showInputDialog(instruction);
//				if (option.equals("1")) {
//					sqlQuery = "select distinct f.fname from food f inner join recipe r on r.fid = f.fid inner join ingredient i on i.iid = r.iid where i.iname = 'Chicken'";
//					runQuery(stmt, sqlQuery);
//				} else if (option.equalsIgnoreCase("2")) {
//					sqlQuery = "select f.fname, count(r.iid), sum(r.amount) from food f inner join recipe r on r.fid = f.fid inner join ingredient i on i.iid = r.iid group by f.fname";
//					runQuery(stmt, sqlQuery);
//				} else if (option.equals("3")) {
//					sqlQuery = "select f.fname from food f where f.fid not in (select r.fid from recipe r inner join ingredient i on i.iid = r.iid where i.iname = 'Green Onion');";
//					runQuery(stmt, sqlQuery);
//				} else if (option.equals("4")) {
//					sqlQuery = "select i.iname, r.amount from food f inner join recipe r on r.fid = f.fid inner join ingredient i on i.iid = r.iid where f.fname = 'Pad Thai'";
//					runQuery(stmt, sqlQuery);
//				} else if (option.equals("5")) {
//					String fname=JOptionPane.showInputDialog("Enter foodname:");
//					insertFood(conn, fname);
//				} else if (option.equals("6")) {
//					String iname=JOptionPane.showInputDialog("Enter exact name of the ingredient to check:");
//					checkIngredient(conn, iname);
//				}  
//				else {
//					break;
//				}
//			}

			stmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println("Program terminates due to errors");
			e.printStackTrace(); // for debugging
		}
	}
	
	private static void findMostUsedHashtags(int k, int year, Connection conn) {
		
	}
	
	private static void findUserByHashtag(String hashtag, String state, int k, int month, int year, Connection conn) {
		
	}
	
	private static void findMostFollowed(String category, int k, Connection conn) {
		
	}
	
	private static void findMostRetweeted(String month, int k, Connection conn) {
		
	}
	
	private static void findMostMentioned(String subcategory, int month, int year, int k, Connection conn) {
		
	}
	
	private static void findMostUsedHashtags(String subcategory, int[] months, int year, int k, Connection conn) {
		
	}
	
	private static void addUser(String screenname, String name, int followers, int following, String category, String subcategory, String state, Connection conn) {
		
	}
	
	private static void deleteUser(String screenname, Connection conn) {
		
	}
	
}
