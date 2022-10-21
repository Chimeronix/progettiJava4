package ricerche;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.util.ArrayList;


public class IngressiArrayList extends Application {

	TextField txtfNome1 = new TextField();
	TextField txtfNome2 = new TextField();
	Label lRisposta = new Label();
	
	ArrayList<String> elencoIngressi = new ArrayList<>();
	
	public void start(Stage primaryStage) {
		Button bInserisci = new Button("Inserisci");
		Button bCerca = new Button("Ricerca");
		
		bInserisci.setOnAction(e -> funzioneInserisci());
		bCerca.setOnAction(e -> funzioneCerca());
		
		txtfNome1.setPromptText("nome");
		txtfNome2.setPromptText("nome");
		
		GridPane griglia = new GridPane();
		griglia.setPadding(new Insets(10, 10, 10, 10));
		griglia.setHgap(20); 
		griglia.setVgap(40);
			
		griglia.add(txtfNome1, 0, 0);
		griglia.add(txtfNome2, 0, 1);
		griglia.add(bInserisci, 1, 0);
		griglia.add(bCerca, 1, 1);
		griglia.add(lRisposta, 0, 2, 2, 1);
		lRisposta.setMaxWidth(Integer.MAX_VALUE);

		Scene scena = new Scene(griglia);

		primaryStage.setTitle("Ingressi");
		primaryStage.setScene(scena);
		primaryStage.show();
	}
	

	private void funzioneInserisci(){
		elencoIngressi.add(txtfNome1.getText());
		lRisposta.setText("Posto " + elencoIngressi.size() + " occupato da " + txtfNome1.getText());
	}
	
	
	private void funzioneCerca() {
		boolean trovato= false;
		String personaDaCercare=txtfNome2.getText();
		for(int j=0; j<elencoIngressi.size(); j++) {
			if(personaDaCercare.equals(elencoIngressi.get(j))) {
				trovato=true;
			}
			if(trovato) {
				lRisposta.setText(personaDaCercare + " è presente!");
			}else {
				lRisposta.setText(personaDaCercare + " non è presente");
			}

		}
	}
	

	public static void main(String[] args) {
		launch(args);
	}
}