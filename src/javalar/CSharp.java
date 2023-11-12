package javalar;

public class CSharp extends Planetas {


	public CSharp() {

		preencherOrbita();
		setVelocidade(1);
		setHoras(4);
		setPosicao(new int[] { 8, 13 });
		setBugsCont(0);
		setDevsCont(0);
		setAnos(0);
		setNome("C#");
		setxInicial(8);
		setyInicial(13);
		
	}

	public void preencherOrbita() {

		orbitaPermitida = new int[40][2];

		int x = 8;
		int y = 13;

		for (int i = 0; i < 40; i++) {

			orbitaPermitida[i][0] = x;
			orbitaPermitida[i][1] = y;

			if (i < 5) {

				x--;

			} else if (i < 15) {

				y--;

			} else if (i < 25) {

				x++;
			} else if (i < 35) {

				y++;

			} else {
				x--;

			}

		}

	}



}
