package SafeCar_Omada_25;

import java.util.ArrayList;

public class Catalog_customer {
	private static ArrayList<Customer> customers = new ArrayList<>();
	
	/*public Screen_costumer_data _unnamed_screen_costumer_data_;
	public Screen_edit_create_documents _unnamed_screen_edit_create_documents_;
	public Customer _unnamed_customer_;
	public Screen_customer _unnamed_Screen_customer_;*/

	public Catalog_customer() {
		customers = new ArrayList<>();
	}
	
	public static void printData() {
		System.out.println("Customer Catalog Data:");
		for (Customer c : customers) {
			System.out.println("--");
			c.printData();
		}
	}

	public static ArrayList<Customer> getCustomers() {
		return customers;
	}
	
	public static void addCustomer(Customer c) {
		customers.add(c);
	}

	/*public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}*/
	
	
}