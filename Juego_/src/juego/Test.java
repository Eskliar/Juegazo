package juego;

public class Test {

	public static void main(String[] args) {
		Juego juego=Juego.INSTANCE;
		boolean termino=false;
		int cantMartillasos=4;
		int i,ran;
		Sentido sentido;
        while(!termino) {
        	ran=(int)(Math.random()*4+1);
        	switch(ran) {
        	case 1: sentido=Sentido.MOVERDERECHA;break;
        	case 2: sentido=Sentido.MOVERIZQUIERDA;break;
        	case 3: sentido=Sentido.SALTAR;break;
        	default: sentido=Sentido.BAJAR;break;
        	}
        	juego.moverFelix(sentido);
        	for(i=0;i<cantMartillasos;i++) {
        	juego.martillarFelix();
        	}
        	termino=juego.Pasarturno();
        }
	}

}
