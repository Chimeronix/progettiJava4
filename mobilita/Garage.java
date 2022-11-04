package mobilita;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Garage extends Application {
	ArrayList<String> oggetti = new ArrayList<String>();
	ListView<MezzoDiTrasporto> lista = new ListView<>();
	ComboBox<String> combo = new ComboBox<>();
	TextField txtPrima = new TextField();
	TextField txtSeconda = new TextField();
	TextField txtTerza = new TextField();
	TextField txtQuarta = new TextField();
	TextField txtQuinta = new TextField();
	TextField txtSesta = new TextField();
	TextField txtSettima = new TextField();
	
	Label lPrima = new Label("Scegli opzione -> ");
	Label lSeconda = new Label("Nome");
	Label lTerza = new Label("Costo");
	Label lQuarta = new Label("");
	Label lQuinta = new Label("");
	Label lSesta = new Label("");
	Label lSettima = new Label("");
	Label lOttava = new Label("");

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane pannello = new GridPane();
		Button bAggiungi = new Button("Aggiungi");
		bAggiungi.setOnAction(e -> funzioneAggiungi());
		combo.setOnAction(e -> cambia());
		
		combo.getItems().add(" ● Motoslitta");
		combo.getItems().add(" ● SkateBoard");
		combo.getItems().add(" ● Moto");
		combo.getItems().add(" ● Bicicletta");
		combo.getItems().add(" ● Barca");
		combo.getItems().add(" ● Deltaplano");
		
		combo.getSelectionModel().select(0);
		
		pannello.add(lista, 0, 0, 2, 10);
		pannello.add(lPrima, 2, 0);
		pannello.add(lSeconda, 2, 1);
		pannello.add(lTerza, 2, 2);
		pannello.add(lQuarta, 2, 3);
		pannello.add(lQuinta, 2, 4);
		pannello.add(lSesta, 2, 5);
		pannello.add(lSettima, 2, 6);
		pannello.add(lOttava, 2, 7);

		pannello.add(combo, 4, 0);
		pannello.add(txtPrima, 4, 1);
		pannello.add(txtSeconda, 4, 2);
		pannello.add(txtTerza, 4, 3);
		pannello.add(txtQuarta, 4, 4);
		pannello.add(txtQuinta, 4, 5);
		pannello.add(txtSesta, 4 ,6);
		pannello.add(txtSettima, 4, 7);

		pannello.add(bAggiungi, 4, 8, 1, 2);
		bAggiungi.setMaxWidth(Integer.MAX_VALUE);
		pannello.setHgap(5); 
		pannello.setVgap(10);
		Scene scena = new Scene(pannello, 600, 600);
		primaryStage.setScene(scena);
		primaryStage.setTitle("garage");
		primaryStage.show();
		
		if(combo.getValue().equals(" ● Motoslitta")) {
			lSettima.setText("");
			lSeconda.setText("Costo");
			lTerza.setText("Velocità");

			txtQuinta.setDisable(false);
			txtSesta.setDisable(true);
			txtSettima.setDisable(true);
		}
	}
	

	public void funzioneAggiungi() {
		if(combo.getValue().equals(" ● Motoslitta")) {
			Motoslitta mSlitta = new Motoslitta(txtPrima.getText(), Double.parseDouble(txtSeconda.getText()),Double.parseDouble(txtTerza.getText()));
			lista.getItems().add(mSlitta);
		}
		if(combo.getValue().equals(" ● SkateBoard")) {
			Skateboard skBoard = new Skateboard(txtPrima.getText(), Double.parseDouble(txtSeconda.getText()),Integer.parseInt(txtQuarta.getText()));
			lista.getItems().add(skBoard);
		}
	}
	
	
	public void cambia() {
		if(combo.getValue().equals(" ● SkateBoard")) {
			lSesta.setText("");
			lSettima.setText("");
			lQuarta.setText("MuscoliCoinvolti");
			lQuinta.setText("Lunghezza");
			txtQuinta.setDisable(true);
			txtSesta.setDisable(true);
			txtSettima.setDisable(true);
		}
		if(combo.getValue().equals(" ● Barca")) {
			lSesta.setText("");
			lSettima.setText("");
			lTerza.setText("Muscoli coinvolti");
			lQuarta.setText("Numero di remi");
			lQuinta.setText("Remo singolo");
			txtQuinta.setDisable(true);
			txtSesta.setDisable(true);
			txtSettima.setDisable(true);
			
		}
		if(combo.getValue().equals(" ● Deltaplano")) {
			lSettima.setText("");
			lTerza.setText("Rumorosità");
			lQuarta.setText("Carburante");
			lQuinta.setText("QuotaMassima");
			lSesta.setText("NumeroPosti");
			txtQuinta.setDisable(false);
			txtSesta.setDisable(true);
			txtSettima.setDisable(true);
		}
		if(combo.getValue().equals(" ● Moto")) {
			lSettima.setText("");
			lTerza.setText("Rumorosità");
			lQuarta.setText("Carburante");
			lQuinta.setText("Velocità");
			lSesta.setText("Cilindrata");
			lSettima.setText("Numero posti");
			txtQuinta.setDisable(false);
			txtSesta.setDisable(false);
			txtSettima.setDisable(true);
		}
		if(combo.getValue().equals(" ● Aereo")) {
			lSettima.setText("");
			lTerza.setText("DistanzaMass");
			lQuarta.setText("Carburante");
			lQuinta.setText("Velocità");
			lSesta.setText("Cilindrata");
			lSettima.setText("Numero posti");
			txtQuinta.setDisable(false);
			txtSesta.setDisable(false);
			txtSettima.setDisable(true);
		}	
		if(combo.getValue().equals(" ● Automobile")) {
			lSettima.setText("");
			lTerza.setText("DistanzaMass");
			lQuarta.setText("Carburante");
			lQuinta.setText("Velocità");
			lSesta.setText("Cilindrata");
			lSettima.setText("Numero posti");
			txtQuinta.setDisable(false);
			txtSesta.setDisable(false);
			txtSettima.setDisable(true);
		}
		if(combo.getValue().equals(" ● Bicicletta")) {
			lSettima.setText("");
			lTerza.setText("DistanzaMass");
			lQuarta.setText("Carburante");
			lQuinta.setText("Velocità");
			lSesta.setText("Cilindrata");
			lSettima.setText("Numero posti");
			txtQuinta.setDisable(false);
			txtSesta.setDisable(false);
			txtSettima.setDisable(true);
		}
		if(combo.getValue().equals(" ● Motocicletta")) {
			lSettima.setText("");
			lTerza.setText("DistanzaMax");
			lQuarta.setText("Carburante");
			lQuinta.setText("Velocità");
			lSesta.setText("Cilindrata");
			lSettima.setText("Numero posti");
			txtQuinta.setDisable(false);
			txtSesta.setDisable(false);
			txtSettima.setDisable(true);
		}
	}

	public static void main(String args[]) {
		launch();
	}

}
