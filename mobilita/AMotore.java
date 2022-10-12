package mobilita;

public class AMotore extends MezzoDiTrasporto{
	private double rumorosita;
	private String carburante;
	
	
	
	public AMotore() {
		
	}
	
	
	
	public AMotore(String nome, double costo, double rumorosita, String carburante) {
		super(nome,costo);
		this.rumorosita = rumorosita;
		this.carburante = carburante;
	}
	
	
	
	public String toString() {
		String rappresentazione = "Mezzo motorizzato: " + nome + "(" + costo + ") " + "che emette " +
								rumorosita + "db di rumore, consuma " + carburante;
		return rappresentazione;
	}
	
	
	
	public boolean possibileCentriAbitati() {
		boolean possibile;
		if (rumorosita>68) {
			possibile = false;
		}else {
			possibile = true;
		}
		
		return possibile;
	}



	public double getRumorosita() {
		return rumorosita;
	}



	public void setRumorosita(double rumorosita) {
		this.rumorosita = rumorosita;
	}



	public String getCarburante() {
		return carburante;
	}



	public void setCarburante(String carburante) {
		this.carburante = carburante;
	}
}
