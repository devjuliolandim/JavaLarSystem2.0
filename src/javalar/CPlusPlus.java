package javalar;

public class CPlusPlus extends Planetas{


	
	
	public CPlusPlus() {
		
		preencherOrbita();
		setVelocidade(2);
		setHoras(0.5);
		setPosicao(new int[] {8,14});
		setBugsCont(0);
		setDevsCont(0);
		setAnos(0);
		setNome("C++");
		setxInicial(8);
		setyInicial(14);
		
	}

	
	public void preencherOrbita() {

		orbitaPermitida = new int[48][2];

		int x = 8;
		int y = 14;

		for (int i = 0; i < 48; i++) {

			orbitaPermitida[i][0] = x;
			orbitaPermitida[i][1] = y;

			if (i < 6) {

				x--;

			} else if (i < 18) {

				y--;

			} else if (i < 30) {

				x++;
			} else if (i < 42) {

				y++;

			} else {
				x--;

			}

		}

	}
	
}
