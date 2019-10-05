package edificio;
import juego.*;
import ventana.*;
public class Edificio {
	private Seccion secciones[];
	private final int posicionX=0;
	private final int cantSecciones=3;
	public static Edificio INSTANCE=new Edificio();//a
private Edificio() {
	secciones=new Seccion[3];
	int j=0,nSeccion=0;
	secciones[nSeccion]=new Seccion1(posicionX,j);
    for(j=12;j<=24;j=j+12) {
    	nSeccion++;
    	secciones[nSeccion]=new Seccion(posicionX,j);
    }
}
public void reiniciar(){
	INSTANCE=new Edificio();
}
public boolean edificioCompletado() {
	boolean completada=true;
	int i;
	for(i=0;i<cantSecciones;i++) {
		if(!secciones[i].seccionCompletada()) {
			completada=false;
			break;
		}
	}
	return completada;
}
public void repararVentanaEnPosicion(Posicion posVentanaAreparar) {
	int i;
	boolean reparo=false;
	for(i=0;i<cantSecciones&& (!reparo);i++) {
	    reparo=secciones[i].repararVentanaEnPosicion(posVentanaAreparar);
	}
}
public boolean puedoPasar(Posicion posicionAacceder,Sentido sentido,int seccionActual){
	Ventana ventana=null;
	boolean puedo=false;
		ventana=secciones[seccionActual-1].encontrarVentana(posicionAacceder);
		if(ventana!=null){
			switch(sentido) {
			case SALTAR: puedo=ventana.puedoSaltar();
			case BAJAR: puedo=ventana.puedoBajar();
			default: puedo=ventana.puedoPasar();
				
			}
		}
	return puedo; //contempla el caso en el que no hay ventana
}
public Ventana buscarVentana(Posicion posicionAacceder,int seccionActual){
	Ventana ventana=null;
	ventana=secciones[seccionActual-1].encontrarVentana(posicionAacceder);
	return ventana;
}
public Ventana buscarVentanaCompletamenteRota(int seccionActual){
	Ventana ventana=null;
	ventana=secciones[seccionActual-1].buscarVentanaCompletamenteRota();
	return ventana;
}
}
