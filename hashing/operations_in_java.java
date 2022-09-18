package hashing;

import java.util.ArrayList;
import java.util.LinkedList;
class myHash{
    int BUCKET;
    ArrayList<LinkedList<Integer>>table;
    myHash(int b){
        BUCKET=b;
        table=new ArrayList<LinkedList<Integer>>();
        for(int i=0;i<b;i++){
            table.add(new LinkedList<Integer>());
        }
    }
        void insert(Integer key){
            int i=key%BUCKET;
            table.get(i).add(key);
        }
        void remove(Integer key){
            int i=key%BUCKET;
            table.get(i).remove(key);
        }
        boolean search(Integer key){
            int i=key%BUCKET;
            return table.get(i).contains(key);
        }
    }

public class operations_in_java {
    public static void main(String[] args) {
        myHash mh=new myHash(4);
        mh.insert(10);
        mh.insert(20);
        mh.insert(30);
        mh.insert(5);
        // System.out.println(mh);
        System.out.println(mh.search(30));
        mh.remove(5);
        System.out.println(mh.search(5));

    }
}
