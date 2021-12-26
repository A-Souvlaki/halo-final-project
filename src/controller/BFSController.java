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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.BFS;
import thread.PainterThread;


public class BFSController implements Initializable {

	private BFS bf;
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
	private Text g8;
	@FXML
	private Text g9;
	@FXML
	private Text g10;
	@FXML
	private Text g11;
	@FXML
	private Text g12;

	@FXML
	private TextField inicio;

	@FXML
	private TextField fin;
	
	@FXML
	private Label estado;
	
	@FXML
	private Button volver;
	
	private PainterThread pt;


	void init() {

		
		inicio.clear();
		fin.clear();
		inicio.setEditable(false);
		fin.setEditable(false);

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

		g8.setOnMouseClicked((e) -> {

			if (e.getButton().equals(MouseButton.PRIMARY)) {

				if (inicio.getText().equals("")) {
					inicio.setText(g8.getText());
				} else {
					fin.setText(g8.getText());
				}

			}

		});

		g9.setOnMouseClicked((e) -> {

			if (e.getButton().equals(MouseButton.PRIMARY)) {

				if (inicio.getText().equals("")) {
					inicio.setText(g9.getText());
				} else {
					fin.setText(g9.getText());
				}

			}

		});

		g10.setOnMouseClicked((e) -> {

			if (e.getButton().equals(MouseButton.PRIMARY)) {

				if (inicio.getText().equals("")) {
					inicio.setText(g10.getText());
				} else {
					fin.setText(g10.getText());
				}

			}

		});

		g11.setOnMouseClicked((e) -> {

			if (e.getButton().equals(MouseButton.PRIMARY)) {

				if (inicio.getText().equals("")) {
					inicio.setText(g11.getText());
				} else {
					fin.setText(g11.getText());
				}

			}

		});

		g12.setOnMouseClicked((e) -> {

			if (e.getButton().equals(MouseButton.PRIMARY)) {

				if (inicio.getText().equals("")) {
					inicio.setText(g12.getText());
				} else {
					fin.setText(g12.getText());
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

	void bfs() {
		bf = new BFS();
        bf.setV(12);
        bf.setE(24);
        bf.addEdge(1,12);
        bf.addEdge(1,10);
        bf.addEdge(1,4);
        bf.addEdge(12,5);
        bf.addEdge(12,8);
        bf.addEdge(8,11);
        bf.addEdge(11,9);
        bf.addEdge(11,6);
        bf.addEdge(11,2);
        bf.addEdge(7,2);
        bf.addEdge(10,2);
        bf.addEdge(2,3);
        
        bf.addEdge(2,10);
       
	}

	@FXML
	void accion(ActionEvent event) {

		if (inicio.getText().equals("") || fin.getText().equals("")) {
			Alert gameOver = new Alert(AlertType.INFORMATION);
			gameOver.setTitle("Alto Ahi!");
			gameOver.setHeaderText("Campos nulo");
			gameOver.setContentText("Debe seleccionar un nodo de inicio");
			gameOver.showAndWait();
		} else {
			ArrayList<String>[] m = new ArrayList[2];
			m = bf.bfs(Integer.parseInt(inicio.getText()), Integer.parseInt(fin.getText()));
			int limite = m[0].size();
			pt = new PainterThread(this.bf,this, g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12, inicio, fin,limite,estado);
			pt.setDaemon(true);
			pt.start();

		}

	}
	
	@FXML
	void camino(ActionEvent event) {
		
		
		if (inicio.getText().equals("") || fin.getText().equals("")) {
			Alert gameOver = new Alert(AlertType.INFORMATION);
			gameOver.setTitle("Alto Ahi!");
			gameOver.setHeaderText("Campos nulo");
			gameOver.setContentText("Debe seleccionar un nodo de inicio");
			gameOver.showAndWait();
		} else {
			ArrayList<String>[] m = new ArrayList[2];
			m = bf.bfs(Integer.parseInt(inicio.getText()), Integer.parseInt(fin.getText()));
			for (int i = 0; i < m[1].size(); i++) {
	            int a = Integer.parseInt(m[1].get(i));
	            
	            if (a == Integer.parseInt(g1.getText())) {
	    			g1.setFill(Color.BLUEVIOLET);
	    		} else if (a == Integer.parseInt(g2.getText())) {
	    			g2.setFill(Color.BLUEVIOLET);
	    		} else if (a == Integer.parseInt(g3.getText())) {
	    			g3.setFill(Color.BLUEVIOLET);
	    		} else if (a == Integer.parseInt(g4.getText())) {
	    			g4.setFill(Color.BLUEVIOLET);
	    		} else if (a == Integer.parseInt(g5.getText())) {
	    			g5.setFill(Color.BLUEVIOLET);
	    		} else if (a == Integer.parseInt(g6.getText())) {
	    			g6.setFill(Color.BLUEVIOLET);
	    		} else if (a == Integer.parseInt(g7.getText())) {
	    			g7.setFill(Color.BLUEVIOLET);
	    		} else if (a == Integer.parseInt(g8.getText())) {
	    			g8.setFill(Color.BLUEVIOLET);
	    		} else if (a == Integer.parseInt(g9.getText())) {
	    			g9.setFill(Color.BLUEVIOLET);
	    		} else if (a == Integer.parseInt(g10.getText())) {
	    			g10.setFill(Color.BLUEVIOLET);
	    		} else if (a == Integer.parseInt(g11.getText())) {
	    			g11.setFill(Color.BLUEVIOLET);
	    		} else if (a == Integer.parseInt(g12.getText())) {
	    			g12.setFill(Color.BLUEVIOLET);
	    		}
	        }

		}
		
	}
	
	@FXML
	void reiniciar(ActionEvent event) {
		inicio.clear();
		fin.clear();
		g1.setFill(Color.BLACK);
		g2.setFill(Color.BLACK);
		g3.setFill(Color.BLACK);
		g4.setFill(Color.BLACK);
		g5.setFill(Color.BLACK);
		g6.setFill(Color.BLACK);
		g7.setFill(Color.BLACK);
		g8.setFill(Color.BLACK);
		g9.setFill(Color.BLACK);
		g10.setFill(Color.BLACK);
		g11.setFill(Color.BLACK);
		g12.setFill(Color.BLACK);
		estado.setVisible(false);
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		init();
		bfs();

	}

}
