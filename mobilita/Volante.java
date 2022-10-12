package mobilita;

public class Volante extends AMotore{
	private double quotaMassima = 2400;
	
	
	
	public Volante() {
		
	}
	
	
	
	public Volante(String nome, double costo) {
		this.nome = nome;
		this.costo = costo;
	}
	
	
	
	public String toString() {
		String rappresentazione = "Mezzo volante: " + nome + "(" + costo + "€) vola fino a " + quotaMassima + "metri di quota";
		return rappresentazione;
	}
	
	
	
	public boolean isNecessariaPressurizzazione() {
		boolean necessaria;
		if(quotaMassima<3000) {
			necessaria = false;
		}else {
			necessaria = true;
		}
		return necessaria;
	}



	public double getQuotaMassima() {
		return quotaMassima;
	}



	public void setQuotaMassima(double quotaMassima) {
		this.quotaMassima = quotaMassima;
	}
}
