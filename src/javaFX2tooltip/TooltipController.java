package javaFX2tooltip;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;

public class TooltipController {

	@FXML
	private Button btn;

	@FXML
	private TextField txf;

	@FXML
	private Circle circle;

	@FXML
	void initialize() {
		assert btn != null : "fx:id=\"btn\" was not injected: check your FXML file 'Tooltip.fxml'.";
		assert txf != null : "fx:id=\"txf\" was not injected: check your FXML file 'Tooltip.fxml'.";
		assert circle != null : "fx:id=\"circle\" was not injected: check your FXML file 'Tooltip.fxml'.";

		Tooltip btnTooltip = new Tooltip("Button's tooltip");
		btnTooltip.setGraphic(new ImageView(new Image(this.getClass().getResourceAsStream("res/support.png"))));
		this.btn.setTooltip(btnTooltip);

		Tooltip txfTooltip = new Tooltip("TextFiel's tooltip");
		txfTooltip.setGraphic(new ImageView(new Image(this.getClass().getResourceAsStream("res/support.png"))));
		this.txf.setTooltip(txfTooltip);

		Tooltip circleTooltip = new Tooltip("Circle's tooltip");
		circleTooltip.setGraphic(new ImageView(new Image(this.getClass().getResourceAsStream("res/support.png"))));
		Tooltip.install(circle, circleTooltip);
	}

}
