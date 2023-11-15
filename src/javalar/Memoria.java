package javalar;

import java.util.ArrayList;

public class Memoria {

	private ArrayList<Planetas> planetas = new ArrayList<>();

	Planetas python = new Python();
	Planetas javaScript = new JavaScript();
	Planetas ROR = new RubyOnRails();
	Planetas php = new PHP();
	Planetas csharp = new CSharp();
	Planetas cplusplus = new CPlusPlus();
	Planetas c = new C();

	public Memoria() {

		adicionarAoArrayList();
	}

	private void adicionarAoArrayList() {
		planetas.add(python);
		planetas.add(javaScript);
		planetas.add(ROR);
		planetas.add(php);
		planetas.add(csharp);
		planetas.add(cplusplus);
		planetas.add(c);
	}

	public ArrayList<Planetas> getPlanetas() {
		return planetas;
	}

	public void setPlanetas(ArrayList<Planetas> planetas) {
		this.planetas = planetas;
	}

}
