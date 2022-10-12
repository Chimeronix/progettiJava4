package mobilita;

public class Aereo extends Volante{
	private boolean reazione;
	private int distanzaMassima;
	
	
	
	public Aereo(String nome) {
		this.nome = nome;
	}
	
	
	
	public String toString() {
		String rappresentazione = "Aereo: " + nome + "percorrenza massima" + distanzaMassima + "km";
		return rappresentazione;
	}
	
	
	
	public boolean puoraggiungere(int dist) {
		boolean puo;
		if (dist>distanzaMassima) {
			puo = false;
		}else {
			puo = true;
		}
		return puo;
	}



	public boolean isReazione() {
		return reazione;
	}



	public void setReazione(boolean reazione) {
		this.reazione = reazione;
	}



	public int getDistanzaMassima() {
		return distanzaMassima;
	}



	public void setDistanzaMassima(int distanzaMassima) {
		this.distanzaMassima = distanzaMassima;
	}
}
