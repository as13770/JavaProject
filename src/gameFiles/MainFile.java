package gameFiles;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainFile extends Application{

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Stage nameScreen = new Stage();
		TextField name1 = new TextField();
		name1.setPromptText("First Player");
		GridPane.setConstraints(name1, 0, 0);
		
		TextField name2 = new TextField();
		name2.setPromptText("Second Player");
		GridPane.setConstraints(name2, 0, 1);
		
		Button ok = new Button();
		ok.setText("OK");
		ok.setPrefWidth(50);
		GridPane.setConstraints(ok, 1, 0);
		
		Button clear = new Button();
		clear.setText("Clear");
		clear.setPrefWidth(50);
		GridPane.setConstraints(clear, 1, 1);
		
		GridPane names = new GridPane();
		names.setPadding(new Insets(20, 20, 20, 20));
		names.setVgap(8);
		names.setHgap(8);

		names.getChildren().addAll(name1, name2, ok, clear);
		Scene namescene = new Scene(names, 250, 100);
		nameScreen.setScene(namescene);
	//	nameScreen.show();
		
		Stage rulesScreen = new Stage();

		//batter and pitcher pictures
		ImageView batter = new ImageView("https://sineilleifer.files.wordpress.com/2013/01/1045.jpg?w=960");
		batter.setFitWidth(140);
		batter.setFitHeight(180);
		batter.setX(0);
		batter.setY(25);
		ImageView pitcher = new ImageView("http://www.thecompletepitcher.com/assets/images/blog/4.jpg");
		pitcher.setFitWidth(140);
		pitcher.setFitHeight(180);
		pitcher.setX(260);
		pitcher.setY(25);
		
		//batter score
		Label bat = new Label();
		bat.setText("batter");
		bat.setLayoutX(60);
		bat.setFont(Font.font(18));
		bat.setMaxWidth(90);
		
		//pitcher score
		Label pitc = new Label();
		pitc.setText("pitcher");
		pitc.setLayoutX(270);
		pitc.setFont(Font.font(18));
		pitc.setMaxWidth(90);
		
		Rectangle scorebox = new Rectangle();
		scorebox.setWidth(120);
		scorebox.setHeight(25);
		scorebox.setX(140);
		scorebox.setY(0);
		scorebox.setFill(Color.WHITE);
		scorebox.setStroke(Color.BLACK);
		Line splitter = new Line(200, 0, 200, 25);
		
		//scores
		Label score1 = new Label();
		score1.setText("2");
		score1.setLayoutX(165);
		score1.setFont(Font.font(18));
		Label score2 = new Label();
		score2.setText("3");
		score2.setLayoutX(225);
		score2.setFont(Font.font(18));
		
		//out icons
		Circle out1a = new Circle();
		out1a.setRadius(6);
		out1a.setStroke(Color.BLACK);
		out1a.setFill(Color.DARKRED);
		out1a.setCenterX(180);
		out1a.setCenterY(40);
		Circle out2a = new Circle();
		out2a.setRadius(6);
		out2a.setStroke(Color.BLACK);
		out2a.setFill(Color.DARKRED);
		out2a.setCenterX(220);
		out2a.setCenterY(40);
		Circle out1b = new Circle();
		out1b.setRadius(6);
		out1b.setStroke(Color.BLACK);
		out1b.setFill(Color.RED);
		out1b.setCenterX(180);
		out1b.setCenterY(40);
		out1b.setVisible(false);
		Circle out2b = new Circle();
		out2b.setRadius(6);
		out2b.setStroke(Color.BLACK);
		out2b.setFill(Color.RED);
		out2b.setCenterX(220);
		out2b.setCenterY(40);
		out2b.setVisible(false);
		
		Circle strike1a = new Circle();
		strike1a.setRadius(6);
		strike1a.setStroke(Color.BLACK);
		strike1a.setFill(Color.DARKGOLDENROD);
		strike1a.setCenterX(180);
		strike1a.setCenterY(100);
		Circle strike2a = new Circle();
		strike2a.setRadius(6);
		strike2a.setStroke(Color.BLACK);
		strike2a.setFill(Color.DARKGOLDENROD);
		strike2a.setCenterX(220);
		strike2a.setCenterY(100);
		Circle strike1b = new Circle();
		strike1b.setRadius(6);
		strike1b.setStroke(Color.BLACK);
		strike1b.setFill(Color.YELLOW);
		strike1b.setCenterX(180);
		strike1b.setCenterY(100);
		strike1b.setVisible(false);
		Circle strike2b = new Circle();
		strike2b.setRadius(6);
		strike2b.setStroke(Color.BLACK);
		strike2b.setFill(Color.YELLOW);
		strike2b.setCenterX(220);
		strike2b.setCenterY(100);
		strike2b.setVisible(true);
		
		Line screenseperator = new Line(0, 300, 400, 300);
		screenseperator.setStrokeWidth(3);

		//bases
		Line line1 = new Line(200, 525, 300, 450);
		line1.setStroke(Color.WHITE);
		Line line2 = new Line(300, 450, 200, 375);
		line2.setStroke(Color.WHITE);
		Line line3 = new Line(200, 375, 100, 450);
		line3.setStroke(Color.WHITE);
		Line line4 = new Line(100, 450, 200, 525);
		line4.setStroke(Color.WHITE);

		//bases continued
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

		//background
		Rectangle field = new Rectangle(400, 300);
		field.setY(300);
		field.setFill(Color.GREEN);
		Rectangle atBat = new Rectangle(400, 300);
		atBat.setY(0);
		atBat.setFill(Color.LIGHTGREY);
		
		
		//reset and rules buttons
		Button reset = new Button();
		reset.setPrefWidth(50);
		reset.setText("Reset");
		reset.setLayoutX(0);
		reset.setOnAction(e -> {
		//	reset();
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
				line3, line4, firstBase, secondBase, thirdBase, homePlate, homePlate2, bat, pitc, scorebox, splitter, score1, 
				score2, out1a, out2a, out1b, out2b, strike1a, strike2a, strike1b, strike2b);

		Scene Everything = new Scene(pane1, 400, 600);
		


		primaryStage.setTitle("baseball");
		primaryStage.setScene(Everything);
		primaryStage.show();

	}


}
