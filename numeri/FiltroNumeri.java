package numeri;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class FiltroNumeri extends Application {
	
	public void start(Stage primaryStage) {
		Button bSomma = new Button("Somma");
		
		bSomma.setOnAction(e -> funzioneSomma());
		
		BorderPane pannello = new BorderPane();
			
		pannello.setCenter(bSomma);
		bSomma.setMaxWidth(Integer.MAX_VALUE);
		

		Scene scena = new Scene(pannello, 200, 200);

		primaryStage.setTitle("FiltroNumeri");
		primaryStage.setScene(scena);
		primaryStage.show();
	}
	

	private void funzioneSomma() {
		String arrayStringa[];
		try {
			// INPUT
			FileReader flussoCaratteri = new FileReader("C:\\Users\\alexandrobrugnoni\\Desktop\\input.txt");
			BufferedReader lettoreDiRighe = new BufferedReader(flussoCaratteri);
			// OUTPUT
			File fileOutput = new File("C:\\Users\\alexandrobrugnoni\\Desktop\\output.txt");
			FileOutputStream fos = new FileOutputStream(fileOutput);
			OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
			String rigaLetta;
			
			do {
				rigaLetta = lettoreDiRighe.readLine();
				osw.write(rigaLetta);
				arrayStringa = rigaLetta.split(",");
				
				if (rigaLetta != null) {
					int[] arrayInt = new int[arrayStringa.length];
					for (int i = 0; i < arrayStringa.length; i++) {
						arrayInt[i] = Integer.parseInt(arrayStringa[i]);
					}
				}
			} while (rigaLetta != null);
			lettoreDiRighe.close();
			flussoCaratteri.close();
			fos.close();
			osw.close();

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		launch(args);
	}
}