package rubrica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Optional;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;


public class GuiRubrica extends Application {

	Contatto nuovoContatto;
	javafx.stage.Window finestra;
	
	TextField txtfPercorso = new TextField();
	TextField txtfNome = new TextField();
	TextField txtfCognome = new TextField();
	TextField txtfTelefono = new TextField();
	TextField txtfDataNascita = new TextField();
	ListView <Contatto> lvRubrica = new ListView<>();
	ListView <String> lvPersonaCercata = new ListView<>();

	public void start(Stage primaryStage) {

		Text txtNome = new Text("Nome:");
		Text txtCognome = new Text("Cognome:");
		Text txtTelefono = new Text("Telefono:");
		Text txtDataNascita = new Text("Data di nascita:");
		finestra = primaryStage;

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
		txtfPercorso.setEditable(false);
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
		pannello.add(lvPersonaCercata, 3, 6, 2, 1);
		bCerca.setMaxWidth(Integer.MAX_VALUE);
		pannello.add(bAggiungi, 4, 5);
		bAggiungi.setMaxWidth(Integer.MAX_VALUE);
		pannello.add(bSalva, 0, 7);
		bSalva.setMaxWidth(Integer.MAX_VALUE);
		pannello.add(bCarica, 1, 7);
		bCarica.setMaxWidth(Integer.MAX_VALUE);
		pannello.add(bElimina, 2, 7);
		bElimina.setMaxWidth(Integer.MAX_VALUE);

		if(txtfPercorso.getText() == "") {
			txtfNome.setEditable(false);
			txtfCognome.setEditable(false);
			txtfTelefono.setEditable(false);
			txtfDataNascita.setEditable(false);
		} 
		
		Scene scena = new Scene(pannello);
		
		primaryStage.setResizable(false);
		primaryStage.setTitle("Rubrica");
		primaryStage.setScene(scena);
		primaryStage.show();

	}


	private void cambiaPercorso() {
		
		FileChooser selettoreFile = new FileChooser();
		String cartellaPartenza = System.getProperties().getProperty("user.home");
		selettoreFile.setInitialDirectory(new File(cartellaPartenza));
		selettoreFile.getExtensionFilters().addAll(new ExtensionFilter("File CSV", "*.csv"));
		
		File fileSelezionato = selettoreFile.showOpenDialog(finestra);
		txtfPercorso.setText(fileSelezionato.toString());
		
		txtfNome.setEditable(true);
		txtfCognome.setEditable(true);
		txtfTelefono.setEditable(true);
		txtfDataNascita.setEditable(true);
		
	}


	private void cercaPersona() {
		
		String nomePersona = txtfNome.getText();
		String cognomePersona = txtfCognome.getText();
		boolean personaTrovata = false;
		for(int i=0;i<lvRubrica.getItems().size() && !personaTrovata;i++) {
			if(lvRubrica.getItems().get(i).getNome().equals(nomePersona) && lvRubrica.getItems().get(i).getCognome().equals(cognomePersona)) {
				personaTrovata = true;
			}
		}
		
		if(personaTrovata) {
			System.out.println("Persona trovata");
			lvPersonaCercata.getItems().add(nomePersona + " " + cognomePersona + " è presente nella lista!");
		} else {
			System.out.println("Persona trovata");
			lvPersonaCercata.getItems().add(nomePersona + " " + cognomePersona + " non è presente nella lista!");
		}
	}


	private void aggiungiPersona() {
		
		nuovoContatto = new Contatto(txtfNome.getText(), txtfCognome.getText(), txtfTelefono.getText(), txtfDataNascita.getText());
		lvRubrica.getItems().add(nuovoContatto);

	}

	private void salva() {
		
		//C:\Users\alexandrobrugnoni\Desktop\rubrica.csv
		try {
			FileWriter fwOP = new FileWriter(txtfPercorso.getText());
			for(int i=0;i<lvRubrica.getItems().size();i++) {
				fwOP.write(lvRubrica.getItems().get(i).toCsv());
			}
			fwOP.close();
		} catch(IOException e) {
			Alert dialogoAllerta = new Alert(AlertType.CONFIRMATION, "File non trovato, controllare il percorso.");
			dialogoAllerta.setTitle("ERRORE");
			dialogoAllerta.setHeaderText("Non riesco a trovare il file :(");
			dialogoAllerta.setResizable(false);
			dialogoAllerta.setGraphic(null);
			Optional<ButtonType> risposta = dialogoAllerta.showAndWait();
			if(risposta.isPresent() && risposta.get() == ButtonType.OK) {
			    txtfPercorso.selectAll();
			}
		}
	}


	private void carica() {

		try {
			FileReader fr = new FileReader(txtfPercorso.getText());
			BufferedReader lettoreDiRighe = new BufferedReader(fr);
			String rigaLetta;
			do {
			    rigaLetta = lettoreDiRighe.readLine();
			    if(rigaLetta!=null) {
			        Contatto caricaFile = new Contatto(rigaLetta);
			        lvRubrica.getItems().add(caricaFile);
			    }
			} while(rigaLetta!=null);        
			lettoreDiRighe.close();
			fr.close();
		} catch(IOException e) {
			Alert dialogoAllerta = new Alert(AlertType.CONFIRMATION, "File non trovato, controllare il percorso.");
			Optional<ButtonType> risposta = dialogoAllerta.showAndWait();
			dialogoAllerta.setTitle("ERRORE");
			dialogoAllerta.setHeaderText("Non riesco a trovare il file :(");
			dialogoAllerta.setResizable(false);
			dialogoAllerta.setGraphic(null);
			if(risposta.isPresent() && risposta.get() == ButtonType.OK) {
			    txtfPercorso.selectAll();
			}
		}
	}


	private void elimina() {

		int i = lvRubrica.getSelectionModel().getSelectedIndex();
		lvRubrica.getItems().remove(i);
		
	}


	public static void main(String[] args) {
		launch(args);
	}
}