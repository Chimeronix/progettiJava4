package mobilita;

public class Motocicletta extends Terrestre {
	private double cilindrata;
	private int numeroPosti;
	
	public Motocicletta(String nome, double costo, double cilindrata) {
		this.nome = nome;
		this.costo = costo;
		this.cilindrata = cilindrata;
	}
	
	
	
	public String toString() {
		String rappresentazione = "Motocicletta:" + nome;
		return rappresentazione;
	}
	
	
	
	public boolean puoTrasportare(int persone) {
		boolean puo;
		if (numeroPosti<persone) {
			puo = false;
		} else {
			puo = true;
		}
		return puo;
	}



	public double getCilindrata() {
		return cilindrata;
	}



	public void setCilindrata(double cilindrata) {
		this.cilindrata = cilindrata;
	}



	public int getNumeroPosti() {
		return numeroPosti;
	}



	public void setNumeroPosti(int numeroPosti) {
		this.numeroPosti = numeroPosti;
	}
}
