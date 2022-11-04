package numeri;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Numeri extends Application{

	TextField tfNomeFile = new TextField("numeri.txt");
	Label lRisposta = new Label("?");
	ArrayList <Integer> arrLista  = new ArrayList<>();
	
	FileReader flussoCaratteri;
	BufferedReader lettoreDiRighe;
	String rigaLetta;
	
	@Override
	public void start(Stage finestra) throws Exception {
		Button bSomma = new Button("Somma");
		bSomma.setOnAction(e -> funzioneSomma());
		
		Button bMinimo = new Button("Minimo");
		bMinimo.setOnAction(e -> funzioneMinimo());
		
		Button bMassimo = new Button("Massimo");
		bMassimo.setOnAction(e -> funzioneMassimo());
		
		GridPane griglia = new GridPane();
		
		griglia.add(new Label("Nome File:"), 0, 0);
		griglia.add(tfNomeFile,              1, 0, 2, 1);
		griglia.add(bSomma,                  0, 1);
		griglia.add(bMinimo,                 1, 1);
		griglia.add(bMassimo,                2, 1);
		griglia.add(lRisposta,               0, 2, 3, 1);
		
		griglia.setPadding( new Insets(20) );
		griglia.setVgap(10);
		griglia.setHgap(10);
		
		Scene scena = new Scene(griglia);
		finestra.setScene(scena);
		finestra.setTitle("Numeri");
		finestra.show();
		
		try {
			flussoCaratteri = new FileReader("C:\\Users\\alexandrobrugnoni\\Desktop\\numeri.txt");
			lettoreDiRighe = new BufferedReader(flussoCaratteri);
			
			while(rigaLetta!=null){
			    rigaLetta = lettoreDiRighe.readLine();
			    System.out.println(rigaLetta);
				int numeroRiga;
			    numeroRiga = Integer.parseInt(rigaLetta);
			    arrLista.add(numeroRiga);
			    System.out.println(arrLista.get(0));
			}
			lettoreDiRighe.close();
			flussoCaratteri.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	private void funzioneSomma() {
		int somma = 0;
		for (int i=0;i<arrLista.size();i++) {
			somma += arrLista.get(i);
		}
		lRisposta.setText("" + somma);
	}
	
	
	private void funzioneMassimo() {
		int minimo = 0;
		for (int i=0;i<arrLista.size();i++) {
			somma += arrLista.get(i);
		}
		lRisposta.setText("" + somma);
	}
	
	
	private void funzioneMinimo() {
		int somma = 0;
		for (int i=0;i<arrLista.size();i++) {
			somma += arrLista.get(i);
		}
		lRisposta.setText("" + somma);
	}
	

	public static void main(String[] args) {
		launch(args);
	}
}