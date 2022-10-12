package gente;

public class ProvaIndirizzo {

	public static void main(String[] args) {
		
	Indirizzo nuovoIndirizzo = new Indirizzo();
	
	nuovoIndirizzo.setVia("Via A. Gramsci");
	nuovoIndirizzo.setCivico(5);
	nuovoIndirizzo.setCitta("Sigillo");
	nuovoIndirizzo.setProvincia("pg");
	nuovoIndirizzo.setCap("06028");
	System.out.println(nuovoIndirizzo);
	
	}
}
