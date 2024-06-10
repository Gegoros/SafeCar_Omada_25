package SafeCar_Omada_25;

public class Worker {
	private String name;
	private String vat;
	private String stats;
	
	

	public String get_name() {
		return name;
	}

	public void set_name(String _name) {
		this.name = _name;
	}

	public String get_vat() {
		return vat;
	}

	public void set_vat(String _vat) {
		this.vat = _vat;
	}

	public String get_stats() {
		return stats;
	}

	public void set_stats(String _stats) {
		this.stats = _stats;
	}



	public Worker(String aN, String aV, String aS) {
		this.name = aN;
		this.vat = aV;
		this.stats = aS;
	}
}