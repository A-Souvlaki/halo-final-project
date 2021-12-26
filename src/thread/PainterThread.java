package thread;

import java.util.ArrayList;

import controller.BFSController;
import javafx.application.Platform;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import model.BFS;

public class PainterThread extends Thread {

	private BFS bf;

	private BFSController controller;

	private Text g1;

	private Text g2;

	private Text g3;

	private Text g4;

	private Text g5;

	private Text g6;

	private Text g7;

	private Text g8;

	private Text g9;

	private Text g10;

	private Text g11;

	private Text g12;

	private TextField inicio;

	private TextField fin;
	
	private Label estado;
	
	private int limite;

	int k;
	
	

	public PainterThread(BFS bf, BFSController controller, Text g1, Text g2, Text g3, Text g4, Text g5, Text g6,
			Text g7, Text g8, Text g9, Text g10, Text g11, Text g12, TextField inicio, TextField fin,int limite,Label estado) {

		this.bf = bf;
		this.controller = controller;
		this.g1 = g1;
		this.g2 = g2;
		this.g3 = g3;
		this.g4 = g4;
		this.g5 = g5;
		this.g6 = g6;
		this.g7 = g7;
		this.g8 = g8;
		this.g9 = g9;
		this.g10 = g10;
		this.g11 = g11;
		this.g12 = g12;
		this.inicio = inicio;
		this.fin = fin;
		
		this.limite = limite;
		this.estado = estado;

		k = 0;
	}

	public void paint() {
		@SuppressWarnings("unchecked")
		ArrayList<String>[] m = new ArrayList[2];
		m = bf.bfs(Integer.parseInt(inicio.getText()), Integer.parseInt(fin.getText()));
		
		String[] numeros = m[0].get(k).split(":");
		int a = Integer.parseInt(numeros[0]);
		int b = Integer.parseInt(numeros[1]);

		if (a == Integer.parseInt(g1.getText())) {
			g1.setFill(Color.RED);
		} else if (a == Integer.parseInt(g2.getText())) {
			g2.setFill(Color.RED);
		} else if (a == Integer.parseInt(g3.getText())) {
			g3.setFill(Color.RED);
		} else if (a == Integer.parseInt(g4.getText())) {
			g4.setFill(Color.RED);
		} else if (a == Integer.parseInt(g5.getText())) {
			g5.setFill(Color.RED);
		} else if (a == Integer.parseInt(g6.getText())) {
			g6.setFill(Color.RED);
		} else if (a == Integer.parseInt(g7.getText())) {
			g7.setFill(Color.RED);
		} else if (a == Integer.parseInt(g8.getText())) {
			g8.setFill(Color.RED);
		} else if (a == Integer.parseInt(g9.getText())) {
			g9.setFill(Color.RED);
		} else if (a == Integer.parseInt(g10.getText())) {
			g10.setFill(Color.RED);
		} else if (a == Integer.parseInt(g11.getText())) {
			g11.setFill(Color.RED);
		} else if (a == Integer.parseInt(g12.getText())) {
			g12.setFill(Color.RED);
		}

		if (b == Integer.parseInt(g1.getText())) {
			g1.setFill(Color.RED);
		} else if (b == Integer.parseInt(g1.getText())) {
			g2.setFill(Color.RED);
		} else if (b == Integer.parseInt(g3.getText())) {
			g3.setFill(Color.RED);
		} else if (b == Integer.parseInt(g4.getText())) {
			g4.setFill(Color.RED);
		} else if (b == Integer.parseInt(g5.getText())) {
			g5.setFill(Color.RED);
		} else if (b == Integer.parseInt(g6.getText())) {
			g6.setFill(Color.RED);
		} else if (b == Integer.parseInt(g7.getText())) {
			g7.setFill(Color.RED);
		} else if (b == Integer.parseInt(g8.getText())) {
			g8.setFill(Color.RED);
		} else if (b == Integer.parseInt(g9.getText())) {
			g9.setFill(Color.RED);
		} else if (b == Integer.parseInt(g10.getText())) {
			g10.setFill(Color.RED);
		} else if (b == Integer.parseInt(g11.getText())) {
			g11.setFill(Color.RED);
		} else if (b == Integer.parseInt(g12.getText())) {
			g12.setFill(Color.RED);
		}
		
		if (k < limite) {
			k++;
		}
		
		if (k == limite) {
			estado.setText("FINALIZADO");
		}

	}

	public void run() {
		int n = 0;
		while (n < limite) {
			Platform.runLater(new Runnable() {
				@Override
				public void run() {
					estado.setVisible(true);
					paint();
				}
			});
			n++;

			try {
				sleep(1000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
