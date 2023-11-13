package apresentação;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PainelBotoes extends JPanel {

	JButton processarProximoInstante = new JButton("Processar Próximo Instante");
	JButton lerNovoArquivoDeEntrada = new JButton("Ler Novo Arquivo de Entrada");
	JButton gravarRelatorio = new JButton("Gravar Relatório");
	JButton lerDadosDeOutrosParticipantes= new JButton("Ler Dados de Outros Participantes");
	JButton gravarArquivoDeSaida = new JButton("Gravar Arquivo de Saída");
	
	
	
	public PainelBotoes() {
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(250,1000));
		setLayout(new GridLayout(5,1));
		
		
		adicionarBotoes();
		
	}



	private void adicionarBotoes() {
		add(processarProximoInstante);
		add(lerNovoArquivoDeEntrada);
		add(gravarRelatorio);
		add(lerDadosDeOutrosParticipantes);
		add(gravarArquivoDeSaida);
	}
	
	
	
	
}
