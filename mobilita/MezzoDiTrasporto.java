package mobilita;

public class MezzoDiTrasporto {
	protected double costo;
	protected String nome;
	
	
	public MezzoDiTrasporto() {
		
	}
	
	
	
	public MezzoDiTrasporto(String nome, double costo) {
		this.nome = nome;
		this.costo = costo;
	}
	
	
	
	public String toString() {
		String rappresentazione = "Mezzo di trasporto: " + nome + " " + costo;
		return rappresentazione;
	}
	
	
	
	public double importoRata(int numeroRate) {
		double prezzoRate = costo/numeroRate;
		return prezzoRate;
	}



	public double getCosto() {
		return costo;
	}



	public void setCosto(double costo) {
		this.costo = costo;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}
