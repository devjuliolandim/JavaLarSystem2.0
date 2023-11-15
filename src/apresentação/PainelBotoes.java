package apresentação;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class PainelBotoes extends JPanel implements ActionListener {

	private Botao processarProximoInstante = new Botao("Processar Próximo Instante");
	private Botao lerNovoArquivoDeEntrada = new Botao("Ler Novo Arquivo de Entrada");
	private Botao gravarRelatorio = new Botao("Gravar Relatório");
	private Botao lerDadosDeOutrosParticipantes = new Botao("Ler Dados de Outros Participantes");
	private Botao gravarArquivoDeSaida = new Botao("Gravar Arquivo de Saída");

	public PainelBotoes() {
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(250, 1000));
		setLayout(new GridLayout(5, 1));

		adicionarBotoes();

	}

	private void adicionarBotoes() {

		processarProximoInstante.addActionListener(this);
		add(processarProximoInstante);
		add(lerNovoArquivoDeEntrada);
		add(gravarRelatorio);
		add(lerDadosDeOutrosParticipantes);
		add(gravarArquivoDeSaida);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()== processarProximoInstante) {
			
			
			
		}
		
		
	}

}
