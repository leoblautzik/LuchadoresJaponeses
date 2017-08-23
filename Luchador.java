package luchadoresJaponeses;

public class Luchador {

	static final Boolean TRUE = true;
	static final Boolean FALSE = false;
	
	private Integer peso;
	private Integer altura;
	
	public Luchador(Integer peso, Integer altura){
		this.peso=peso;
		this.altura=altura;
	}

	public Boolean domina(Luchador posibleContrincante){
		if(this.peso>posibleContrincante.peso && this.altura>posibleContrincante.altura)
			return TRUE;
		if(this.peso.equals(posibleContrincante.peso) && this.altura>posibleContrincante.altura)
			return TRUE;	
		if(this.peso>posibleContrincante.peso && this.altura.equals(posibleContrincante.altura))
			return TRUE;	
		return FALSE;
	}
                 
	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public Integer getAltura() {
		return altura;
	}

	public void setAltura(Integer altura) {
		this.altura = altura;
	}

}

