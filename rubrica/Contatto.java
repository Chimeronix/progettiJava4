package rubrica;

public class Contatto {
	
	public String nome, cognome, numero, dataDiNascita;
	
	public Contatto(String nome, String cognome, String numero, String dataDiNascita) {
		this.nome = nome;
		this.cognome = cognome;
		this.numero = numero;
		this.dataDiNascita = dataDiNascita;
	}
	
	public Contatto(String x) {
		String v[] = x.split(",");
		nome = v[0];
		cognome = v[1];
		numero = v[2];
		dataDiNascita = v[3];
	}
	
	public String toCsv() {
		String rappresentazione;
		rappresentazione = nome + "," + cognome + "," + numero + "," + dataDiNascita;
		return rappresentazione;
	}
	
	public String toString() {
		String rappresentazione;
		rappresentazione = nome + "," + cognome + "," + numero + "," + dataDiNascita;
		return rappresentazione;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(String dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}
}
