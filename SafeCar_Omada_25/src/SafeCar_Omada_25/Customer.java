package SafeCar_Omada_25;

import java.util.ArrayList;

public class Customer {
	private String name;
	private String birth_date;
	private String address;
	private Vehicle vehicle;
	private ArrayList<File> files = new ArrayList<>();
	private Agent cur_agent;
	/*public Catalog_customer _unnamed_customer_catalog_;
	public Vector<Agent> _unnamed_agent_ = new Vector<Agent>();
	public Vehicle _unnamed_Vehicle_;*/
	
	public Customer(String aN, String aB, String aA) {
		this.name = aN;
		this.birth_date = aB;
		this.address = aA;
	}

	public Customer(String aN, String aB, String aA, Vehicle aV) {
		this.name = aN;
		this.birth_date = aB;
		this.address = aA;
		this.vehicle = aV;
	}
	
	
	public void printData() {
		System.out.println("Name: " + this.name);
		System.out.println("Date of Birth: " + this.birth_date);
		System.out.println("Address: " + this.address);
		if (this.vehicle != null) {
			System.out.println("-Vehicle Data-");
			vehicle.printData();
		}
	}
	
	
	
	public String get_name() {
		return name;
	}

	public void set_name(String _name) {
		this.name = _name;
	}

	public String get_birth_date() {
		return birth_date;
	}

	public void set_birth_date(String _birth_date) {
		this.birth_date = _birth_date;
	}

	public String get_address() {
		return address;
	}

	public void set_address(String _address) {
		this.address = _address;
	}

	public Vehicle get_vehicle() {
		return vehicle;
	}

	public void set_vehicle(Vehicle _vehicle) {
		this.vehicle = _vehicle;
	}

	public ArrayList<File> getFiles() {
		return files;
	}

	public void setFiles(ArrayList<File> files) {
		this.files = files;
	}
	
		public Agent getCur_agent() {
		return cur_agent;
	}

	public void setCur_agent(Agent cur_agent) {
		this.cur_agent = cur_agent;
	}
	
	
	

	public void print_files() {
		for (File f : files) {
			f.print_data();
			System.out.println("---");
		};
	}
}