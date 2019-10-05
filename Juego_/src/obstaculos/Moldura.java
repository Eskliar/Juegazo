package obstaculos;

public class Moldura extends Obstaculo{
	public boolean puedoPasar() {
		return true;
}
	public boolean puedoSaltar() {
		return false;
	}
	public boolean puedoBajar() {
		return true;
	}
}