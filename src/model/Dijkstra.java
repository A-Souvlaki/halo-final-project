package model;

import java.util.*;

public class Dijkstra {
	public final int MAX = 10005; 
	public final int INF = 1 << 30; 
									

	public List<List<Node>> ady = new ArrayList<List<Node>>(); 
	public int distancia[] = new int[MAX]; 
	public boolean visitado[] = new boolean[MAX];
	public PriorityQueue<Node> Q = new PriorityQueue<Node>();
	public int V;
	public int previo[] = new int[MAX];
	public boolean dijkstraEjecutado;
	private ArrayList<String> tosave;

	public Dijkstra(int V) {
		this.V = V;
		for (int i = 0; i <= V; ++i)
			ady.add(new ArrayList<Node>());
		dijkstraEjecutado = false;
	}

	public void init() {
		for (int i = 0; i <= V; ++i) {
			distancia[i] = INF;
			visitado[i] = false;
			previo[i] = -1;
		}
	}


	public void relajacion(int actual, int adyacente, int peso) {
		if (distancia[actual] + peso < distancia[adyacente]) {
			distancia[adyacente] = distancia[actual] + peso; 
			previo[adyacente] = actual; 
			Q.add(new Node(adyacente, distancia[adyacente])); 
		}
	}

	public String dijkstra(int inicial) {
		tosave = new ArrayList<>();
		init(); 
		Q.add(new Node(inicial, 0)); 
		distancia[inicial] = 0; 
		int actual, adyacente, peso;
		while (!Q.isEmpty()) {
			actual = Q.element().first; 
			Q.remove(); 
			if (visitado[actual])
				continue; 
			visitado[actual] = true; 

			for (int i = 0; i < ady.get(actual).size(); ++i) { 
				adyacente = ady.get(actual).get(i).first;
				peso = ady.get(actual).get(i).second; 
				if (!visitado[adyacente]) {
					relajacion(actual, adyacente, peso); 
				}
			}
		}

		String TR1 = "Inicio: " + inicial + "\n";
		String TR2 = "";
		for (int i = 1; i <= V; ++i) {
			TR2 += "Hasta: " + i + " SP: " + distancia[i] + "\n";
		}
		dijkstraEjecutado = true;
		return TR1 + TR2;
	}

	public void addEdge(int origen, int destino, int peso, boolean dirigido) {
		ady.get(origen).add(new Node(destino, peso)); 
		if (!dirigido)
			ady.get(destino).add(new Node(origen, peso)); 
	}

	public ArrayList<String> getPrinted() {
		return tosave;
		
	}

	public void print(int destino) {
		if (previo[destino] != -1) {
			print(previo[destino]);
		}
		tosave.add("" + destino);
	}

	public int getNumberOfVertices() {
		return V;
	}

	public void setNumberOfVertices(int numeroDeVertices) {
		V = numeroDeVertices;
	}
}
