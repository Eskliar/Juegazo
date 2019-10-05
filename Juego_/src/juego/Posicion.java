package juego;

public class Posicion {

     private int posicionX;
     private int posicionY;
public Posicion(int x, int y){
	posicionX=x;
	posicionY=y;
}
public int getPosicionX() {
	return posicionX;
}
public void setPosicionX(int posicionX) {
	this.posicionX = posicionX;
}
public int getPosicionY() {
	return posicionY;
}
public void setPosicionY(int posicionY) {
	this.posicionY = posicionY;
}
public boolean equals(Object o){
	 boolean result=false;
	 if ((o!=null) && (o instanceof Posicion)){
	 Posicion p=(Posicion)o;
	 if ((p.getPosicionX()==this.posicionX)
	 &&(p.getPosicionX()==this.posicionX)) result=true;
	 }
	 return result; }

}
