package juego;

public class Pajaro {
private int movimientos; //variable que cuenta la cantantidad de movimientos que hizo el pajaro
private Sentido sentido;
private Posicion posicion;
private final int maximoX=16;
public Pajaro(Posicion p) {
	posicion=new Posicion(p.getPosicionX(),p.getPosicionY());
	movimientos=0;
	sentido=Sentido.MOVERDERECHA;
}
public Posicion getPosicion() {
	return posicion;
}
public void setPosicion(Posicion posicion) {
	this.posicion = posicion;
}
public void mover() {
if(movimientos==maximoX) {
	movimientos=0;
	if(sentido==Sentido.MOVERDERECHA) {
		sentido=Sentido.MOVERIZQUIERDA;
	}else {
		sentido=Sentido.MOVERDERECHA;
	}
}
posicion.setPosicionX(posicion.getPosicionX()+sentido.getMultiplicadorX());
movimientos++;
chocoFelix();
}
private void chocoFelix() {
	FelixJr felix=FelixJr.INSTANCE;
	if(felix.getP().equals(posicion)) {
		felix.setVida();
	}
}
}
