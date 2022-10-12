package gente;


public class ProvaPersona {

	public static void main(String[] args) {
		Persona edoardo;
		edoardo = new Persona();
		edoardo.setNome("Edoardo");
		edoardo.setCognome("Panfili");
		edoardo.setAnnoNascita(1972);
		
		Persona simone;
		simone = new Persona("Simone", "Baldinelli");
		simone.setAnnoNascita(2008);

		System.out.println(edoardo.toString());
		System.out.println(simone.toString());
		
		System.out.println(simone.piuVecchioDi(edoardo));
		System.out.println(edoardo.piuVecchioDi(simone));

	}

}