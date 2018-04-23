package gameFiles;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MainFile extends Application{

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Stage rulesScreen = new Stage();
		Stage lol = new Stage();

		ImageView batter = new ImageView("https://sineilleifer.files.wordpress.com/2013/01/1045.jpg?w=960");
		batter.setFitWidth(60);
		batter.setFitHeight(80);
		batter.setX(100);
		batter.setY(120);
		ImageView pitcher = new ImageView("http://www.thecompletepitcher.com/assets/images/blog/4.jpg");
		pitcher.setFitWidth(60);
		pitcher.setFitHeight(80);
		pitcher.setX(200);
		pitcher.setY(20);

		Line screenseperator = new Line(0, 300, 400, 300);
		screenseperator.setStrokeWidth(3);

		Line line1 = new Line(200, 525, 300, 450);
		line1.setStroke(Color.WHITE);
		Line line2 = new Line(300, 450, 200, 375);
		line2.setStroke(Color.WHITE);
		Line line3 = new Line(200, 375, 100, 450);
		line3.setStroke(Color.WHITE);
		Line line4 = new Line(100, 450, 200, 525);
		line4.setStroke(Color.WHITE);

		Rectangle firstBase = new Rectangle(20, 20);
		firstBase.setX(290);
		firstBase.setY(440);
		firstBase.setRotate(45);
		firstBase.setFill(Color.WHITE);
		Rectangle secondBase = new Rectangle(20, 20);
		secondBase.setX(190);
		secondBase.setY(365);
		secondBase.setRotate(45);
		secondBase.setFill(Color.WHITE);
		Rectangle thirdBase = new Rectangle(20, 20);
		thirdBase.setX(90);
		thirdBase.setY(440);
		thirdBase.setRotate(45);
		thirdBase.setFill(Color.WHITE);
		Rectangle homePlate = new Rectangle(20, 10);
		homePlate.setX(190);
		homePlate.setY(515);
		homePlate.setFill(Color.WHITE);
		Polygon homePlate2 = new Polygon();
		homePlate2.getPoints().addAll(new Double[] {190.0, 525.0, 210.0, 525.0, 200.0, 535.0});
		homePlate2.setFill(Color.WHITE);

		Rectangle field = new Rectangle(400, 300);
		field.setY(300);
		field.setFill(Color.GREEN);
		Rectangle atBat = new Rectangle(400, 300);
		atBat.setY(0);
		atBat.setFill(Color.LIGHTGREY);
		
		Button reset = new Button();
		reset.setPrefWidth(50);
		reset.setText("Reset");
		reset.setLayoutX(0);
		reset.setOnAction(e -> {
			lol.show();
		});
		
		Button rules = new Button();
		rules.setPrefWidth(50);
		rules.setText("Rules");
		rules.setLayoutX(350);
		rules.setOnAction(e -> {
			rulesScreen.show();
		});


		Pane pane1 = new Pane();
		pane1.getChildren().addAll(field, atBat, rules, reset, batter, pitcher, screenseperator, line1, line2,
				line3, line4, firstBase, secondBase, thirdBase, homePlate, homePlate2);

		Scene backdrop = new Scene(pane1, 400, 600);
		


		primaryStage.setTitle("baseball");
		primaryStage.setScene(backdrop);
		primaryStage.show();

	}


}
