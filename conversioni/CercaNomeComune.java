package conversioni;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class CercaNomeComune extends Application {
	
	TextField txtfInput = new TextField();
	TextField txtfInputProv = new TextField();
	ArrayList <Comune> elenco = new ArrayList<>();
	Label lIstat = new Label("??");
	Label lNome = new Label("??");
	Label lProvincia = new Label("??");
	Label lCap = new Label("??");
	Label lCatastale = new Label("??");
	
	
	public void start(Stage primaryStage) {
		
		Text txtNomeComune = new Text("Nome comune");
		
		Text txtSiglaProvincia = new Text("Sigla provincia");
		
		Button bCerca = new Button("Cerca");
		Button bSiglaProvincia = new Button("Crea file");
		
		bCerca.setOnAction(e -> funzioneCerca());
		bSiglaProvincia.setOnAction(e -> funzioneOrdina());
		
		GridPane pannello = new GridPane();
		pannello.setPadding(new Insets(10, 10, 10, 10));
		pannello.setHgap(20); 
		pannello.setVgap(40);

		pannello.add(txtNomeComune, 0, 0);
		pannello.add(txtfInput, 1, 0);
		pannello.add(bCerca, 0, 1, 2, 1);
		
		pannello.add(lIstat, 0, 2, 2, 1);
		pannello.add(lNome, 0, 3, 2, 1);
		pannello.add(lProvincia, 0, 4, 2, 1);
		pannello.add(lCap, 0, 5, 2, 1);
		pannello.add(lCatastale, 0, 6, 2, 1);
		
		pannello.add(txtSiglaProvincia, 0, 7);
		pannello.add(txtfInputProv, 1, 7);
		pannello.add(bSiglaProvincia, 0, 8, 2, 1);
		
		bCerca.setMaxWidth(Integer.MAX_VALUE);
		lIstat.setMaxWidth(Integer.MAX_VALUE);
		lNome.setMaxWidth(Integer.MAX_VALUE);
		lProvincia.setMaxWidth(Integer.MAX_VALUE);
		lCap.setMaxWidth(Integer.MAX_VALUE);
		lCatastale.setMaxWidth(Integer.MAX_VALUE);
		bSiglaProvincia.setMaxWidth(Integer.MAX_VALUE);
		
		Scene scena = new Scene(pannello);

		primaryStage.setTitle("Cerca Comune");
		primaryStage.setScene(scena);
		primaryStage.show();
		
		// FUNZIONE 					
		String parti[];
		
		try {
			FileReader flussoCaratteri = new FileReader("C:\\Users\\alexandrobrugnoni\\Desktop\\comuni.csv");
			BufferedReader lettoreDiRighe = new BufferedReader(flussoCaratteri);
			String rigaLetta;
			do {
			    rigaLetta = lettoreDiRighe.readLine();
			    if(rigaLetta!=null) {
			       parti = rigaLetta.split(",");
			       elenco.add(new Comune(parti[0],parti[1],parti[2],parti[3],parti[4]));
			    }
			}while(rigaLetta!=null);        
			lettoreDiRighe.close();
			flussoCaratteri.close();
		} catch(IOException e1) {
			e1.printStackTrace();
		}
}
	

	private void funzioneCerca(){

		String nomeComune = txtfInput.getText();

		for(int i=0;i<elenco.size();i++) {

			if(elenco.get(i).getNome().equals(nomeComune)) {
				Comune comuneTrovato = elenco.get(i);
				lIstat.setText(comuneTrovato.getIstat());
				lNome.setText(comuneTrovato.getNome());
				lProvincia.setText(comuneTrovato.getProvincia());
				lCap.setText(comuneTrovato.getCap());
				lCatastale.setText(comuneTrovato.getCatastale());
			}
		}
	}


	private void funzioneOrdina(){

		String provinciaDaCercare = txtfInputProv.getText();
		
		try(
				FileWriter flussoCaratteriOutput = new FileWriter("C:\\Users\\alexandrobrugnoni\\Desktop\\"+provinciaDaCercare+".csv");
				) {
			
			String testoDaScrivere;
			
			for(int i=0;i<elenco.size();i++) {

				if(elenco.get(i).getProvincia().equals(provinciaDaCercare)) {
					testoDaScrivere = elenco.get(i).getIstat()+ "," +elenco.get(i).getNome() + ","
							+elenco.get(i).getProvincia() + "," +elenco.get(i).getCap()+ "," +
							elenco.get(i).getCatastale();
					flussoCaratteriOutput.write(testoDaScrivere + "\n");
				}
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}