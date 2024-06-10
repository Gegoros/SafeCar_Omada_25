package SafeCar_Omada_25;

public class Screen_company_stats {
	private Catalog_company catalogue;

	public void print_data() {
		System.out.println(catalogue.getStats());
	}

	public Screen_company_stats() {
		throw new UnsupportedOperationException();
	}
}