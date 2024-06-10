package SafeCar_Omada_25;

public class Expert extends User {
	
	//Βάλαμε το report ως μεταβλητή διότι συνδέεται με τον πραγματογνώμονα
	private Report rep;
	
	public Expert(String aN, String aV, String aS, int ar) {
		super(aN, aV, aS, ar);
	}
	
	public Expert(String aN, String aV, String aS, int ar, Report r) {
		super(aN, aV, aS, ar);
		this.rep = r;
	}

	public Report getRep() {
		return rep;
	}

	public void setRep(Report rep) {
		this.rep = rep;
	}
	
	@Override
	public void printData() {
		System.out.println("Name: " + this.get_name());
		System.out.println("VAT: " + this.get_vat());
		System.out.println("Stats: " + this.get_stats());
		System.out.println("Access Rights Level: " + this.getAccess_rights());
		if (rep != null) 
			rep.printData();
	}

	//public Report _unnamed_report_;
}