package juego;
import ventana.*;
import edificio.Edificio;

public class Nicelander {
	int timer;
	int seccionActual;
	public Nicelander(){
		timer=60;
		seccionActual=1;
	}
	public void agregarPastel(){
		Edificio edificio=Edificio.INSTANCE;
		Ventana ventana=null;
        ventana=edificio.buscarVentanaCompletamenteRota(seccionActual);
        if(ventana!=null){
        	ventana.agregarPastel();
        }
	}
}
