package macchinetta;

public class UtilizzatoreMacchinette {

	public static void main(String[] args) {
		
		DistributoreAutomatico corridoio = new DistributoreAutomatico();
		DistributoreAutomatico atrio = new DistributoreAutomatico();
		
		corridoio.setPrezzoCaffe(0.6);
		corridoio.setPrezzoCappuccino(0.8);
		
		atrio.setPrezzoCaffe(0.7);
		atrio.setPrezzoCappuccino(1.0);	
		
		System.out.println("Provo a chiedere caffè senza soldi");
		corridoio.erogaCaffe();
		
		System.out.println("\nCarico un po' di soldi poi chiedo due caffè");
		corridoio.inserisciDenaro(0.5);
		corridoio.inserisciDenaro(0.5);
		corridoio.erogaCaffe();
		corridoio.erogaCaffe();
		
		System.out.println("\nInserisco altri soldi e poi chiedo cappuccino");
		corridoio.inserisciDenaro(0.5);
		corridoio.erogaCappuccino();
		
		System.out.println("\nGuardo come è messa la macchinetta dell'atrio");
		System.out.println(atrio);
		System.out.println(atrio.getCredito());
		
		System.out.println("\nInserisco strane monete e poi chiedo caffè");
		atrio.inserisciDenaro(0.51);
		atrio.inserisciDenaro(0.57);
		atrio.erogaCaffe();
	}
}