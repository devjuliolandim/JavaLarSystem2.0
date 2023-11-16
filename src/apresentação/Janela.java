package apresentação;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import javalar.Memoria;

public class Janela extends JFrame {

	private PainelPlanetas exibirPlanetas;
	private PainelBotoes painelDeBotoes;

	public static Memoria memoria = new Memoria();

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

		exibirPlanetas = new PainelPlanetas(memoria);
		add(exibirPlanetas, BorderLayout.CENTER);

		painelDeBotoes = new PainelBotoes(memoria, exibirPlanetas);
		add(painelDeBotoes, BorderLayout.EAST);

	}

}
