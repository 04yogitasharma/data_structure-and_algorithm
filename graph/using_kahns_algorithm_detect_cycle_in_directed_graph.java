package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class using_kahns_algorithm_detect_cycle_in_directed_graph {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>();
        int V=5;
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<Integer>());
        }

        add_Edge(adj,0,1);
        add_Edge(adj,4,1);
        add_Edge(adj,1,2);
        add_Edge(adj,2,3);
        add_Edge(adj,1,3);

        topologicalSort(adj,V);
    }
    static void add_Edge(ArrayList<ArrayList<Integer>>adj,int u,int v){
        adj.get(u).add(v);
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
        int count=0;
        while(q.isEmpty()==false){
            int u=q.poll();

            for(int x:adj.get(u)){
                if(--in_degree[x]==0){
                    q.add(x);
                }
            }
            count++;
        }
        if(count!=V){
            System.out.println("cycle found");
        }
        else{
            System.out.println("No cycle found");
        }
    }
}
