package SafeCar_Omada_25;

import java.util.ArrayList;

public class Catalog_available_agent {
	private static ArrayList<Agent> agents = new ArrayList<>();
	/*public Screen_comm_form _unnamed_screen_comm_form_;
	public File_expertise _unnamed_file_expertise_;
	public Agent _unnamed_agent_;*/

	public Catalog_available_agent() {
		agents = new ArrayList<>();
	}

	public static ArrayList<Agent> getAgents() {
		return agents;
	}

	public void setAgents(ArrayList<Agent> agents) {
		Catalog_available_agent.agents = agents;
	}
	
	public static void addAgent(Agent a) {
		agents.add(a);
	}
}