package juego;
import edificio.Edificio;
public class Juego {
private Edificio edificio;
private FelixJr felix;
private Ralph ralph;
private final int cantFor=100; 
private Pajaro[] pajaro;
private Nivel nivel=new Nivel();
private int seccionActual;
public static Juego INSTANCE=new Juego();
private Juego() {
	int i;
	edificio=Edificio.INSTANCE;
	felix=FelixJr.INSTANCE;
	ralph=Ralph.INSTANCE;
	seccionActual=1;
	pajaro=new Pajaro[2];
	for(i=0;i<2;i++) {
		Posicion seccionPajaro=edificio.posicionSeccion(i+1);
		pajaro[i]=new Pajaro(seccionPajaro.getPosicionX(),seccionPajaro.getPosicionY()+4);
	}
}
public boolean Pasarturno() {
	int i;
	if(felix.getVida()!=0) {
		if(edificio.edificioCompletado()) {
			System.out.println("Usted a completado un nivel");
			nivel.modificarNivel();
			if(nivel.getNivel()!=10) {
				edificio.reiniciar();
				felix.resetFelix();
				ralph.reiniciar();
			}else {
				return true;
			}
		}else {
			if(edificio.seccionCompletada(seccionActual)) {
				seccionActual++;
				felix.cambiarSeccion(edificio.posicionSeccion(seccionActual));
				ralph.cambiarSeccion();
				System.out.println("Paso de seccion");
			}else {
				for(i=0;i<cantFor;i++) {
					pajaro[0].mover();
					pajaro[1].mover();
					ralph.mover();
					ralph.TirarLadrillos();
					ralph.CaerLadrillos();
				}
			}
		}
	}else {
		System.out.println("Usted perdió");
		return true;
	}
	return false;
}
public void moverFelix(Sentido sentido) {
	felix.mover(sentido, pajaro, ralph.getListaLadrillos());
}
public void martillarFelix() {
	felix.reparar();
}
}
