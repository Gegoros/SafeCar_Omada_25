package SafeCar_Omada_25;
public class User extends Worker {
	
	private int access_rights;
	
	public User(String aN, String aV, String aS, int ar) {
		super(aN, aV, aS);
		this.access_rights = ar;
	}

	public int getAccess_rights() {
		return this.access_rights;
	}

	public void setAccess_rights(int aAccess_rights) {
		this.access_rights = aAccess_rights;
	}
	
	public void printData() {
		System.out.println("Name: " + this.get_name());
		System.out.println("VAT: " + this.get_vat());
		System.out.println("Stats: " + this.get_stats());
		System.out.println("Access Rights Level: " + this.access_rights);
	}
}