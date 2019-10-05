package juego;
import java.util.List;
import edificio.*;
import ventana.Ventana;
public class FelixJr {
private int vida;//a
private int puntaje;
private int tiempoInmunidad;
private boolean inmunidad;
private int seccionActual;
private Posicion p;
public static FelixJr INSTANCE=new FelixJr();
private FelixJr() {
	vida=3;
	puntaje=0;
	inmunidad=false;
	seccionActual=1;
	p=new Posicion(0,0);
}
public void resetFelix() {
	INSTANCE=new FelixJr();
}
public void reparar(){
	Edificio edificio=Edificio.INSTANCE;
	edificio.repararVentanaEnPosicion(this.p);
}
private void recogerPastel(){
Edificio edificio=Edificio.INSTANCE;
Ventana ventana=null;
ventana=edificio.buscarVentana(p,seccionActual);
if(ventana!=null){
	puntaje=puntaje+ventana.recogerPastel();
}
}
private void comprobarInmunidad(){
	if(inmunidad){
		tiempoInmunidad--;
		if(tiempoInmunidad==0){
			inmunidad=false;
		}
	}
}
public void mover(Sentido sentido,Pajaro[]pajaros,List<Ladrillo> listaLadrillos) {
	Edificio edificio=Edificio.INSTANCE;
	Posicion posicionAacceder=new Posicion(p.getPosicionX()+4*sentido.getMultiplicadorX(),p.getPosicionY()+4*sentido.getMultiplicadorY());
    boolean puedo=false;
    int i;
	puedo=edificio.puedoPasar(posicionAacceder, sentido,seccionActual); //seccionActual sirve para que felix no se pueda mover a una posicion no valida tanto fuera del edificio como de la seccion
	if(puedo) {
		p.setPosicionX(posicionAacceder.getPosicionX());
		p.setPosicionY(posicionAacceder.getPosicionY());
	}
	if(!inmunidad) {
	for(i=0;i<pajaros.length && (seccionActual!=1);i++) {
		 if(pajaros[i].getPosicion().equals(p)) {         //compruebo si hay un pajaro en esa posicion
			 this.setVida();                        
		 }
	}
	for(i=0;i<listaLadrillos.size();i++) {
		Ladrillo ladrillo=listaLadrillos.get(i);
		if(ladrillo.getPosicion().equals(p)) {
		   this.setVida();
		}
	}
	}
	recogerPastel();
	comprobarInmunidad();
}
//setters y getters
public int getTiempoInmunidad() {
	return tiempoInmunidad;
}
public void setTiempoInmunidad(int tiempoInmunidad) {
	this.tiempoInmunidad = tiempoInmunidad;
}
public int getSeccionActual() {
	return seccionActual;
}
public void setSeccionActual(int seccionActual) {
	this.seccionActual = seccionActual;
}
public int getVida() {
	return vida;
}
public void setVida() {
	vida--;
}
public int getPuntaje() {
	return puntaje;
}
public void setPuntaje(int puntaje) {
	this.puntaje = puntaje;
}
public boolean isInmunidad() {
	return inmunidad;
}
public void setInmunidad(boolean inmunidad) {
	this.inmunidad = inmunidad;
}
public Posicion getP() {
	return p;
}
public void cambiarSeccion(Posicion p) {
	this.p = p;
	seccionActual++;
}
}
