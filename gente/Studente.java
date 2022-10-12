package gente;

public class Studente extends Persona {
	
	private String indirizzoScuola;
	private int classeScuola;
	
	public Studente() {
		
	}
	public String getIndirizzoScuola() {
		return indirizzoScuola;
	}
	public void setIndirizzoScuola(String indirizzoScuola) {
		this.indirizzoScuola = indirizzoScuola;
	}
	public int getClasseScuola() {
		return classeScuola;
	}
	public void setClasseScuola(int classeScuola) {
		this.classeScuola = classeScuola;
	}
	
	public Studente (String nome, String cognome, int annoNascita) {
		this.nome = nome;
		this.cognome = cognome;
		this.annoNascita = annoNascita;
	}
	
	public Studente (String nome, String cognome, String indirizzoScuola, int classeScuola) {
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzoScuola = indirizzoScuola;
		this.classeScuola = classeScuola;
	}
	
	public Studente (String nome, String cognome, String indirizzoScuola) {
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzoScuola = indirizzoScuola;
	}
	
	
	public String toString () {
		String rappresentazione = nome + " " + cognome + " studia: " + indirizzoScuola + " nella classe " + classeScuola;
		return rappresentazione;
		
	}
}
