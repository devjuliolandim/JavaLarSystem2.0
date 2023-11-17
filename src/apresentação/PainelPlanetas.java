package apresentação;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import javalar.Memoria;
import javalar.Planetas;

public class PainelPlanetas extends JPanel {

	private static final int TAMANHO_DO_GRID = 15;
	private static final int TAMANHO_DA_IMAGEM = 25;
	private static final int TAMANHO_DO_PLANO = 225;
	
	private static final String DIRETORIO_IMAGEM_JAVA = "C:\\Users\\Júlio César\\Desktop\\FACULDADE\\2º SEMESTRE\\TÉCNICAS DE PROGRAMAÇÃO\\JavaLar\\Foto dos Planetas\\Java.png";
	
	private Coordenada[][] coordenadas;
	private ArrayList<Coordenada> coordenadasOcupadas = new ArrayList<>();
	
	private ImageIcon imagem;
	private Image imagemRedimensionada;
	private JLabel label;
	
	Memoria memoria;

	public PainelPlanetas(Memoria memoria) {

		this.memoria = memoria;

		setBorder(new LineBorder(Color.gray, 5));
		setLayout(new GridLayout(TAMANHO_DO_GRID, TAMANHO_DO_GRID));
		
		coordenadas = new Coordenada[TAMANHO_DO_PLANO][TAMANHO_DO_PLANO];

		criarCoordenadas();
		adicionarImagens();
	}

	private void criarCoordenadas() {

		for (int i = TAMANHO_DO_GRID - 1; i >= 0; i--) {
			for (int j = 0; j < TAMANHO_DO_GRID; j++) {
				coordenadas[i][j] = new Coordenada((i + 1), (j + 1));

				if ((i + 1) == 8 && (j + 1) == 8) {
					adicionarImagemJava();
				}

				add(coordenadas[i][j]);
			}

		}

	}

	private void adicionarImagemJava() {

		imagem = new ImageIcon(DIRETORIO_IMAGEM_JAVA);

		imagemRedimensionada = imagem.getImage().getScaledInstance(TAMANHO_DA_IMAGEM, TAMANHO_DA_IMAGEM,
				Image.SCALE_SMOOTH);

		imagem = new ImageIcon(imagemRedimensionada);

		label = new JLabel(imagem);

		coordenadas[7][7].add(label);

	}
	

	public void adicionarImagens() {

		for (int i = 0; i < TAMANHO_DO_GRID; i++) {
			for (int j = 0; j < TAMANHO_DO_GRID; j++) {
				for (Planetas planetas : memoria.getPlanetas()) {

					if (planetas.getPosicaoX() == (j + 1) && planetas.getPosicaoY() == (i + 1)) {

						imagem = new ImageIcon(planetas.getDiretorioDeSuaImagem());

						imagemRedimensionada = imagem.getImage().getScaledInstance(TAMANHO_DA_IMAGEM,
								TAMANHO_DA_IMAGEM, Image.SCALE_SMOOTH);

						imagem = new ImageIcon(imagemRedimensionada);

						label = new JLabel(imagem);

						coordenadas[i][j].setImagem(label);
						
						coordenadasOcupadas.add(coordenadas[i][j]);
					}

				}

			}

		}

	}

	public ArrayList<Coordenada> getCoordenadasOcupadas() {
		return coordenadasOcupadas;
	}

}
