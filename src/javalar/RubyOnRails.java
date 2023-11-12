package javalar;

public class RubyOnRails extends Planetas {


	public RubyOnRails() {

		preencherOrbita();
		setVelocidade(2);
		setHoras(48);
		setPosicao(new int[] { 8, 11 });
		setBugsCont(0);
		setDevsCont(0);
		setAnos(0);
		setNome("Ruby on Rails");
		setxInicial(8);
		setyInicial(11);
		
	}

	public void preencherOrbita() {

		int x = 8;
		int y = 11;

		orbitaPermitida = new int[24][2];

		for (int i = 0; i < 24; i++) {

			orbitaPermitida[i][0] = x;
			orbitaPermitida[i][1] = y;

			if (i < 3) {
				x--;

			} else if (i < 9) {
				y--;

			} else if (i < 15) {
				x++;
			} else if (i < 21) {

				y++;
			} else {

				x--;
			}

		}

	}

}
