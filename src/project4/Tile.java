package project4;

import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class Tile extends StackPane {
	// private int dim = (int)
	// Math.sqrt(((Params.world_height*Params.world_width)/(1650*1080)));
	private int dim = 12;

	public Tile() {
		Rectangle border = new Rectangle(dim, dim);
		border.setFill(null);
		border.setStroke(Color.BLACK);
		getChildren().addAll(border);
	}

	public Tile(Shape s) {
		Rectangle border = new Rectangle(dim, dim);
		border.setFill(null);
		border.setStroke(Color.BLACK);

		Shape shape = new Circle(2);
		shape.setFill(Color.BLUE);
		setAlignment(Pos.CENTER);
		getChildren().addAll(border, shape);
	}

	// BLACK, BLUE, RED, GREEN, PINK, BROWN
	public Tile(Color c, Shape s, Color outline) {
		Rectangle border = new Rectangle(dim, dim);
		border.setFill(null);
		border.setStroke(Color.BLACK);
		Shape shape = s;
		shape.setFill(c);
		shape.setStroke(outline);
		getChildren().addAll(border, shape);
	}
	public Tile(Critter c) {
		Rectangle border = new Rectangle(dim, dim);
		border.setFill(null);
		border.setStroke(Color.BLACK);
		Shape shape = c.viewShape();
		shape.setFill(c.viewFillColor());
		shape.setStroke(c.viewOutlineColor());
		getChildren().addAll(border, shape);
	}
	public Tile(int i) {
		Rectangle border = new Rectangle(dim, dim);
		border.setFill(null);
		border.setStroke(Color.BLACK);

		Shape shape = new Circle(2);
		if (i == 0) {
			shape.setFill(Color.WHITE);
		} else if (i == 1) {
			shape.setFill(Color.RED);
		} else {
			shape.setFill(Color.BLUE);
		}
		setAlignment(Pos.CENTER);
		getChildren().addAll(border, shape);
	}
}
