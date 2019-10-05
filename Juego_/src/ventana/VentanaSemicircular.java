package ventana;

public class VentanaSemicircular extends Ventana {
	public VentanaSemicircular(int posX,int posY,int cantPaneles){
		super(cantPaneles,posX,posY,false);
}

	@Override
	public boolean verificarInferior() {
		return false;
	}

	@Override
	public boolean puedoPasar() {
		return true;
	}

	@Override
	public boolean puedoBajar() {
		return true;
	}

	@Override
	public boolean puedoSaltar() {
		return true;
	}
}