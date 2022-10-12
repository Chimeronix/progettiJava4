package calcolatrice;

public class ProvaCalcolatrice {
	public static void main(String[] args) {
		
		Calcolatrice calc = new Calcolatrice();
		
		System.out.println(calc+"\n");
		calc.setA(10);
		calc.setB(5);
		
		calc.somma();
		calc.differenza();
		calc.moltiplicazione();
		calc.divisione();
	}
}
