package luchadoresJaponeses;

import java.util.*;

public class Torneo {
	private ArrayList<Luchador> participantes;
	private ArrayList<Integer> resultados;
	
	public Torneo(ArrayList<Luchador> participantes){
		setParticipantes(participantes);
	}
		
	public void predecirDominantes(){
		ArrayList<Integer> prediccionDominantes = new ArrayList<Integer>();
		
		for(Luchador luchador: this.participantes){
			Integer contador = 0;
			for(Luchador contrincante : this.participantes){	
				if(luchador.domina(contrincante).equals(true)){
					contador++;
				}
			}
			prediccionDominantes.add(contador);
		}
		
		setListado(prediccionDominantes);
				
	}
	public ArrayList<Integer> getListado() {
		return resultados;
	}
	public void setListado(ArrayList<Integer> listado) {
		this.resultados = listado;
	}
	public ArrayList<Luchador> getParticipantes() {
		return participantes;
	}
	public void setParticipantes(ArrayList<Luchador> participantes) {
		ArrayList<Luchador> aux = new ArrayList<Luchador>();
				
		for(Luchador cadaUno:participantes){
			Luchador luchadorAux = new Luchador(cadaUno.getPeso(),cadaUno.getAltura());
			aux.add(luchadorAux);
		}
				
		this.participantes=aux;
	}
		
		public void imprimirResultados() {
		for(Integer dominados: this.getListado()){
			System.out.println(dominados.toString());
		}
	}
	
}
