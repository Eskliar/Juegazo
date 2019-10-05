package juego;
import edificio.*;
import ventana.*;
public class Nivel {
private int nivel;
public Nivel() {
	nivel=1;
}
public void modificarNivel() {
	int valorSeccion=Seccion.getRanNivel();
	int valorVentana=VentanaNormal.getRanNivel();
	int valorPanel=	PanelVidrio.getRanNivel();
	valorSeccion=valorSeccion-(valorSeccion*10/100);
	Seccion.setRanNivel(valorSeccion);
	valorVentana=valorVentana-(valorVentana*10/100);
	VentanaNormal.setRanNivel(valorVentana);
    valorPanel=valorPanel-(valorPanel*10/100);
    PanelVidrio.setRanNivel(valorPanel);
	this.nivel++;
}
public int getNivel() {
	return nivel;
}
public void setNivel(int nivel) {
	this.nivel = nivel;
}
}
