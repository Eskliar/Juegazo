package ventana;

public class PanelVidrio {
private int martilleos;
private static int ranNivel=30;
private Estado estado;
private final int maximoVentanaCM=5;
private final int maximoVentanaR=10;
public PanelVidrio(Estado e,int martilleos) {
	this.estado=e;
	this.martilleos=martilleos;
}
public static int getRanNivel() {
	return ranNivel;
}
public static void setRanNivel(int ranNivel) {
	PanelVidrio.ranNivel = ranNivel;
}
public PanelVidrio(boolean esHoja) {
   int ran=(int) (Math.random()*ranNivel+1);
   if(!esHoja) {
   if(ran<=maximoVentanaCM){
	  estado=Estado.CM;
    }
   else{
	   if(ran>maximoVentanaCM && ran<=maximoVentanaR){
		   estado=Estado.R;
		   
	   }
	else{
		   estado=Estado.S;
	   }
   }
   martilleos=ran;
   }else {
	   estado=Estado.S;
	   martilleos=2;
   }
}
public int getMartilleos() {
	return martilleos;
}
public void setMartilleos(int martilleos) {
	this.martilleos = martilleos;
}
public Estado getEstado() {
	return estado;
}
public void setEstado(Estado estado) {
	this.estado = estado;
}
public void serArreglado() {
	if(martilleos==0) {
		martilleos++;
		estado=Estado.R;
	}
	else {
		if(martilleos==1) {
			martilleos++;
			estado=Estado.S;
		}
	}
}
}
