package juego;
public enum Sentido {
	MOVERIZQUIERDA(-1,0),
	MOVERDERECHA(1,0),
	SALTAR(0,1),
	BAJAR(0,-1);
	private int multiplicadorX;
	private int multiplicadorY;
    Sentido(int multiplicadorX, int multiplicadorY){
	   this.multiplicadorX=multiplicadorX;
	   this.multiplicadorY=multiplicadorY;
}
	public int getMultiplicadorX() {
		return multiplicadorX;
	}
	public void setMultiplicadorX(int multiplicadorX) {
		this.multiplicadorX = multiplicadorX;
	}
	public int getMultiplicadorY() {
		return multiplicadorY;
	}
	public void setMultiplicadorY(int multiplicadorY) {
		this.multiplicadorY = multiplicadorY;
	}
}