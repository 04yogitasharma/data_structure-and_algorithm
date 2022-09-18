package graph;

import java.util.ArrayList;

public class DFS_Traversal {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>();
        int V=5;
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<Integer>());
        }
        add_Edges(adj,0,1);
        add_Edges(adj,0,2);
        add_Edges(adj,1,3);
        add_Edges(adj,2,4);
        dfs_traversal(adj,V,0);
    }
    static void add_Edges(ArrayList<ArrayList<Integer>>adj,int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    static void dfs_traversal(ArrayList<ArrayList<Integer>>adj,int V,int source){
        boolean[] visited=new boolean[V];
        for(int i=0;i<V;i++){
            visited[i]=false;
        }
        DFS_Rec(adj,source,visited);
    }
    static void DFS_Rec(ArrayList<ArrayList<Integer>>adj,int source,boolean visited[] ){
        visited[source]=true;
        System.out.print(source+" ");
        for(int u:adj.get(source)){
            if(visited[u]==false){
                DFS_Rec(adj, u, visited);
            }
        }
    }
}
