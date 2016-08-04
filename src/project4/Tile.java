package project4;

import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class Tile extends StackPane{
	//private int dim = (int) Math.sqrt(((Params.world_height*Params.world_width)/(1650*1080)));
	private int dim = 12;
	public Tile(){
		Rectangle border = new Rectangle(dim, dim);
		border.setFill(null);
		border.setStroke(Color.BLACK);
		getChildren().addAll(border);
	}
	
	public Tile(Shape s){
		Rectangle border = new Rectangle(dim,dim);
		border.setFill(null);
		border.setStroke(Color.BLACK);
		
		Shape shape = new Circle(2); 
		shape.setFill(Color.BLUE);
		setAlignment(Pos.CENTER);
		getChildren().addAll(border, shape);
	}
}
