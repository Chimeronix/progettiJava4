package mobilita;

public class Automobile extends Terrestre {
	private String targa;
	private int numeroPorte;
	
	
	
	public Automobile(String nome, double costo, int numeroPorte) {
		this.nome = nome;
		this.costo = costo;
		this.numeroPorte = numeroPorte;
	}
	
	
	
	public String toString() {
		String rappresentazione = "Automobile: " + nome + " [" + targa + "]";
		return rappresentazione;
	}



	public String getTarga() {
		return targa;
	}



	public void setTarga(String targa) {
		this.targa = targa;
	}



	public int getNumeroPorte() {
		return numeroPorte;
	}



	public void setNumeroPorte(int numeroPorte) {
		this.numeroPorte = numeroPorte;
	}
}
