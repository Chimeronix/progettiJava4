package macchinetta;

public class DistributoreAutomatico {
	public double prezzoCaffe;
	public double prezzoCappuccino;
	public double credito;
	public double resto;
	
	public DistributoreAutomatico () {
		
	}

	public double getPrezzoCaffe() {
		return prezzoCaffe;
	}

	public void setPrezzoCaffe(double prezzoCaffe) {
		this.prezzoCaffe = prezzoCaffe;
	}

	public double getPrezzoCappuccino() {
		return prezzoCappuccino;
	}

	public void setPrezzoCappuccino(double prezzoCappuccino) {
		this.prezzoCappuccino = prezzoCappuccino;
	}

	
	public double getCredito() {
		return credito;
	}
	
	public double getResto() {
		return resto;
	}

	public void erogaCaffe() {
		if(credito < prezzoCaffe) {
			System.out.println("Metti più soldi!");
		}else {
			System.out.println("Ritira caffè..");
			credito-=prezzoCaffe;
			System.out.println("Ti rimangono "+credito+" €");
		}
	}
	
	public String toString () {
		String rappresentazione = "Sono un distributore automatico";
		return rappresentazione;
	}
	
	public void erogaCappuccino() {
		if(credito < prezzoCappuccino) {
			System.out.println("Metti più soldi!");
		}else {
			System.out.println("Ritira cappuccino..");
			credito-=prezzoCappuccino;
			System.out.println("Ti rimangono "+credito+" €");
		}
	}
	
	public void inserisciDenaro(double soldiAggiunti) {
		credito += soldiAggiunti;
	}
	
}
