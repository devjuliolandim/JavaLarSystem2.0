package javalar;

public class C extends Planetas {

	public C() {

		preencherOrbita();
		setVelocidade(10);
		setHoras(0.1);
		setPosicao(new int[] { 8, 15 });
		setBugsCont(0);
		setAnos(0);
		setNome("C");
		setxInicial(8);
		setyInicial(15);
	}

	public void preencherOrbita() {

		orbitaPermitida = new int[56][2];

		int x = 8;
		int y = 15;

		for (int i = 0; i < 56; i++) {

			orbitaPermitida[i][0] = x;
			orbitaPermitida[i][1] = y;
			if (i < 7) {

				x--;

			} else if (i < 21) {

				y--;

			} else if (i < 35) {

				x++;
			} else if (i < 49) {

				y++;

			} else {
				x--;

			}
			
		}
		
	}

}
