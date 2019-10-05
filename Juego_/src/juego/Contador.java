package juego;

public class Contador {
private int contador;
private int limite;
public Contador(int limite) {
	contador=0;
	this.limite=limite;
}
public int getContador() {
	return contador;
}
public boolean aumentarContador() {
	contador++;
	if(contador==limite) {
		contador=0;
		return true;
	}
	return false;
}
}
