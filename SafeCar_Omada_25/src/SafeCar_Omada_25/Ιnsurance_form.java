package SafeCar_Omada_25;

public class Ιnsurance_form {
	private Customer cust;
	
	//public Screen_registered_customers _unnamed_Screen_registered_customers_;
	//public Message _unnamed_Message_;
	
	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}


	public void get_report() {
		cust.getCur_agent().getReport();
	}

	public void send() {
		System.out.println("Insurance Report sent successfully!");
	}

	public void Ensurance_Form(Customer aC) {
		this.cust = aC;
	}
}