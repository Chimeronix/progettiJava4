package mobilita;

public class Terrestre extends AMotore{
	private double velocita;
	
	
	
	public Terrestre() {
		
	}
	
	
	
	public String toString() {
		String rappresentazione = "Veicolo terrestre a motore: " + nome + ", va a " + getCarburante()
				+ "e al massimo percorre "+ velocita + "km in un'ora";
		return rappresentazione;
	}
	
	
	
	public double tempoDiPercorrenza(int distanza) {
		double tempo = distanza/velocita;;	
		return tempo;
	}



	public double getVelocita() {
		return velocita;
	}



	public void setVelocita(double velocita) {
		this.velocita = velocita;
	}
}
