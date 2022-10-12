package ricerche;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Ingressi extends Application {

	TextField txtfNome1 = new TextField();
	TextField txtfNome2 = new TextField();
	Label lRisposta = new Label();
	String vNomi[] = new String[300];
	int numeroPosto = 0;
	
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
		vNomi[numeroPosto] = txtfNome1.getText();
		numeroPosto++;
		lRisposta.setText("Posto " + numeroPosto + " occupato da " + txtfNome1.getText());
	}
	
	
	private void funzioneCerca() {
		String personaCercata = txtfNome2.getText();
		for(int j=0; j<numeroPosto;j++) {
			if(personaCercata.equals(vNomi[j])) {
				lRisposta.setText("Trovato");
			} else {
				lRisposta.setText("Non trovato");
			}
		}
	}
	

	public static void main(String[] args) {
		launch(args);
	}
}