package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_Find_no_of_island {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>();
        int V=7;
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<Integer>());
        }
        add_Edges(adj,0,1);
        add_Edges(adj,0,2);
        add_Edges(adj,2,3);
        add_Edges(adj,1,3);
        add_Edges(adj,4,5);
        add_Edges(adj,5,6);
        add_Edges(adj,4,6);
        System.out.println(BFS_Din(adj,V)); 
    }
    static void add_Edges(ArrayList<ArrayList<Integer>>adj,int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    static int  BFS_Din(ArrayList<ArrayList<Integer>>adj,int V){
        boolean[] visited=new boolean[V];
        int count=0;
        for(int i=0;i<V;i++){
            visited[i]=false;
        }
        for(int i=0;i<V;i++){
            if(visited[i]==false){
                BFS(adj,i,visited);
                count++;
            }
        }
        return count;
    }
    static void BFS(ArrayList<ArrayList<Integer>>adj,int i,boolean[]visited){
        Queue<Integer>q=new LinkedList<>();
        visited[i]=true;
        q.add(i);
        while(q.isEmpty()==false){
            int u=q.poll();
            for(int v:adj.get(u)){
                if(visited[v]==false){
                    visited[v]=true;
                    q.add(v);
                }
            }
        }
    }

}
