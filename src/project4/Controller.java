package project4;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.css.PseudoClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

public class Controller  implements Initializable{
	private Label[][] label = new Label[Params.world_height][Params.world_width];
	@FXML
	private AnchorPane apane;
	@FXML 
	private GridPane gpane;
	//private TilePane tpain;
	
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
//		gpane.getColumnConstraints().add(new ColumnConstraints(Params.world_width));
//		gpane.getRowConstraints().add(new RowConstraints(Params.world_height));
//		
		
		/* Populates the ComboBox with the Critter */
		cbox.getItems().addAll(
				"Algae",
				"Asa",
				"Craig",
				"Kennedy",
				"Lexi",
				"Mia"
				);
		for(int i = 0; i < Params.world_height; i+= 1){
			RowConstraints r = new RowConstraints();
			r.setPercentHeight(100/Params.world_height);
			r.setValignment(VPos.CENTER);
			gpane.getRowConstraints().add(r);
		}
		
		for(int i = 0; i < Params.world_width; i+= 1){
			ColumnConstraints c = new ColumnConstraints();
			c.setPercentWidth(100/Params.world_width);
			c.setHalignment(HPos.CENTER);
			gpane.getColumnConstraints().add(c);
		}
		
		
		gpane.setVgap(5);
		gpane.setHgap(5);
		gpane.setPadding(new Insets(0,5,0,5));
		gpane.setGridLinesVisible(false);
		gpane.setAlignment(Pos.CENTER);
		
		for(int i = 0; i < Params.world_height; i+= 1){
			for(int k = 0; k < Params.world_width; k+= 1){
				gpane.add(new Tile(),i, k);
			}
		}

//		for(int i = 0; i < Params.world_height; i+= 1){
//			for(int k = 0; k < Params.world_width; k+=1 ){
//				StackPane cell = new StackPane();
//				 cell.getStyleClass().add("cell");
//				 cell.setPrefHeight(10);
//				 cell.setPrefWidth(10);
//	             cell.getChildren().add(new TextField());
//				gpane.add(cell, i, k);
//			}
//		}

	}
	
	public void makeCritter(ActionEvent event) throws InvalidCritterException{
		int numCrittersToMake = Integer.parseInt(numCritters.getText());
		String critterToMake = cbox.getSelectionModel().getSelectedItem().toString();
		
		for(int i =0; i < numCrittersToMake; i+= 1){
			Critter.makeCritter(critterToMake);
		}
	}
	
	public void executeTimeSteps(ActionEvent event){
		int numTimeStepsToTake;
		try{
			numTimeStepsToTake = Integer.parseInt(numSteps.getText());
		}catch(NumberFormatException o){
			numTimeStepsToTake = 1;
		}
		
		
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
		Critter[][] temp= CritterWorld.getWorld();
		
		
	}
	
	public void displayStats(ActionEvent event){
		Critter.runStats(CritterWorld.getLiveCritters());
	}
	
	public void endSimulation(ActionEvent event){
		System.exit(0);
	}
	
	private class Tile extends StackPane{
		public Tile(){
			Rectangle border = new Rectangle(10,10);
			border.setFill(null);
			border.setStroke(Color.BLACK);
			
			Circle circle = new Circle(2);
			setAlignment(Pos.CENTER);
			getChildren().addAll(border, circle);
		}
	}
	
}
