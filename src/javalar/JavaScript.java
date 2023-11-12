package javalar;

public class JavaScript extends Planetas {


	public JavaScript() {

		preencherOrbita();
		setVelocidade(3);
		setHoras(10);
		setPosicao(new int[] { 8, 10 });
		setBugsCont(0);
		setDevsCont(0);
		setAnos(0);
		setNome("JavaScript");
		setxInicial(8);
		setyInicial(10);
	}

	public void preencherOrbita() {

		orbitaPermitida = new int[16][2];

		int x = 8;
		int y = 10;

		for (int i = 0; i < 16; i++) {

			orbitaPermitida[i][0] = x;
			orbitaPermitida[i][1] = y;

			if (i < 2) {

				x--;

			} else if (i < 6) {

				y--;

			} else if (i < 10) {

				x++;

			} else if (i < 14) {

				y++;

			} else {
				x--;
			}

		}

	}



}
