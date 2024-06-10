package SafeCar_Omada_25;

public class Agent extends User {
	
	//Βάλαμε το report ως μεταβλητή διότι συνδέεται με τον πράκτορα 
	private Insurance_report report;
	
	public Agent(String aN, String aV, String aS, int ar) {
		super(aN, aV, aS, ar);
	}
	
	public Agent(String aN, String aV, String aS, int ar, Insurance_report r) {
		super(aN, aV, aS, ar);
		this.report = r;
	}

	public Insurance_report getReport() {
		return report;
	}

	public void setReport(Insurance_report report) {
		this.report = report;
	}
	
	@Override
	public void printData() {
		System.out.println("Name: " + this.get_name());
		System.out.println("VAT: " + this.get_vat());
		System.out.println("Stats: " + this.get_stats());
		System.out.println("Access Rights Level: " + this.getAccess_rights());
		if (report != null)
			System.out.println("Insurance Report ID: " + report.getDoc().getId());
	}
	
	/*public Insurance_report _unnamed_insurance_report_;
	public Catalog_available_agent _unnamed_catalog_available_agent_;
	public Vector<Customer> _unnamed_customer_ = new Vector<Customer>();*/
}