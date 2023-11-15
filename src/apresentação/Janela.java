package apresentação;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Janela extends JFrame {

	private PainelPlanetas exibirPlanetas;
	private PainelBotoes painelDeBotoes;

	public Janela() {

		this.setTitle("Sistema JavaLar");
		this.setSize(1000, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		configurarPaineis();

		
		this.setVisible(true);
	}

	public void configurarPaineis() {

		exibirPlanetas = new PainelPlanetas();
		add(exibirPlanetas, BorderLayout.CENTER);

		painelDeBotoes = new PainelBotoes();
		add(painelDeBotoes, BorderLayout.EAST);

	}

}
