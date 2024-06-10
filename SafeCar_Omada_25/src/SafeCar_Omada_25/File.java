package SafeCar_Omada_25;

public class File {
	private String name;
	private String info;
	
	//public System_files _unnamed_System_files_;
	//public Screen_file_edit _unnamed_screen_file_edit_;

	

	public File(String aN, String aI) {
		this.name = aN;
		this.info = aI;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public void print_data() {
		System.out.println(name);
		System.out.println(info);
	}
}