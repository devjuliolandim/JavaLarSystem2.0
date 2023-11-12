package javalar;

public abstract class Planetas implements Mover {

	protected int[] posicao = new int[2];
	protected int velocidade;
	protected double horas;
	protected String nome;
	protected int bugsCont;
	protected int devsCont;
	protected int anos;
	protected int orbitaPermitida[][];
	protected int indicePosAtual = 0;
	protected int xInicial;
	protected int yInicial;
	
	
	public int[][] getOrbitaPermitida() {
		return orbitaPermitida;
	}

	public void setOrbitaPermitida(int[][] orbitaPermitida) {
		this.orbitaPermitida = orbitaPermitida;
	}

	public int getIndicePosAtual() {
		return indicePosAtual;
	}

	public void setIndicePosAtual(int indicePosAtual) {
		this.indicePosAtual = indicePosAtual;
	}

	public int getXInicial() {
		return xInicial;
	}

	public void setxInicial(int xInicial) {
		this.xInicial = xInicial;
	}

	public int getYInicial() {
		return yInicial;
	}

	public void setyInicial(int yInicial) {
		this.yInicial = yInicial;
	}

	public int getAnos() {
		return anos;
	}

	public void setAnos(int anos) {
		this.anos = anos;
	}

	public int getDevsCont() {
		return devsCont;
	}

	public void setDevsCont(int devsCont) {
		this.devsCont = devsCont;
	}

	public int getBugsCont() {
		return bugsCont;
	}

	public void setBugsCont(int bugsCont) {
		this.bugsCont = bugsCont;
	}

	public Planetas() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int[] getPosicao() {
		return posicao;
	}

	public int getPosicaoX() {
		return this.posicao[0];
	}

	public int getPosicaoY() {
		return this.posicao[1];
	}

	public void setPosicao(int[] posicao) {
		this.posicao = posicao;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}

	public void mover(int instantes) {
		
		for(int i = 0; i < instantes; i++) {
			
			indicePosAtual = (indicePosAtual + getVelocidade()) % orbitaPermitida.length;
			setPosicao(orbitaPermitida[indicePosAtual]);
			
			
			if(getPosicaoX() == getXInicial() && getPosicaoY() == getYInicial() ) {
				
				anos++;
			}
			
		}
		
	}
	

}
