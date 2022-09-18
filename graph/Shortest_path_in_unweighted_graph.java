package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Shortest_path_in_unweighted_graph {
    public static void main(String[] args) {
        int V=4;
        ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<Integer>());
        }        
        add_Edges(adj,0,1);
        add_Edges(adj,1,2);
        add_Edges(adj,2,3);
        add_Edges(adj,0,2);
        add_Edges(adj, 1, 3);
        int[]dist=new int[V];
        for(int i=0;i<V;i++){
            dist[i]=Integer.MAX_VALUE;
        }
        dist[0]=0;
        BFS(adj,V,0,dist);
        for(int i=0;i<V;i++){
            System.out.print(dist[i]+" ");
        }

    }
    static void add_Edges(ArrayList<ArrayList<Integer>>adj,int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    static void BFS(ArrayList<ArrayList<Integer>>adj,int V,int s,int[] dist){
        boolean[] visited=new boolean[V];
        for(int i=0;i<V;i++){
            visited[i]=false;
        }
        Queue<Integer>q=new LinkedList<>();
        visited[s]=true;
        q.add(s);
        while(q.isEmpty()==false){
            int u=q.poll();
            for(int v:adj.get(u)){
                if(visited[v]==false){
                    dist[v]=dist[u]+1;
                    visited[v]=true;
                    q.add(v);
                }
            }
        }
    }
}
