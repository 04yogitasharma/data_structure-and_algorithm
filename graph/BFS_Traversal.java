package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_Traversal {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        int V=5;
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<Integer>());
        }
        add_Edges(adj,0,1);
        add_Edges(adj,0,2);
        add_Edges(adj,1,3);
        add_Edges(adj,2,4);
        bfs_traversal(adj,V);
        // print_graph(adj);
    }
    public static void add_Edges(ArrayList<ArrayList<Integer>>adj,int u,int v){
         adj.get(u).add(v);
         adj.get(v).add(u);
    }
    static void print_graph(ArrayList<ArrayList<Integer>>adj){
        for(int i=0;i<adj.size();i++){
            for(int j=0;j<adj.get(i).size();j++){
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    static void bfs_traversal(ArrayList<ArrayList<Integer>>adj,int V){
        //  ArrayList<Integer>list=new ArrayList<>();
         Queue<Integer> q=new LinkedList<>();
         q.add(0);
         boolean visited[]=new boolean[V+1];
         visited[0]=true;
         while(q.isEmpty()==false){
            int u=q.poll();
            System.out.print(u+" ");
            for(int v:adj.get(u)){
               if(visited[v]==false){
                visited[v]=true;
                q.add(v);
               }
            }
         }
    }
}
