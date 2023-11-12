package javalar;

import java.util.ArrayList;

public interface BugsInterface {

	public static void criarBugs(int qntdBug, ArrayList<Bug> bugs, ArrayList<Desenvolvedor> devs, ArrayList<Planetas> planetas) {}
	
	public static void verificarEncontroComBugs(ArrayList<Planetas> planetas, ArrayList<Bug> bugs,
			ArrayList<CemiterioDePlanetas> cova) {}
}
