package SafeCar_Omada_25;

public class Main {

	public static void main(String[] args) {
		
		Agent a1 = new Agent("Anthony","123456789","0 Reports",1);
		
		Document d1 = new Document(1);
		Insurance_report ir1 = new Insurance_report(d1);
		
		Agent a2 = new Agent("Oliver", "551292810", "1 Report", 1, ir1);
		Owner o1 = new Owner("Jacob", "918749218", "", 3);
		Expert e1 = new Expert("Kostas", "887788778", "", 2);
		
		Report rep = new Report("06-06-2024", "Pending");
		
		Expert e2 = new Expert("Michael", "887788778", "", 2, rep);
		
		Report_list.addReport(rep);
		User_catalog.addUser(a1);
		User_catalog.addUser(a2);
		User_catalog.addUser(o1);
		User_catalog.addUser(e1);
		User_catalog.addUser(e2);
		
		Catalog_available_agent.addAgent(a2);
		
		System.out.println("5 users have been successfully created.");
		
		Vehicle v1 = new Vehicle("IBH-9920", "Volkswagen", "Golf R", 1984, "Blue");
		Vehicle v2 = new Vehicle("ABC-1234", "Toyota", "Yaris", 1000, "Black");
		Customer c1 = new Customer("Greg", "23-12-2001", "Nowhere 72", v1);
		Customer c2 = new Customer("April", "05-03-1984", "Somewhere 12", v2);
		
		Catalog_customer.addCustomer(c1);
		Catalog_customer.addCustomer(c2);
		
		System.out.println("2 Vehicles successfully created!");
		System.out.println("2 Customers successfully created!");
		System.out.println("\nPrinting available data..");
		
		System.out.println("-------------");
		User_catalog.printData();
		
		System.out.println("-------------");
		Catalog_customer.printData();
		
		
		
	}

}