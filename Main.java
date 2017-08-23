package luchadoresJaponeses;

import java.io.IOException;

public class Main {
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		Torneo torneo = new Torneo("enunciado.in");
		torneo.resolver();
		torneo.mostrarResultados();
		torneo.imprimirResultados("dominados.out");

	}
}


