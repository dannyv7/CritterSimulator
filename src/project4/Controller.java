package project4;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class Controller  implements Initializable{
	@FXML 
	private GridPane gpane;
	
	@FXML
	private ComboBox cbox;
	
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
	
	public void makeCritter(ActionEvent event){
		
	}

	
}
