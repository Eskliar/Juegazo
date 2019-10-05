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
	int valorLadrillo=Ladrillo.getCantllamados();
	int valorRalphMover=Ralph.getCantLlamadosMover();
	int valorRalphTirar=Ralph.getCantLlamadosTirar();
	valorSeccion=valorSeccion-(valorSeccion*10/100);
	Seccion.setRanNivel(valorSeccion);
	valorVentana=valorVentana-(valorVentana*10/100);
	VentanaNormal.setRanNivel(valorVentana);
    valorPanel=valorPanel-(valorPanel*10/100);
    PanelVidrio.setRanNivel(valorPanel);
    valorLadrillo=valorLadrillo-(valorLadrillo*10/100);
    Ladrillo.setCantllamados(valorLadrillo);
    valorRalphMover=valorRalphMover-(valorRalphMover*10/100);
    valorRalphTirar=valorRalphTirar-(valorRalphTirar*10/100);
    Ralph.setCantLlamadosMover(valorRalphMover);
    Ralph.setCantLlamadosTirar(valorRalphTirar);
	this.nivel++;
}
public int getNivel() {
	return nivel;
}
}
