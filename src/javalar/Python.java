package javalar;

public class Python extends Planetas {

	public Python() {

		preencherOrbita();
		setPosicao(new int[] {8,9});
		setHoras(24);
		setVelocidade(4);
		setBugsCont(0);
		setDevsCont(0);
		setAnos(0);
		setNome("Python");
		setxInicial(8);
		setyInicial(9);
	}

	private void preencherOrbita() {
		orbitaPermitida = new int[8][2];
		int x = 8;
		int y = 9;

		for (int i = 0; i < 8; i++) {

			orbitaPermitida[i][0] = x;
			orbitaPermitida[i][1] = y;

			if (i < 1) {

				x--;
			} else if (i < 3) {
				
				y--;
			} else if (i < 5) {
				
				x++;
			} else if (i < 7) {
				
				y++;
			} else {
				
				x--;
			}

		}
	}

}
