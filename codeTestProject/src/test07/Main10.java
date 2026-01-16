package test07;

import java.io.*;
import java.util.*;

public class Main10 {

	Node root;

	public int BFS(Node root) {
		int L = 0;

		Deque<Node> Q = new ArrayDeque<>();
		Q.offer(root);

		while (!Q.isEmpty()) {
			int len = Q.size();

			for (int i = 0; i < len; i++) {
				Node x = Q.poll();
				if (x.lt == null && x.rt == null) {
					return L;
				}
				
				Q.offer(x.lt);
				Q.offer(x.rt);
			}

			L++;
		}

		return L;

	}

	public static void main(String[] args) {
		Main10 tree = new Main10();
		tree.root = new Node(1);

		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);

		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);

		System.out.println(tree.BFS(tree.root));
	}

}
