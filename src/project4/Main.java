/* CRITTERS Main.java
 * EE422C Project 4 submission by
 * Replace <...> with your actual data.
 * Danny Vo
 * dpv292
 * 76550
 * Zain Modi
 * zam374
 * 76550
 * Slip days used: 1
 * Summer 2016
 */

package project4;

import java.awt.Insets;
import java.io.IOException;
import java.util.Scanner;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
	private static Tile[][] realWorld= new Tile[Params.world_width][Params.world_height];
	private static GridPane gp = null;
	private static Text t = null;
	private static Stage world = new Stage();
	private static Stage stats = new Stage();
	private static int timeSteps = 0;
	public static void main(String[] args)  throws InvalidCritterException {
		launch(args);
	}
	public static void setTime(int t){
		timeSteps = t;
	}
	public static Tile[][] getRealWorld(){
		return realWorld;
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Parent root = FXMLLoader.load(getClass().getResource("CritterGUI.fxml"));
		Scene  scene= new Scene(root, 270, 1080);
		
		primaryStage.setTitle("CritterController");
		primaryStage.setResizable(true);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		gp = actualizeWorld();
		Scene scene2 = new Scene(gp);
		world.setTitle("CritterSimulator");
		world.setScene(scene2);
		world.show();
		
	}
	
	public GridPane actualizeWorld(){
		GridPane gpane = new GridPane();

		for (int i = 0; i < Params.world_height; i += 1) {
			RowConstraints r = new RowConstraints();
			r.setPercentHeight(100 / Params.world_height);
			r.setValignment(VPos.CENTER);
			gpane.getRowConstraints().add(r);
		}

		for (int i = 0; i < Params.world_width; i += 1) {
			ColumnConstraints c = new ColumnConstraints();
			c.setPercentWidth(100 / Params.world_width);
			c.setHalignment(HPos.CENTER);
			gpane.getColumnConstraints().add(c);
		}

		gpane.setVgap(5);
		gpane.setHgap(5);
		gpane.setGridLinesVisible(false);
		gpane.setAlignment(Pos.CENTER);

		for (int i = 0; i < Params.world_width; i += 1) {
			for (int k = 0; k < Params.world_height; k += 1) {
				realWorld[i][k] = new Tile();
				gpane.add(realWorld[i][k], i, k);
			}
		}
//		Scene scene = new Scene(gpane, 1650, 1080);
//		world.setTitle("CritterSimulator");
//		world.setScene(scene);
//		world.show();
		return gpane;
	}

	public static void show(){
		gp = new GridPane();
		Tile[][] temp = realWorld;
		for (int i = 0; i < Params.world_width; i += 1) {
			for (int k = 0; k < Params.world_height; k += 1) {
				gp.add(realWorld[i][k],i,k);
			}
		}
		Scene scene = new Scene(gp);
		world.setScene(scene);
		world.show();
		 
	    }
	
	public static void showStats(String s){
		 Group root = new Group();
	        Scene scene = new Scene(root, 300, 250, Color.WHITE);
	        int x = 10;
	        int y = 10;
	        int red = 30;
	        int green = 40;
	        int blue = 50;

	        Text text = new Text(x, y, s);

	        text.setFill(Color.rgb(red, green, blue, .99));
	       // text.setRotate(60);
	        root.getChildren().add(text);
	        
	        stats.setTitle("CritterStats");
	        stats.setScene(scene);
	        stats.show();
	}
}

