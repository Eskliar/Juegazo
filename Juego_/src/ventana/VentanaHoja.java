package ventana;

public class VentanaHoja extends Ventana {
	//true cuando esta activada
	boolean hoja;
public VentanaHoja(int posX,int posY){
	super(2,posX,posY,true);
   int ran=(int)Math.random()*2+1;
   if(ran==1) {
	   hoja=false;
   }else {
	   hoja=true;
   }
}

public boolean verificarInferior() {
	return false;
}
public boolean puedoPasar() {
	if(hoja) {
	return false;
	}
	return true;
}
public boolean puedoBajar() {
	return true;
}
public boolean puedoSaltar() {
	return true;
}
}
