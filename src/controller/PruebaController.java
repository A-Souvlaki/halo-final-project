package controller;


import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Dijkstra;

public class PruebaController implements Initializable {

	private Dijkstra dijkstra;

	@FXML
	private Label c0_2;
	@FXML
	private Label c0_1;
	@FXML
	private Label c1_6;
	@FXML
	private Label c1_4;
	@FXML
	private Label c2_3;
	@FXML
	private Label c2_4;
	@FXML
	private Label c3_4;
	@FXML
	private Label c3_7;
	@FXML
	private Label c4_5;
	@FXML
	private Label c5_7;
	@FXML
	private Label c6_5;

	@FXML
	private Text g0;
	@FXML
	private Text g1;
	@FXML
	private Text g2;
	@FXML
	private Text g3;

	@FXML
	private Text g4;

	@FXML
	private Text g5;

	@FXML
	private Text g6;

	@FXML
	private Text g7;

	@FXML
	private TextField inicio;

	@FXML
	private TextField fin;
	
	@FXML
	private TextArea txt;
	
	@FXML
	private Button volver;

	void init() {
		dijkstra = new Dijkstra(7);
		inicio.setEditable(false);
		fin.setEditable(false);
		inicio.clear();
		fin.clear();
		g0.setOnMouseClicked((e) -> {

			if (e.getButton().equals(MouseButton.PRIMARY)) {

				if (inicio.getText().equals("")) {
					inicio.setText(g0.getText());
				} else {
					fin.setText(g0.getText());
				}

			}

		});

		g1.setOnMouseClicked((e) -> {

			if (e.getButton().equals(MouseButton.PRIMARY)) {

				if (inicio.getText().equals("")) {
					inicio.setText(g1.getText());
				} else {
					fin.setText(g1.getText());
				}

			}

		});

		g2.setOnMouseClicked((e) -> {

			if (e.getButton().equals(MouseButton.PRIMARY)) {

				if (inicio.getText().equals("")) {
					inicio.setText(g2.getText());
				} else {
					fin.setText(g2.getText());
				}

			}

		});

		g3.setOnMouseClicked((e) -> {

			if (e.getButton().equals(MouseButton.PRIMARY)) {

				if (inicio.getText().equals("")) {
					inicio.setText(g3.getText());
				} else {
					fin.setText(g3.getText());
				}

			}

		});

		g4.setOnMouseClicked((e) -> {

			if (e.getButton().equals(MouseButton.PRIMARY)) {

				if (inicio.getText().equals("")) {
					inicio.setText(g4.getText());
				} else {
					fin.setText(g4.getText());
				}

			}

		});

		g5.setOnMouseClicked((e) -> {

			if (e.getButton().equals(MouseButton.PRIMARY)) {

				if (inicio.getText().equals("")) {
					inicio.setText(g5.getText());
				} else {
					fin.setText(g5.getText());
				}

			}

		});

		g6.setOnMouseClicked((e) -> {

			if (e.getButton().equals(MouseButton.PRIMARY)) {

				if (inicio.getText().equals("")) {
					inicio.setText(g6.getText());
				} else {
					fin.setText(g6.getText());
				}

			}

		});

		g7.setOnMouseClicked((e) -> {

			if (e.getButton().equals(MouseButton.PRIMARY)) {

				if (inicio.getText().equals("")) {
					inicio.setText(g7.getText());
				} else {
					fin.setText(g7.getText());
				}

			}

		});
		
		volver.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent t) {
				Parent root;
				try {
					root = FXMLLoader.load(getClass().getResource("/application/principal.fxml"));
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

	void generateRandom() {

		c0_2.setText(String.valueOf((int) (Math.random() * 257 + 1)));
		c0_1.setText(String.valueOf((int) (Math.random() * 257 + 1)));
		c1_6.setText(String.valueOf((int) (Math.random() * 257 + 1)));
		c1_4.setText(String.valueOf((int) (Math.random() * 257 + 1)));
		c2_3.setText(String.valueOf((int) (Math.random() * 257 + 1)));
		c2_4.setText(String.valueOf((int) (Math.random() * 257 + 1)));
		c3_4.setText(String.valueOf((int) (Math.random() * 257 + 1)));
		c3_7.setText(String.valueOf((int) (Math.random() * 257 + 1)));
		c4_5.setText(String.valueOf((int) (Math.random() * 257 + 1)));
		c5_7.setText(String.valueOf((int) (Math.random() * 257 + 1)));
		c6_5.setText(String.valueOf((int) (Math.random() * 257 + 1)));

		dijkstra.addEdge(0, 1, Integer.parseInt(c0_1.getText()), false);
		dijkstra.addEdge(0, 2, Integer.parseInt(c0_2.getText()), false);
		dijkstra.addEdge(1, 6, Integer.parseInt(c1_6.getText()), false);
		dijkstra.addEdge(1, 4, Integer.parseInt(c1_4.getText()), false);
		dijkstra.addEdge(2, 3, Integer.parseInt(c2_3.getText()), false);
		dijkstra.addEdge(2, 4, Integer.parseInt(c2_4.getText()), false);
		dijkstra.addEdge(3, 4, Integer.parseInt(c3_4.getText()), false);
		dijkstra.addEdge(3, 7, Integer.parseInt(c3_7.getText()), false);
		dijkstra.addEdge(4, 5, Integer.parseInt(c4_5.getText()), false);
		dijkstra.addEdge(5, 7, Integer.parseInt(c5_7.getText()), false);
		dijkstra.addEdge(6, 5, Integer.parseInt(c0_1.getText()), false);

	}

	@FXML
	void dijkstra(ActionEvent event) {

		if (inicio.getText().equals("") || fin.getText().equals("")) {
			Alert gameOver = new Alert(AlertType.INFORMATION);
			gameOver.setTitle("Alto Ahi!");
			gameOver.setHeaderText("Campos nulo");
			gameOver.setContentText("Debe seleccionar un nodo de inicio");
			gameOver.showAndWait();
		} else {
			int origen = Integer.parseInt(inicio.getText());
			int destino = Integer.parseInt(fin.getText());
			txt.setText(dijkstra.dijkstra(origen));

			dijkstra.print(destino);
			ArrayList<String> camino = dijkstra.getPrinted();
			for (int i = 0; i < camino.size(); i++) {
				int v = Integer.parseInt(camino.get(i));
				if (v == Integer.parseInt(g0.getText())) {
					g0.setFill(Color.ORANGERED);
				} else if (v == Integer.parseInt(g1.getText())) {
					g1.setFill(Color.ORANGERED);
				} else if (v == Integer.parseInt(g2.getText())) {
					g2.setFill(Color.ORANGERED);
				} else if (v == Integer.parseInt(g3.getText())) {
					g3.setFill(Color.ORANGERED);
				} else if (v == Integer.parseInt(g4.getText())) {
					g4.setFill(Color.ORANGERED);
				} else if (v == Integer.parseInt(g5.getText())) {
					g5.setFill(Color.ORANGERED);
				} else if (v == Integer.parseInt(g6.getText())) {
					g6.setFill(Color.ORANGERED);
				} else if (v == Integer.parseInt(g7.getText())) {
					g7.setFill(Color.ORANGERED);
				}

			}
			
			inicio.clear();
			fin.clear();

		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		init();
		generateRandom();

	}

}
