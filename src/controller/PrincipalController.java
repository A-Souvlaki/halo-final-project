package controller;



import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseButton;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class PrincipalController implements Initializable {
	
	@FXML
	private Label s1;
	@FXML
	private Label s2;
	
	@FXML
	private Label dialog;
	@FXML
	private Button dijkstra;
	@FXML
	private Button bfs;
	
	@FXML
	private TextArea info;
	
	void init() {
		s1.setOnMouseClicked((e) -> {

			if (e.getButton().equals(MouseButton.PRIMARY)) {
				
				String a = "El dron de búsqueda A113\n"+ "ha reconocido la zona\n"+"del Vallhala, ahora se\n"+"puede obtener información\n"+"sobre los puntos\nen el mapa por BFS \nscanning";
				info.setFont(Font.font("Lucida Console"));
				info.setText(a);
				bfs.setVisible(true);
				dijkstra.setVisible(false);
				dialog.setVisible(true);
			}
		});	
		
		s2.setOnMouseClicked((e) -> {

			if (e.getButton().equals(MouseButton.PRIMARY)) {
				
				String a = "El mapa de salida\n"+ "esta lleno de monstruos.\n"+"Lo he escaneado para\n"+"hallar el camino\n"+"mas corto\ngracias a Dijkstra-kun";
				info.setFont(Font.font("Lucida Console"));
				info.setText(a);
				dijkstra.setVisible(true);
				bfs.setVisible(false);
				dialog.setText("Una IA muy amable :3");
				dialog.setVisible(true);
			}
		});
		
		dijkstra.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent t) {
				Parent root;
				try {
					root = FXMLLoader.load(getClass().getResource("/application/prueba.fxml"));
					Scene scene = new Scene(root);
					Stage stage = (Stage)((Node) t.getSource()).getScene().getWindow();
					stage.setScene(scene);
					stage.centerOnScreen();
					stage.show();
				} catch (IOException e1) {
					e1.printStackTrace();
				}

			}
		});
		
		bfs.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent t) {
				Parent root;
				try {
					root = FXMLLoader.load(getClass().getResource("/application/bfs.fxml"));
					Scene scene = new Scene(root);
					Stage stage = (Stage)((Node) t.getSource()).getScene().getWindow();
					stage.setScene(scene);
					stage.centerOnScreen();
					stage.show();
				} catch (IOException e1) {
					e1.printStackTrace();
				}

			}
		});
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		dialog.setVisible(false);
		info.setEditable(false);
		init();
		
	}
	
	

}
