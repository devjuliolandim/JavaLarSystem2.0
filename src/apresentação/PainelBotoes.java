package apresentação;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import javalar.Memoria;
import javalar.Planetas;
import javalar.Utilidades;

public class PainelBotoes extends JPanel implements ActionListener {

	private Botao processarProximoInstante;
	private Botao lerNovoArquivoDeEntrada;
	private Botao gravarRelatorio;
	private Botao lerDadosDeOutrosParticipantes;
	private Botao gravarArquivoDeSaida;

	Memoria memoria;

	PainelPlanetas painelPlanetas;

	public PainelBotoes(Memoria memoria, PainelPlanetas painelPlanetas) {

		this.painelPlanetas = painelPlanetas;
		this.memoria = memoria;

		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(250, 1000));
		setLayout(new GridLayout(5, 1));

		instanciarBotoes();
		adicionarBotoes();

	}

	private void instanciarBotoes() {
		 
		processarProximoInstante = new Botao("Processar Próximo Instante");
		lerNovoArquivoDeEntrada = new Botao("Ler Novo Arquivo de Entrada");
		gravarRelatorio = new Botao("Gravar Relatório");
		lerDadosDeOutrosParticipantes = new Botao("Ler Dados de Outros Participantes");
		gravarArquivoDeSaida = new Botao("Gravar Arquivo de Saída");
		
	}
	
	private void adicionarBotoes() {

		processarProximoInstante.addActionListener(this);
		add(processarProximoInstante);
		
		lerNovoArquivoDeEntrada.addActionListener(this);
		add(lerNovoArquivoDeEntrada);
		
		add(gravarRelatorio);
		add(lerDadosDeOutrosParticipantes);
		add(gravarArquivoDeSaida);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == processarProximoInstante) {

			for (Planetas planetas : memoria.getPlanetas()) {

				for (Coordenada coordenada : painelPlanetas.getCoordenadasOcupadas()) {

					coordenada.remove(coordenada.getImagem());

				}

				planetas.mover(1);

			}

			painelPlanetas.adicionarImagens();

			painelPlanetas.revalidate();
			painelPlanetas.repaint();

		} else if(e.getSource() == lerNovoArquivoDeEntrada) {
			
			new FuncaoDeCadaBotao().selecionarArquivoDeInstantes();
			
			
		}

	}

	
	
	
	
	
	
}
