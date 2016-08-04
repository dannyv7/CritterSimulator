package project4;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class Controller  implements Initializable{
	@FXML 
	private GridPane gpane;
	
	@FXML
	private TextField numCritters;
	
	@FXML
	private ComboBox cbox;
	
	@FXML
	private Button makeButton;
	
	@FXML
	private TextField numSteps;
	
	@FXML
	private Button stepButton;
	
	@FXML
	private TextField seedValue;
	
	@FXML
	private Button seedButton;
	
	@FXML
	private Button showButton;
	
	@FXML
	private Button statsButton;
	
	@FXML
	private Button endButton;
	
	public void setGrid(){
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		/* Sets the output display */
		gpane.getColumnConstraints().add(new ColumnConstraints(Params.world_width));
		gpane.getRowConstraints().add(new RowConstraints(Params.world_height));
		
		/* Populates the ComboBox with the Critter */
		cbox.getItems().addAll(
				"Algae",
				"Asa",
				"Craig",
				"Kennedy",
				"Lexi",
				"Mia"
				);
	}
	
	public void makeCritter(ActionEvent event) throws InvalidCritterException{
		int numCrittersToMake = Integer.parseInt(numCritters.getText());
		String critterToMake = cbox.getSelectionModel().getSelectedItem().toString();
		
		for(int i =0; i < numCrittersToMake; i+= 1){
			Critter.makeCritter(critterToMake);
		}
	}
	
	public void executeTimeSteps(ActionEvent event){
		int numTimeStepsToTake = Integer.parseInt(numSteps.getText());
		
		for(int i = 0; i < numTimeStepsToTake; i+= 1){
			Critter.worldTimeStep();
		}
	}
	
	public void setSeed(ActionEvent event){
		int cnt = Integer.parseInt(seedValue.toString());
		Critter.setSeed(cnt);
	}

	public void displayWorld(ActionEvent event){
		Critter.displayWorld();
	}
	
	public void displayStats(ActionEvent event){
		Critter.runStats(CritterWorld.getLiveCritters());
	}
	
	public void endSimulation(ActionEvent event){
		System.exit(0);
	}

	
}
