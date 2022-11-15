package comuni;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Comuni extends Application {
	
	// Spaziatura fissa -> csv
	// Prima riga di intestazione
	// Codice istat, comune, provincia, cap, codice catastale
	
	TextField txtfRiga = new TextField();
	
	public void start(Stage primaryStage) {
		Button bConversione = new Button("Converti");
		
		bConversione.setOnAction(e -> funzioneConversione());
		
		BorderPane pannello = new BorderPane();
		pannello.setCenter(bConversione);
		bConversione.setMaxWidth(Integer.MAX_VALUE);

		Scene scena = new Scene(pannello, 300, 300);

		primaryStage.setTitle("Comuni");
		primaryStage.setScene(scena);
		primaryStage.show();
	}
	

	private void funzioneConversione(){
		try {
			FileReader flussoCaratteri = new FileReader("C:\\Users\\alexandrobrugnoni\\Desktop\\comuni.txt");
			BufferedReader lettoreDiRighe = new BufferedReader(flussoCaratteri);
			
			FileOutputStream fileOp = new FileOutputStream("C:\\Users\\alexandrobrugnoni\\Desktop\\comuni.csv");
			OutputStreamWriter flussoCaratteriOp = new OutputStreamWriter(fileOp,"UTF-8");
			
			String rigaLetta;
			String codIstat, comune, provincia, cap, codCatastale;
			do {
			    rigaLetta = lettoreDiRighe.readLine();
			    if(rigaLetta!=null) {
			    	codIstat = rigaLetta.substring(0,4);
			    	comune = rigaLetta.substring(4,20);
			    	comune = comune.toLowerCase();
			    	comune = comune
			    	provincia = rigaLetta.substring(54,56);
			    	cap = rigaLetta.substring(56,61);
			    	codCatastale = rigaLetta.substring(61,65);
			    	
			    	System.out.println(codIstat + "," + comune + "," + provincia + "," + cap + "," + codCatastale); 
			    	flussoCaratteriOp.write(codIstat + "," + comune + "," + provincia + "," + cap + "," + codCatastale);
			    	flussoCaratteriOp.close();
			    	fileOp.close();
			    }
			}while(rigaLetta!=null);        
			lettoreDiRighe.close();
			flussoCaratteri.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e2) {
			e2.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		launch(args);
	}
}