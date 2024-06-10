package SafeCar_Omada_25;

public class Vehicle {
	private String licence_number;
	private String brand;
	private String model;
	private float cubic_cm;
	private String color;

	
	
	public void printData() {
		System.out.println("Licence Number: " + this.licence_number);
		System.out.println("Brand: " + this.brand);
		System.out.println("Model: " + this.model);
		System.out.println("Cubic: " + this.cubic_cm);
		System.out.println("Color: " + this.color);
	}
	
	
	
	
	
	public String getLicence_number() {
		return this.licence_number;
	}

	public void setLicence_number(String aLicence_number) {
		this.licence_number = aLicence_number;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String aBrand) {
		this.brand = aBrand;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String aModel) {
		this.model = aModel;
	}

	public float getCubic_cm() {
		return this.cubic_cm;
	}

	public void setCubic_cm(float aCubic_cm) {
		this.cubic_cm = aCubic_cm;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String aColor) {
		this.color = aColor;
	}

	public Vehicle(String aL, String aBrand, String aModel, float aCm, String aColor) {
		this.licence_number = aL;
		this.brand = aBrand;
		this.model = aModel;
		this.cubic_cm = aCm;
		this.color = aColor;
	}
}