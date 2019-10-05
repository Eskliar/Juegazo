package obstaculos;

public class Vacio extends Obstaculo {
	public boolean puedoPasar() {
		return true;
}
	public boolean puedoSaltar() {
		return true;
	}
	public boolean puedoBajar() {
		return true;
	}
}
