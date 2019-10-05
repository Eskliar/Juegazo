package ventana;
import juego.*;
public abstract class Ventana {
	private boolean arreglada;
	private PanelVidrio[] paneles;
	private Posicion posicion;
	public Ventana(int cantPaneles,int posX,int posY,boolean esHoja){
		paneles=new PanelVidrio[cantPaneles];
		int i;
		for(i=0;i<cantPaneles;i++){
			paneles[i]=new PanelVidrio(esHoja);
		}
		posicion=new Posicion(posX,posY);
	    arreglada=true;
		for(i=0;i<paneles.length;i++) {
			if(paneles[i].getMartilleos()!=2) {
				arreglada=false;
				break;
			}
		}
	}
	public void arreglarPanel() {
		int i;
		if(!arreglada) {
		   for(i=0;i<paneles.length;i++) {
			  if(paneles[i].getMartilleos()!=2) {
				  paneles[i].serArreglado();
				  break;
			  }
		   }
		   if(paneles[paneles.length-1].getMartilleos()==2) {
			   setArreglada(true);
		   }
		}
	}
	public void agregarPastel(){
	}
	public int recogerPastel(){
		return 0;
	}
	public abstract boolean verificarInferior();
	public abstract boolean puedoPasar();
	public abstract boolean puedoBajar();
	public abstract boolean puedoSaltar();
	public boolean isArreglada() {
		return arreglada;
	}
	private void setArreglada(boolean arreglada) {
		this.arreglada = arreglada;
	}
	public PanelVidrio[] getPaneles() {
		return paneles;
	}
	public void setPaneles(PanelVidrio[] paneles) {
		this.paneles = paneles;
	}
	public Posicion getPosicion() {
		return posicion;
	}
	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}
}
