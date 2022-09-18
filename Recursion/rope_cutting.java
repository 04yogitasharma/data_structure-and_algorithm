package Recursion;

public class rope_cutting {
    static int maxPiece(int n,int a ,int b,int c){
        if(n==0){
            return 0;
        }
        if(n<0){
            return -1;
        }
        int res=Math.max(maxPiece(n-a,a,b,c),
                Math.max(maxPiece(n-b, a, b, c),
                maxPiece(n-c, a, b, c)));

        if(res==-1){
            return -1;
        }
        return res+1;
    }
    public static void main(String[] args) {
       int c=maxPiece(9,2,2,2);
       System.out.println(c);
    }
}
