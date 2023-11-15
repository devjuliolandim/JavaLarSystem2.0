package apresentação;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import javalar.Memoria;
import javalar.Planetas;

public class PainelPlanetas extends JPanel {

	private static final int TAMANHO_DO_GRID = 15;
	private static final int TAMANHO_DA_IMAGEM = 40;
	private static final int TAMANHO_DO_PLANO = 225;
	
	
	private JPanel[] coordenadas;
	private ImageIcon planetaImagem;
	private Image imagemRedimensionada;
	private JLabel label;
	Memoria memoria = new Memoria();

	public PainelPlanetas() {

		setBorder(new LineBorder(Color.gray, 5));
		setLayout(new GridLayout(TAMANHO_DO_GRID, TAMANHO_DO_GRID));

		coordenadas = new JPanel[TAMANHO_DO_PLANO];

		criarCoordenadas();

		adicionarImagens();

	}

	private void criarCoordenadas() {
		for (int i = 0; i < TAMANHO_DO_PLANO; i++) {

			coordenadas[i] = new JPanel();
			coordenadas[i].setBorder(new LineBorder(Color.gray, 2));
			coordenadas[i].setBackground(Color.black);
			add(coordenadas[i]);
		}
	}

	private void adicionarImagens() {

		int indice = 0; // Converter coordenada bidimensional em unidimensional

		for (Planetas memorias : memoria.getPlanetas()) {

			indice = memorias.getPosicaoY() * TAMANHO_DO_GRID + memorias.getPosicaoX() - 136;
			
			planetaImagem = new ImageIcon(memorias.getDiretorioDeSuaImagem());
			
			imagemRedimensionada = planetaImagem.getImage().getScaledInstance(TAMANHO_DA_IMAGEM, TAMANHO_DA_IMAGEM,Image.SCALE_SMOOTH);
			
			planetaImagem = new ImageIcon(imagemRedimensionada);

			label = new JLabel(planetaImagem);

			coordenadas[indice].add(label);

		}

	}

}
