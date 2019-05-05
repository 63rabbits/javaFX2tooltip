package javaFX2tooltip;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Tooltip extends Application {

	@Override
	public void start(Stage stage) throws Exception {

		Parent root = FXMLLoader.load(this.getClass().getResource("Tooltip.fxml"));
		Scene scene = new Scene(root);

		stage.setTitle("JavaFX 2 tooltip");

		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
