package obstaculos;

public class Macetero extends Obstaculo{
	public boolean puedoPasar() {
		return true;
}
	public boolean puedoSaltar() {
		return true;
	}
	public boolean puedoBajar() {
		return false;
	}
}