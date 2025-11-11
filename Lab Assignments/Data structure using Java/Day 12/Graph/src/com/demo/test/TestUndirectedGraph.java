package com.demo.test;

import com.demo.graph.UndirectedGraph;

public class TestUndirectedGraph {
	
	public static void main(String[]args) {
		int V=5;
		int E=7;
		UndirectedGraph G= new UndirectedGraph(V,E);
		System.out.println(G.toString());
	
}
}