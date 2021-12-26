package model;

import java.util.*;

public class BFS {
	private final int MAX = 500;
	private int ady[][] = new int[MAX][MAX];
	private int V, E, prev[] = new int[MAX];
	private ArrayList<String> BFSTR;
	private ArrayList<String>[] TR = new ArrayList[2];

	public ArrayList<String>[] bfs(int nRaiz, int nFinal) {
		BFSTR = new ArrayList<>();
		String tr = "";
		int ini, fin, max = 0, actual;
		boolean visitado[] = new boolean[MAX];
		Arrays.fill(visitado, false);
		ini = nRaiz;
		fin = nFinal;
		prev[ini] = -1;
		visitado[ini] = true;
		Queue<Integer> Q = new Queue<Integer>();
		Q.add(ini);
		while (!Q.isEmpty()) {
			max = Math.max(max, Q.size());
			actual = Q.poll();
			if (actual == fin)
				break;
			for (int i = 1; i <= V; ++i) {
				int v = ady[actual][i];
				if (v != 0 && !visitado[i]) {
					tr = actual + ":" + i;
					BFSTR.add(tr);
					prev[i] = actual;
					visitado[i] = true;
					Q.add(i);
				}
			}
		}
		TR[0] = BFSTR;
		TR[1] = PrintRecorrido(ini, fin);
		return TR;

	}

	public ArrayList<String> PrintRecorrido(int ini, int fin) {
		ArrayList<String> TR = new ArrayList<>();
		List<Integer> path = new ArrayList<Integer>();
		String TR2 = "";
		String TR3 = "";
		for (;;) {
			path.add(fin);
			if (prev[fin] == -1)
				break;
			fin = prev[fin];
		}

		for (int i = path.size() - 1, k = 0; i >= 0; --i) {
			if (k != 0) {

			}
			TR3 = path.get(i) + "";
			k = 1;
			TR.add(TR3);
		}

		return TR;
	}

	public void setV(int v) {
		V = v;
	}

	public void setE(int e) {
		E = e;
	}

	public void addEdge(int a, int b) {
		ady[a][b] = 1;
		ady[b][a] = 1;
	}

}