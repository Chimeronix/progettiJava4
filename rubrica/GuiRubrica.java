package rubrica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class GuiRubrica extends Application {
	
	TextField txtfPercorso = new TextField();
	TextField txtfNome = new TextField();
	TextField txtfCognome = new TextField();
	TextField txtfTelefono = new TextField();
	TextField txtfDataNascita = new TextField();
	ListView <Contatto> lvRubrica = new ListView<>();
	
	public void start(Stage primaryStage) {
		
		Text txtNome = new Text("Nome:");
		Text txtCognome = new Text("Cognome:");
		Text txtTelefono = new Text("Telefono:");
		Text txtDataNascita = new Text("Data di nascita:");
		
		Button bCambia = new Button("Cambia");
		bCambia.setOnAction(e -> cambiaPercorso());
		
		Button bCerca = new Button("Cerca");
		bCerca.setOnAction(e -> cercaPersona());
		
		Button bAggiungi = new Button("Aggiungi");
		bAggiungi.setOnAction(e -> aggiungiPersona());
		
		Button bSalva = new Button("Salva");
		bSalva.setOnAction(e -> salva());
		
		Button bCarica = new Button("Carica");
		bCarica.setOnAction(e -> carica());
		
		Button bElimina = new Button("Elimina");
		bElimina.setOnAction(e -> elimina());
		
		GridPane pannello = new GridPane();
		pannello.setHgap(5); 
		pannello.setVgap(10);
		
		 pannello.add(txtfPercorso, 0, 0, 4, 1);
		 txtfPercorso.setMaxWidth(Integer.MAX_VALUE);
		 pannello.add(bCambia, 4, 0);
		 bCambia.setMaxWidth(Integer.MAX_VALUE);
		 pannello.add(lvRubrica, 0, 1, 3, 6);
		 pannello.add(txtNome, 3, 1);
		 pannello.add(txtfNome, 4, 1);
		 pannello.add(txtCognome, 3, 2);
		 pannello.add(txtfCognome, 4, 2);
		 pannello.add(txtTelefono, 3, 3);
		 pannello.add(txtfTelefono, 4, 3);
		 pannello.add(txtDataNascita, 3, 4);
		 pannello.add(txtfDataNascita, 4, 4);
		 pannello.add(bCerca, 3, 5);
		 bCerca.setMaxWidth(Integer.MAX_VALUE);
		 pannello.add(bAggiungi, 4, 5);
		 bAggiungi.setMaxWidth(Integer.MAX_VALUE);
		 pannello.add(bSalva, 0, 7);
		 bSalva.setMaxWidth(Integer.MAX_VALUE);
		 pannello.add(bCarica, 1, 7);
		 bCarica.setMaxWidth(Integer.MAX_VALUE);
		 pannello.add(bElimina, 2, 7);
		 bElimina.setMaxWidth(Integer.MAX_VALUE);
		
		
		
		Scene scena = new Scene(pannello);

		primaryStage.setTitle("Rubrica");
		primaryStage.setScene(scena);
		primaryStage.show();
	
}
	
	
	private void cambiaPercorso() {
		
		File fileOutput = new File(txtfPercorso.getText() + "\\rubrica.csv");

	}
	
	
	private void cercaPersona() {

	}
	
	
	private void aggiungiPersona() {
		Contatto nuovoContatto = new Contatto(txtfNome.getText(), txtfCognome.getText(), txtfTelefono.getText(), txtfDataNascita.getText());
		lvRubrica.getItems().add(nuovoContatto);
	}
	
	private void salva() {

	}
	
	
	private void carica() {

	}
	
	
	private void elimina() {
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}