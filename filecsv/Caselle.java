package filecsv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Caselle extends Application {
	
	TextField txtfRiga = new TextField();
	TextField txtfColonna = new TextField();
	
	Label lRisposta = new Label();
	
	String v[];
	
	public void start(Stage primaryStage) {
		Text txtRiga = new Text("Riga");
		Text txtColonna = new Text("Colonna");
		
		Button bLeggi = new Button("Leggi");
		
		bLeggi.setOnAction(e -> funzioneLeggi());
		
		GridPane griglia = new GridPane();
		griglia.setPadding(new Insets(10, 10, 10, 10));
		griglia.setHgap(20); 
		griglia.setVgap(40);
			
		griglia.add(txtRiga, 0, 0);
		griglia.add(txtColonna, 0, 1);
		
		griglia.add(txtfRiga, 1, 0);
		griglia.add(txtfColonna, 1, 1);
		
		griglia.add(bLeggi, 0, 2, 2, 1);
		bLeggi.setMaxWidth(Integer.MAX_VALUE);
		
		griglia.add(lRisposta, 0, 3, 2, 1);
		lRisposta.setMaxWidth(Integer.MAX_VALUE);
		

		Scene scena = new Scene(griglia);

		primaryStage.setTitle("Caselle");
		primaryStage.setScene(scena);
		primaryStage.show();
	}
	

	private void funzioneLeggi(){
		int riga = Integer.parseInt(txtfRiga.getText());
		int colonna = Integer.parseInt(txtfColonna.getText());
		
		riga-=1;
		colonna-=1;
		
		try {
			FileReader flussoCaratteri = new FileReader("C:\\Users\\alexandrobrugnoni\\Desktop\\elenco.csv");
			BufferedReader lettoreDiRighe = new BufferedReader(flussoCaratteri);
			String rigaLetta;
			for(int i=0;i<riga;i++) {
				lettoreDiRighe.readLine();
			}
			rigaLetta = lettoreDiRighe.readLine();
			v = rigaLetta.split(",");
			lettoreDiRighe.close();
			lRisposta.setText(v[colonna]);
		}catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}catch (IOException e2) {
			e2.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		launch(args);
	}
}