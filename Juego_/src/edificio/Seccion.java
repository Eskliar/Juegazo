package edificio;
import ventana.*;
import juego.Posicion;
public class Seccion {
protected Ventana ventanas[][];
private Posicion p;
private static int ranNivel=20;
private final int cantC=5;
private final int cantF=3;
protected final int dEntreventanas=4;
private final int maximoVentanasHoja=3;
//pasamos boolean esseccion1 para diferenciarla ya que tiene las ventanas semicirculares
public Seccion(int x,int y) {
	ventanas=new Ventana[cantF][cantC];
	p=new Posicion(x,y);
	int i,j;
		for(i=0;i<cantF;i++) {
			for(j=0;j<cantC;j++) {
				int ran=(int)(Math.random()*ranNivel+1);
				if(ran<maximoVentanasHoja) {
					ventanas[i][j]=new VentanaHoja(x+j*dEntreventanas,y+i*dEntreventanas); //mal
				}
				else{
					ventanas[i][j]=new VentanaNormal(x+j*dEntreventanas,y+i*dEntreventanas);
				}
			}
		}
		//if(esSeccion1) {
		//	ventanas[0][2]=new VentanaSemicircular(0,2*dEntreventanas,4);
			//ventanas[1][2]=new VentanaSemicircular(1,2*dEntreventanas,8);
	
}
public Posicion getP() {
	return p;
}
public void setP(Posicion p) {
	this.p = p;
}
public static int getRanNivel() {
	return ranNivel;
}
public static void setRanNivel(int ranNivel) {
	Seccion.ranNivel = ranNivel;
}
public boolean seccionCompletada() {
	boolean completada=true;
	int i,j;
	for(i=0;i<cantF;i++) {
		for(j=0;j<cantC;j++) {
			if(!ventanas[i][j].isArreglada()) {
				completada=false;
			}
		}
	}
	return completada;
}
public boolean repararVentanaEnPosicion(Posicion posicionVentanaAreparar) {
	int i,j;
	boolean reparo=false;
	for(i=0;i<cantF;i++) {
		for(j=0;j<cantC;j++) {
			if(ventanas[i][j].getPosicion().equals(posicionVentanaAreparar)) {
				ventanas[i][j].arreglarPanel();
				reparo=true;
				return reparo;
			}
		}
	}
	return reparo;
}
public Ventana encontrarVentana(Posicion posVentana) {
    Ventana ventana=null;
	int i,j;
	for(i=0;i<cantF;i++) {
		for(j=0;j<cantC;j++) {
			if(ventanas[i][j].getPosicion().equals(posVentana)) {
				ventana=ventanas[i][j];
				return ventana;
			}
		}
	}
	return  ventana;
}
public Ventana buscarVentanaCompletamenteRota(){
    Ventana ventana=null;
    int i,j;
    for(i=0;i<cantF;i++){
    	for(j=0;j<cantC;j++){
    		if(ventanas[i][j].verificarInferior()){
    			return ventanas[i][j];
    		}
    	}
    }
    return ventana;
}
/*public boolean puedo(Posicion posicionVentanaAacceder,int opcion) {
	boolean puedo=false;
	int i,j;
	for(i=0;i<cantF;i++) {
		for(j=0;j<cantC;j++) {
			if(ventanas[i][j].getPosicion().equals(posicionVentanaAacceder)) {
				if(opcion==1) {
				puedo=ventanas[i][j].puedoBajar();
				}else {
					if(opcion==2) {
						puedo=ventanas[i][j].puedoPasar();
					}else {
						puedo=ventanas[i][j].puedoSaltar();
					}
				}
				return puedo;
			}
		}
	}
	return puedo;
}*/
}
