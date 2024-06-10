package SafeCar_Omada_25;

import java.util.ArrayList;

public class System_files {
	private static ArrayList<File> files = new ArrayList<>();

	public void search(File aFile) {
	//Since the program won't be expanded, the search function will remain unimplemented
	}

	public System_files() {
		files = new ArrayList<>();
	}

	public static ArrayList<File> getFiles() {
		return files;
	}

	public static void setFiles(ArrayList<File> files) {
		System_files.files = files;
	}
	
	
}