package graph;

import java.util.ArrayList;

// import Matrix.Add_2Darray;

public class Adjacent_List {
    public static void main(String[] args) {
    ArrayList<ArrayList<Integer>>adj= new ArrayList<ArrayList<Integer>>();
    int V=5;
    for(int i=0;i<V;i++){
        adj.add(new ArrayList<Integer>());
    }
    add_Edges(adj,0,1);
    add_Edges(adj,0,2);
    add_Edges(adj,1,3);
    add_Edges(adj,2,4);
    // add_Edges(adj,3,5);
    print_graph(adj);
    }
    static void add_Edges(ArrayList<ArrayList<Integer>> adj,int u,int v){
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
}
