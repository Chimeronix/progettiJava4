package gente;

public class Indirizzo {
	String citta;
	String via;
	int civico;
	String cap;
	String provincia;
	
	public Indirizzo() {
		
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public int getCivico() {
		return civico;
	}

	public void setCivico(int civico) {
		if(civico > 1000) {
			civico = 0;
		}
		this.civico = civico;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		char cProv[] = provincia.toCharArray();
		if (cProv.length!=2) {
			provincia = "??";
		}
		this.provincia = provincia.toUpperCase();
	}
	
	public String toString() {
		String rappresentazione;
		rappresentazione = citta + " in " + via + ", " + civico + " con provincia " + provincia + " - " + cap;
		return rappresentazione;
	}
	
}