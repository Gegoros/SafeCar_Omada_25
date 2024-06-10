package SafeCar_Omada_25;

import java.util.ArrayList;

public class User_catalog {
	private static ArrayList<User> users = new ArrayList<>();

	public User_catalog() {
		users = new ArrayList<>();
	}

	public static ArrayList<User> getUsers() {
		return users;
	}

	public static void setUsers(ArrayList<User> users) {
		User_catalog.users = users;
	}
	
	public static void addUser(User u) {
		users.add(u);
	}
	
	public static void printData() {
		System.out.println("User Catalog Data:");
		for (User u : users) {
			System.out.println("--");
			u.printData();
		}
	}
}