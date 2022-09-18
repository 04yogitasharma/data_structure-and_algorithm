package Searching;

public class square_root {
    static int squareRoot(int x){
        int low=0;
        int high=x;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            int sq=mid*mid;
            if(sq==x){
                return mid;
            }
            else if(sq>x){
               high=mid-1;
            }
            else{
                low=mid+1;
                ans=mid;
                System.out.println(ans);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int c=squareRoot(36);
        System.out.println(c);
    }
}
