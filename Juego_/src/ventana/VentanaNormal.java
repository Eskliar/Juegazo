package ventana;
import juego.Pastel;
import obstaculos.*;
public class VentanaNormal extends Ventana {
	Obstaculo obs;
	Pastel pastel=null;
	private static int ranNivel=10;
	//valor va a depender del nivel para hacer el random
	public VentanaNormal(int posX,int posY) {
			super(2, posX, posY,false);
			int ran=(int)(Math.random()*ranNivel+1);
			if(ran==0) {
				obs=new MolduraMacetero();
			}
			else {
				if(ran==1) {
					obs=new Moldura();
				}
				else {
					if(ran==2) {
						obs=new Macetero();
					}
					else {
						obs= new Vacio();
					}
				}
			}
		}
	public static int getRanNivel() {
		return ranNivel;
	}
	public static void setRanNivel(int ranNivel) {
		VentanaNormal.ranNivel = ranNivel;
	}
	//retorna true si esta completamente rota la inferior;
	public boolean verificarInferior() {
		PanelVidrio[] p;
		p=super.getPaneles();
		if(p[0].getMartilleos()==0 && pastel!=null) {
			return true;
		}
		return false;
	}
	public void agregarPastel(){
		pastel=new Pastel();
	}
	public int recogerPastel(){
		if(pastel!=null){
			pastel=null;
			return pastel.getPuntaje();
		}
		return 0;
	}
	public boolean puedoPasar() {
		return obs.puedoPasar();
	}
	public boolean puedoBajar() {
		return obs.puedoBajar();
	}
	public boolean puedoSaltar() {
		return obs.puedoSaltar();
	}
	}
