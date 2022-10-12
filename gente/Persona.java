package gente;

import java.time.Year;

public class Persona extends Object {
	protected String nome;
	protected String cognome;
	protected int annoNascita;
	
	public Persona() {
	}
	
	public Persona(String nome, String y) {
		this.nome = nome;
		cognome = y;
		annoNascita = 2000;
	}
	
	public Persona(String nome, String cognome, int annoNascita) {
		this.nome = nome;
		this.cognome = cognome;
		this.annoNascita = annoNascita;
	}
	
	/*
	 * creare un metodo "quantiAnni" che dato un certo anno
	 * mi dice quanti anni ha la Persona
	 */
	public int quantiAnni() {
	    int annoAttuale = Year.now().getValue();
		return annoAttuale - annoNascita;
	}
	
	public boolean piuVecchioDi(Persona altro) {
		return annoNascita > altro.annoNascita;
	}

	public String toString() {
		String rappresentazione;
		rappresentazione = "Mi chiamo "+nome;
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

	public int getAnnoNascita() {
		return annoNascita;
	}

	public void setAnnoNascita(int annoNascita) {
		this.annoNascita = annoNascita;
	}
	
}
