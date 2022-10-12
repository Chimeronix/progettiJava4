package mobilita;

public class Barca extends AMuscoli{
	private int numeroDiRemi;
	private boolean singoloRemo;
	
	
	
	public Barca(String nome, double costo, int numeroDiRemi, boolean singoloRemo) {
		this.nome = nome;
		this.costo = costo;
		this.numeroDiRemi = numeroDiRemi;
		this.singoloRemo = singoloRemo;
	}
	
	
	
	public String toString() {
		String rappresentazione;
		if(singoloRemo) {
			rappresentazione = "Barca: " + nome + " con remi" + numeroDiRemi;
		} else {
			rappresentazione = "Barca: " + nome + " con remi" + numeroDiRemi + " (due per vogatore)";
		}
		return rappresentazione;
	}



	public int getNumeroDiRemi() {
		return numeroDiRemi;
	}



	public void setNumeroDiRemi(int numeroDiRemi) {
		this.numeroDiRemi = numeroDiRemi;
	}



	public boolean isSingoloRemo() {
		return singoloRemo;
	}



	public void setSingoloRemo(boolean singoloRemo) {
		this.singoloRemo = singoloRemo;
	}
	
	
	
	public int numeroVogatori() {
		int numeroV;
		if(singoloRemo) {
			numeroV = numeroDiRemi;
		} else {
			numeroV = numeroDiRemi/2;
		}
		return numeroV;
	}
}
