package luchadoresJaponeses;

import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Luchador> luchadores = new ArrayList<Luchador>();
		Luchador luchador1 = new Luchador(399,1999);
		Luchador luchador2 = new Luchador(320,1500);
		Luchador luchador3 = new Luchador(299,1580);
		Luchador luchador4 = new Luchador(330,1690);
		Luchador luchador5 = new Luchador(330,1540);
		Luchador luchador6 = new Luchador(339,1500);
		Luchador luchador7 = new Luchador(298,1700);
		Luchador luchador8 = new Luchador(344,1570);
		Luchador luchador9 = new Luchador(276,1678);
		Luchador luchador10 = new Luchador(400,2000);

		luchadores.add(luchador1);
		luchadores.add(luchador2);
		luchadores.add(luchador3);
		luchadores.add(luchador4);
		luchadores.add(luchador5);
		luchadores.add(luchador6);
		luchadores.add(luchador7);
		luchadores.add(luchador8);
		luchadores.add(luchador9);
		luchadores.add(luchador10);


		Torneo torneo = new Torneo(luchadores);
		
		//torneo.setParticipantes(luchadores);

		torneo.predecirDominantes();

		torneo.imprimirResultados();

	}

		

}


