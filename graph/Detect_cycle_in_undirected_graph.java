package graph;

import java.util.ArrayList;

public class Detect_cycle_in_undirected_graph {
    public static void main(String[] args) {
        int V=6;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<Integer> ());
        }
        add_Edges(adj,0,1);
        add_Edges(adj,1,2);
        add_Edges(adj,2,4);
        add_Edges(adj,4,5);
        add_Edges(adj,1,3);
        add_Edges(adj,2,3);

        if(DFS(adj,V)==true){
            System.out.println("Cycle found");
        }
        else{
            System.out.println("No cycle found");
        }
    }
    static void add_Edges(ArrayList<ArrayList<Integer>>adj,int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    static boolean DFS(ArrayList<ArrayList<Integer>>adj,int V){
        boolean []visited=new boolean[V];
        for(int i=0;i<V;i++){
            visited[i]=false;
        }
        for(int i=0;i<V;i++){
            if(visited[i]==false){
                if(DFSRec(adj,i,visited,-1)==true){
                    return true;
                }
            }
        }
        return false;
    }
    static boolean DFSRec(ArrayList<ArrayList<Integer>>adj,int s,boolean[] visited,int parent){
        visited[s]=true;
        for(int u:adj.get(s)){
            if(visited[u]==false){
                if(DFSRec(adj, u, visited, s)==true){
                    return true;
                }
            }
            else if(u!=parent){
                return true;
            }
        }
        return false;
    }
}
