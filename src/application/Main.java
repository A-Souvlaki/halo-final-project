package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("principal.fxml"));
		arg0.setScene(new Scene(root));
		arg0.setResizable(true);
		arg0.show();

	}

	public static void main(String[] args) {

		launch(args);

	}

}