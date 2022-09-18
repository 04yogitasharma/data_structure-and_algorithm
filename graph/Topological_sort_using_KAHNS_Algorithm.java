package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Topological_sort_using_KAHNS_Algorithm {
    public static void main(String[] args) {
        int V = 5; 
		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V); 
		
		for (int i = 0; i < V; i++) 
			adj.add(new ArrayList<Integer>()); 

			addEdge(adj,0, 2); 
            addEdge(adj,0, 3); 
            addEdge(adj,1, 3); 
            addEdge(adj,1, 4); 
            addEdge(adj,2, 3);
		
		System.out.println("Following is a Topological Sort of"); 
        topologicalSort(adj,V);
    }
    public static void addEdge(ArrayList<ArrayList<Integer>>adj,int u,int v){
        adj.get(u).add(v);
        // adj.get(v).add(u);
   }
    static void topologicalSort(ArrayList<ArrayList<Integer>>adj,int V){
        int[] in_degree=new int[V];
        for(int i=0;i<V;i++){
            for(int x:adj.get(i)){
                in_degree[x]++;
            }
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(in_degree[i]==0){
                q.add(i);
            }
        }
        
        while(q.isEmpty()==false){
            int u=q.poll();
            System.out.print(u+" ");
            for(int x:adj.get(u)){
                if(--in_degree[x]==0){
                    q.add(x);
                }
            }
        }

    } 
}
