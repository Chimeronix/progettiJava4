package mobilita;

public class Motoslitta extends Terrestre{
	private double temperaturaMinima = -20;
	
	
	
	public Motoslitta(String nome, double costo, double velocita) {
		this.nome = nome;
		this.costo = costo;
		setVelocita(velocita);
	}
	
	
	
	public String toString() {
		String rappresentazione = nome + ":" + "motoslitta di" + " funziona fino a " + temperaturaMinima + "°C";
		return rappresentazione;
	}


	
	public boolean puoFunzionare(int temp) {
		boolean puo;
		
		if(temp < temperaturaMinima) {
			puo = false;
		}else {
			puo = true;
		}
		
		return puo;
	}

	public double getTemperaturaMinima() {
		return temperaturaMinima;
	}



	public void setTemperaturaMinima(double temperaturaMinima) {
		this.temperaturaMinima = temperaturaMinima;
	}
}
