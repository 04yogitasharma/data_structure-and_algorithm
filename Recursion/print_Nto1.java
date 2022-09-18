package Recursion;

public class print_Nto1 {
    static void fun(int a){
        if(a==0){
            return;
        }
        System.out.println(a);
        fun(a-1);
    }
    public static void main(String[] args) {
        int n=5;
        fun(n);
    }
}
