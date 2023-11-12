package javalar;

public class PHP extends Planetas {


	public PHP() {

		preencherOrbita();
		setVelocidade(2);
		setHoras(60);
		setPosicao(new int[] { 8, 12 });
		setBugsCont(0);
		setDevsCont(0);
		setAnos(0);
		setNome("PHP");
		setxInicial(8);
		setyInicial(12);
		
	}

	public void preencherOrbita() {

		int x = 8;
		int y = 12;

		orbitaPermitida = new int[32][2];

		for (int i = 0; i < 32; i++) {

			orbitaPermitida[i][0] = x;
			orbitaPermitida[i][1] = y;

			if (i < 4) {

				x--;

			} else if (i < 12) {

				y--;

			} else if (i < 20) {

				x++;
			} else if (i < 28) {

				y++;

			} else {
				x--;

			}

		}

	}


}
