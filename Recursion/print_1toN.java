package Recursion;

public class print_1toN {
    static void fun(int a){
        if(a==0){
            return;
        }
        fun(a-1);
        System.out.println(a);
    }
    public static void main(String[] args) {
        int n=5;
        fun(n);
    }
}
