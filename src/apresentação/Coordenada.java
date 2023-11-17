package apresentação;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Coordenada extends JPanel {

	
	private JLabel parOrdenado;
	private JLabel imagem;
	
	public Coordenada(int x, int y) {
	
		this.setBorder(new LineBorder(Color.gray, 2));
		this.setOpaque(false);
		
		definirCoordenada(x, y);
		
	}
	
	private void definirCoordenada(int x, int y) {
		
		parOrdenado = new JLabel("("+ x + ", " + y + ")");
		parOrdenado.setBackground(Color.black);
		add(parOrdenado);
		
	}

	public JLabel getImagem() {
		return imagem;
	}

	public void setImagem(JLabel imagem) {
		this.imagem = imagem;
		add(this.imagem);
	}
	
	
	
}
