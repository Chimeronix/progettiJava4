package memoria.LeggiScrivi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class LeggiScrivi extends Application {

	TextField txtfVuota = new TextField();
	
	public void start(Stage primaryStage) {
		Button bLeggi = new Button("Leggi");
		Button bScrivi = new Button("Scrivi");
		
		bLeggi.setOnAction(e -> funzioneLeggi());
		bScrivi.setOnAction(e -> funzioneScrivi());
		
		GridPane griglia = new GridPane();
		griglia.setPadding(new Insets(10, 10, 10, 10));
		griglia.setHgap(20); 
		griglia.setVgap(40);
			
		griglia.add(bLeggi, 0, 0);
		griglia.add(bScrivi, 2, 0);
		
		griglia.add(txtfVuota, 1, 0);

		Scene scena = new Scene(griglia);

		primaryStage.setTitle("Leggi Scrivi");
		primaryStage.setScene(scena);
		primaryStage.show();
	}
	

	private void funzioneLeggi(){
		FileReader flussoCaratteri;
		try {
			flussoCaratteri = new FileReader("C:\\Users\\alexandrobrugnoni\\Desktop\\memoria.txt");
			BufferedReader lettoreDiRighe = new BufferedReader(flussoCaratteri);
			String testoLetto;
			testoLetto = lettoreDiRighe.readLine();
			txtfVuota.setText(testoLetto);
			lettoreDiRighe.close();
			flussoCaratteri.close();
		} catch (FileNotFoundException e1) {
			System.out.println("File non trovato");
		} catch (IOException e2) {
			System.out.println("Errore nella lettura");
		}
	}
	
	
	private void funzioneScrivi() {
		String testo = txtfVuota.getText();
		FileWriter fwFileMemoria;
		try {
			fwFileMemoria = new FileWriter("C:\\Users\\alexandrobrugnoni\\Desktop\\memoria.txt");
			fwFileMemoria.write(testo+"\n");
			fwFileMemoria.close();
		} catch (IOException e) {
			System.out.println("Errore nella scrittura");;
		}
	}
	

	public static void main(String[] args) {
		launch(args);
	}
}