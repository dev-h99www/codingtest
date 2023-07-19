package me.h9w.algorithm.graph;

import java.util.ArrayList;

public class DFS {

    public static boolean[] visited = new boolean[9];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    public static void dfs(int x) {

        visited[x] = true;
        System.out.print(x + " ");
        for(int i = 0; i < graph.get(x).size(); i++) {
            int y = graph.get(x).get(i);
            if(!visited[y]) dfs(y);
        }
    }

    public static void main(String[] args) {
        DFS dfs = new DFS();
        for(boolean isvisited : visited) {
            System.out.println(isvisited);
        }
    }
}
