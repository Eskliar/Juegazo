package edificio;

import ventana.VentanaSemicircular;

public class Seccion1 extends Seccion {

	public Seccion1(int x, int y) {
		super(x, y);
		ventanas[0][2]=new VentanaSemicircular(0,2*dEntreventanas,4);
		ventanas[1][2]=new VentanaSemicircular(1,2*dEntreventanas,8);
	}

}
