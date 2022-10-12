package calcolatrice;

public class Calcolatrice {
	int a;
	int b;
	int risultato;
	
	
	
	public Calcolatrice (){
		
	}
	




	public int getA() {
		return a;
	}





	public void setA(int a) {
		this.a = a;
	}





	public int getB() {
		return b;
	}





	public void setB(int b) {
		this.b = b;
	}





	public int getRisultato() {
		return risultato;
	}





	public void setRisultato(int risultato) {
		this.risultato = risultato;
	}





	public void somma() {
		risultato = a+b;
		System.out.println("Il risultato della somma è "+risultato+"\n+-+-+-+-+-+-+");
	}
	
	
	
	public void differenza() {
		risultato = a-b;
		System.out.println("Il risultato della differenza è "+risultato+"\n+-+-+-+-+-+-+");
	}
	
	
	
	public void moltiplicazione() {
		risultato = a*b;
		System.out.println("Il risultato della moltiplicazione è "+risultato+"\n+-+-+-+-+-+-+");
	}
	
	
	
	public void divisione() {
		risultato = a/b;
		System.out.println("Il risultato della divisione è "+risultato+"\n+-+-+-+-+-+-+");;
	}
	
	
	
	public String toString () {
		String rappresentazione = "Sono una calcolatrice!";
		return rappresentazione;
	}
}
	