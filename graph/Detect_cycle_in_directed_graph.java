package graph;

import java.util.ArrayList;


public class Detect_cycle_in_directed_graph {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>();
        int V=6;
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<Integer>());
        }
        // add_Edges(adj,0,1);
        // add_Edges(adj,1,2);
        // add_Edges(adj,3,1);
        // add_Edges(adj,3,2);


        add_Edge(adj,0,1); 
        add_Edge(adj,2,1); 
        add_Edge(adj,2,3); 
        add_Edge(adj,3,4); 
        add_Edge(adj,4,5);
        add_Edge(adj,5,3);
		
        if(DFS(adj,V)==true){
            System.out.println("cycle found");
        }
        else{
            System.out.println("No cycle found");
        }
    }
    public static void add_Edge(ArrayList<ArrayList<Integer>>adj,int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
   }
   static boolean DFS(ArrayList<ArrayList<Integer>>adj,int V){
    boolean visited[]=new boolean[V];
    boolean recst[]=new boolean[V];  //recursive stack
    for(int i=0;i<V;i++){
        if(visited[i]==false){
            if(visited[i]==false&&DFSRec(adj,i,visited,recst)==true){
                  return true;
            }
        }
    }
        return false;
   }
    static boolean DFSRec(ArrayList<ArrayList<Integer>>adj,int s,boolean[] visited,boolean[] recst){
         visited[s]=true;
         recst[s]=true;
         for(int u:adj.get(s)){
            if(visited[u]==false){
                if(DFSRec(adj, u, visited, recst)==true){
                    return true;
                }
            }
            else if(recst[u]==true){
                return true;
            }
         }
         recst[s]=false;
         return false;
    }
}
