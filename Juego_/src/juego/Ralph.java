package juego;

import java.util.ArrayList;
import java.util.List;

public class Ralph {
private List<Ladrillo> listaLadrillos;
public static Ralph INSTANCE=new Ralph();
private final int maximoX=16;
private final int minimoX=0;
private int cantLadrillos;
private Posicion posicion;
private final int posicionYinicio=10;
private static  int cantLlamadosMover=100; //revisar valor
private static int cantLlamadosTirar=100; //revisar valor
private Contador contadorMover;
private Contador contadorTirarLadrillos;
private Ralph() {
	listaLadrillos=new ArrayList<Ladrillo>();
	cantLadrillos=40;
	posicion=new Posicion(0,posicionYinicio);
	contadorMover=new Contador(cantLlamadosMover);
	contadorTirarLadrillos=new Contador(cantLlamadosTirar);
}
public static int getCantLlamadosMover() {
	return cantLlamadosMover;
}
public static void setCantLlamadosMover(int cantLlamadosMover) {
	Ralph.cantLlamadosMover = cantLlamadosMover;
}
public static int getCantLlamadosTirar() {
	return cantLlamadosTirar;
}
public static void setCantLlamadosTirar(int cantLlamadosTirar) {
	Ralph.cantLlamadosTirar = cantLlamadosTirar;
}
public void reiniciar() {
	INSTANCE=new Ralph();
}
public void TirarLadrillos() {
	boolean puedoTirarLadrillo=contadorTirarLadrillos.aumentarContador();
	if(puedoTirarLadrillo) {
	if(cantLadrillos!=0) {
	Ladrillo ladrillo=new Ladrillo(posicion.getPosicionX()-1,posicion.getPosicionY()-1); //hago que el ladrillo esté una posicion más abajo de ralph(recordar que la distancia entre ventanas es 4 y ralph está entre medio).
	listaLadrillos.add(ladrillo);
	cantLadrillos--;
	}
	}
}
public Posicion getPosicion() {
	return posicion;
}
public void setPosicion(Posicion posicion) {
	this.posicion = posicion;
}
public void mover() {
		boolean puedoMover = contadorMover.aumentarContador();
		if (puedoMover) {
			int ran = (int) (Math.random() * 2 + 1); // dos posibles valores en 1 mueve izquierda en 2 mueve derecha
			Sentido sentido;
			if (ran == 1) {
				if (posicion.getPosicionX() != minimoX) {
					sentido = Sentido.MOVERIZQUIERDA;
					posicion.setPosicionX(posicion.getPosicionX() + sentido.getMultiplicadorX());
				} else {
					if (posicion.getPosicionX() != maximoX) {
						sentido = Sentido.MOVERDERECHA;
						posicion.setPosicionX(posicion.getPosicionX() + sentido.getMultiplicadorX());
					}
				}
			}
		}
	}
public void cambiarSeccion() {
	posicion.setPosicionY(posicion.getPosicionY()+posicionYinicio+2); //2 por la distancia que tiene entre ventana
}
public List<Ladrillo> getListaLadrillos() {
	return listaLadrillos;
}
public void setListaLadrillos(List<Ladrillo> listaLadrillos) {
	this.listaLadrillos = listaLadrillos;
}
public void CaerLadrillos() {
	int i=0;
	Ladrillo ladrillo;
	for(i=0;i<listaLadrillos.size();i++) {
		ladrillo=listaLadrillos.get(i);
		ladrillo.caer();
	}
}
}
