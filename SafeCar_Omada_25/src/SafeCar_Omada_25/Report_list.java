package SafeCar_Omada_25;

import java.util.ArrayList;

public class Report_list {
	private static ArrayList<Report> reports = new ArrayList<>();

	public Report_list() {
		reports = new ArrayList<>();
	}
	
	
	public ArrayList<Report> getReports() {
		return reports;
	}

	public void setReports(ArrayList<Report> reports) {
		Report_list.reports = reports;
	}
	
	public static void addReport(Report r) {
		reports.add(r);
	}
	
}