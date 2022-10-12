package mobilita;

public class AMuscoli extends MezzoDiTrasporto{
	private String muscoliCoinvolti;
	
	
	
	public AMuscoli() {
		
	}
	
	
	
	public AMuscoli(String nome, double costo, String muscoliCoinvolti) {
		this.nome = nome;
		this.costo = costo;
		this.muscoliCoinvolti = muscoliCoinvolti;
	}
	
	
	
	boolean parteAlta() {
		boolean alta = false;
		if(muscoliCoinvolti == "pettorali" || muscoliCoinvolti == "spalle" || muscoliCoinvolti == "bicipiti" 
				|| muscoliCoinvolti == "tricipiti" || muscoliCoinvolti == "avambraccio") {
			alta = true;
		}
		return alta;
	}
	
	
	
	public String toString() {
		String rappresentazione = "Veicolo a muscoli: " + nome + " " + costo + "(usa" + muscoliCoinvolti + ")";
		return rappresentazione;
	}



	public String getMuscoliCoinvolti() {
		return muscoliCoinvolti;
	}



	public void setMuscoliCoinvolti(String muscoliCoinvolti) {
		this.muscoliCoinvolti = muscoliCoinvolti;
	}
}
