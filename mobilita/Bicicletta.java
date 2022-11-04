package mobilita;

public class Bicicletta extends AMuscoli {
	private int numeroDiRapporti;
	private double peso;
	

	
	public Bicicletta(double costo, double peso) {
		this.costo = costo;
		this.peso = peso;
	}
	
	
	
	public String toString() {
		String rappresentazione;
		if(peso<10) {
			rappresentazione = "Bicicletta: pesa" + peso + "kg" + " costa" + costo + "€";
		} else {
			rappresentazione = "Bicicletta: pesa" + peso + "kg (leggera) costa "+ costo + "€";
		}
		return rappresentazione;
	}
	
	
	
	public boolean leggera() {
		boolean legg;
		if(peso>10) {
			legg = false;
		} else {
			legg = true;
		}
		return legg;
	}



	public int getNumeroDiRapporti() {
		return numeroDiRapporti;
	}



	public void setNumeroDiRapporti(int numeroDiRapporti) {
		this.numeroDiRapporti = numeroDiRapporti;
	}



	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}
}
