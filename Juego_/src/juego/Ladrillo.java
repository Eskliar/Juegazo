package juego;

public class Ladrillo {
private Posicion posicion;
private final int limiteY=0;
private Contador contador;
private static int cantllamados=100;
public Ladrillo(int posicionX, int posicionY) {
	posicion=new Posicion(posicionX,posicionY);	
	contador=new Contador(cantllamados);
}
public boolean caer() {
	boolean puedoCaer=false;
	puedoCaer=contador.aumentarContador();
	if(puedoCaer) {
	posicion.setPosicionY(posicion.getPosicionY()-1);
	chocoFelix();
	}
	if(posicion.getPosicionY()==limiteY) {
		return true;     //retorna true si llego al final del edificio.
	}
	return false;
}
public static int getCantllamados() {
	return cantllamados;
}
public static void setCantllamados(int cantllamados) {
	Ladrillo.cantllamados = cantllamados;
}
public Posicion getPosicion() {
	return posicion;
}
public void setPosicion(Posicion posicion) {
	this.posicion = posicion;
}
private void chocoFelix() {
	FelixJr felix=FelixJr.INSTANCE;
	if(felix.getP().equals(posicion)) {
	     felix.setVida();
	}
}
}
