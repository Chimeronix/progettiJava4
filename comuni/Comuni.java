package comuni;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

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

			String txtOutput;
			FileWriter fwOutput = new FileWriter("C:\\Users\\alexandrobrugnoni\\Desktop\\comuni.csv");

			String rigaLetta;
			String codIstat, comune, provincia, cap, codCatastale;
			char charArray[];
			boolean isSpazio = true;

			do {
				rigaLetta = lettoreDiRighe.readLine();
				if(rigaLetta!=null) {
					codIstat = rigaLetta.substring(0,4);

					comune = rigaLetta.substring(4,54).toLowerCase();
					charArray = comune.toCharArray();

					for(int i = 0; i < charArray.length; i++) {
						// if the array element is a letter
						if(Character.isLetter(charArray[i])) {
							// check isSpazio is present before the letter
							if(isSpazio) {
								// change the letter into uppercase
								charArray[i] = Character.toUpperCase(charArray[i]);
								isSpazio = false;
							}
						}

						else {
							// if the new character is not character
							isSpazio = true;
						}
					}
					
					comune = String.valueOf(charArray).trim();
					provincia = rigaLetta.substring(54,56);

					cap = rigaLetta.substring(56,61);

					codCatastale = rigaLetta.substring(61,65);

					txtOutput = codIstat + "," + comune + "," + provincia + "," + cap + "," + codCatastale;
					System.out.println(codIstat + "," + comune + "," + provincia + "," + cap + "," + codCatastale); 
					fwOutput.write(txtOutput+"\n");
				}
			}while(rigaLetta!=null);        
			lettoreDiRighe.close();
			flussoCaratteri.close();
			fwOutput.close();
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