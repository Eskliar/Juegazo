package obstaculos;

public class MolduraMacetero extends Obstaculo {
	public boolean puedoPasar() {
		return true;
}
	public boolean puedoSaltar() {
		return false;
	}
	public boolean puedoBajar() {
		return false;
	}
}
