package SafeCar_Omada_25;

public class Screen_customer {
	/*public Main_screen _unnamed_main_screen_;
	public Catalog_customer _unnamed_customer_catalog_;
	public Screen_registered_customers _unnamed_Screen_registered_customers_;*/

	public void show_data() {
		Catalog_customer.printData();
	}
	
	//Changed the way this function works for simplicity
	public Customer select_customer(int i) {
		return Catalog_customer.getCustomers().get(i);
	}

	public Screen_customer() {
	}
}