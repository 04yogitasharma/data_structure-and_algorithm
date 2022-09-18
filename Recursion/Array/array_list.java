package Array;

import java.util.ArrayList;

public class array_list {
    public static void main(String[] args) {
        //DYNAMIC SIZE ARRAY
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(34);
        al.add(44);
        al.add(54);
        al.add(64);
        al.add(74);
        System.out.println(al);
        al.remove(2);
        System.out.println(al);
        al.add(1, 45);
        System.out.println(al);
        // al.clear();
        System.out.println(al);
        al.size();
        System.out.println(al);
        

        
    }
}
