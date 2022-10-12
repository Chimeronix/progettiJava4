package mobilita;

public class Deltaplano extends Volante{
	private int numeroDiPosti;
	
	
	
	public Deltaplano(String nome, double costo, int numeroDiPosti) {
		this.nome = nome;
		this.costo = costo;
		this.numeroDiPosti = numeroDiPosti;
	}
	
	
	
	public String toString() {
		String rappresentazione = "Deltaplano: "+ nome + " ha " + numeroDiPosti + " posti e può portare passeggeri";
		return rappresentazione;
	}
	
	
	
	public boolean accettaPasseggero() {
		boolean accetta;
		if (numeroDiPosti==1) {
			accetta = false;
		}else {
			accetta = true;
		}
		return accetta;
	}



	public int getNumeroDiPosti() {
		return numeroDiPosti;
	}



	public void setNumeroDiPosti(int numeroDiPosti) {
		this.numeroDiPosti = numeroDiPosti;
	}
}
