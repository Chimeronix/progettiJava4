package mobilita;

public class Skateboard extends AMuscoli{
	private int lunghezza = 60;
	
	
	
	public Skateboard(String nome, double costo) {
		this.nome = nome;
		this.costo = costo;
	}
	
	
	
	public Skateboard(String nome, double costo, int lunghezza) {
		this.nome = nome;
		this.costo = costo;
		this.lunghezza = lunghezza;
	}
	
	
	
	public String toString() {
		String rappresentazione = "Skateboard" + nome + ": lungo" + lunghezza + "cm costa" + costo + "€";
		return rappresentazione;
	}
	
	
	
	public boolean longboard() {
		boolean longb;
		
		if(lunghezza<80) {
			longb = false;
		}else {
			longb = true;
		}
		
		if(longb) {
			nome = "longboard";
		}
		return longb;
	}



	public int getLunghezza() {
		return lunghezza;
	}



	public void setLunghezza(int lunghezza) {
		this.lunghezza = lunghezza;
	}
}
