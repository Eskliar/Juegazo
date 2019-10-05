package juego;

public class Pajaro {
private int movimientos; //variable que cuenta la cantantidad de movimientos que hizo el pajaro
private Sentido sentido;
private Posicion posicion;
private final int maximoX=16;
private final int cantLlamados=10;
private Contador contadorMover;
public Pajaro(int posicionX,int posicionY) {
	posicion=new Posicion(posicionX,posicionY);
	movimientos=0;
	sentido=Sentido.MOVERDERECHA;
	contadorMover=new Contador(cantLlamados);
}
public Posicion getPosicion() {
	return posicion;
}
public void setPosicion(Posicion posicion) {
	this.posicion = posicion;
}
public void mover() {
	if(contadorMover.aumentarContador()) {
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
}
private void chocoFelix() {
	FelixJr felix=FelixJr.INSTANCE;
	if(felix.getP().equals(posicion)) {
		felix.setVida();
	}
}
}
