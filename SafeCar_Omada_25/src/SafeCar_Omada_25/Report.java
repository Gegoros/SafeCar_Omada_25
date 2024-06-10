package SafeCar_Omada_25;

public class Report {
	private String sent_date;
	private String status;

	public String getSent_date() {
		return this.sent_date;
	}

	public void setSent_date(String aSent_date) {
		this.sent_date = aSent_date;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String aStatus) {
		this.status = aStatus;
	}

	public Report(String aDate, String aStatus) {
		this.sent_date = aDate;
		this.status = aStatus;
	}
	
	public void printData() {
		System.out.println("Report Sent Date: " + this.sent_date);
		System.out.println("Report Status: " + this.status);
	}
}