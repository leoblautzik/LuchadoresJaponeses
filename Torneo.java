package luchadoresJaponeses;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Locale;

public class Torneo {

	private int cantidad;
	private Luchador[] luchadores;
	private int[] dominados;

	public Torneo(String t) throws FileNotFoundException{
		Scanner sc = new Scanner(new File(t));
		sc.useLocale(Locale.ENGLISH);
		this.cantidad=sc.nextInt();
		this.luchadores = new Luchador[cantidad];
		this.dominados = new int[cantidad]; 
		for (int i = 0; i < this.cantidad; i++) 
			this.luchadores[i] = new Luchador(sc.nextInt(),sc.nextInt()) ;

		sc.close();
	}


	public void resolver(){

		for(int i=0;i<cantidad;i++)
			for(int j=i+1;j<cantidad;j++){	
				if(luchadores[i].domina(luchadores[j]))
					dominados[i]++;
				if(luchadores[j].domina(luchadores[i]))
					dominados[j]++;
			}
	}			

	public void mostrarResultados() {
		for(Integer cadaUno: this.dominados){
			System.out.println(cadaUno);
		}
	}

	public void imprimirResultados(String s) throws IOException{

		PrintWriter salida = new PrintWriter(new FileWriter(s)); 


		for(Integer cadaUno: this.dominados){
			salida.println(cadaUno);
		}

		salida.close();
	}
}
