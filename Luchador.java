package luchadoresJaponeses;

public class Luchador {

	static final Boolean TRUE = true;
	static final Boolean FALSE = false;

	private Integer peso;
	private Integer altura;

	public Luchador(Integer peso, Integer altura){
		setPeso(peso);
		setAltura(altura);

		//this.peso=peso;
		//this.altura=altura;
	}

	public Boolean domina(Luchador l){
		if(this.peso>l.peso && this.altura>l.altura)
			return TRUE;
		if(this.peso.equals(l.peso) && this.altura>l.altura)
			return TRUE;	
		if(this.peso>l.peso && this.altura.equals(l.altura))
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

